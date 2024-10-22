package com.github.xinuwiz.spawners;

import com.github.xinuwiz.spawners.message.MessageListener;
import com.github.xinuwiz.spawners.message.MessageService;
import com.github.xinuwiz.spawners.message.NullMessageService;
import com.github.xinuwiz.spawners.module.*;

import java.util.Optional;
import java.util.Set;
import java.util.logging.Logger;

public final class SpawnersContext {

    // Constant instance of Logger
    private static final Logger logger = Logger.getLogger("spawners");

    private static MessageService messageService = new NullMessageService();
    private static ModuleManager moduleManager = new ModuleManager();

    public static void setMessageService(MessageService service) {
        messageService = service;
    }

    public static <T> void send(T object) {
        if (messageService instanceof NullMessageService) {
            logger.warning("message service instance is NullMessageService");
            return;
        }

        if (object == null) {
            logger.warning("message object is null");
            return;
        }

        logger.info("Message sent: " + object.toString());
        messageService.send(object);
    }

    public static <T extends MessageListener> void register(T listener) {
        if (messageService instanceof NullMessageService) {
            logger.warning("message service instance is NullMessageService");
            return;
        }

        if (listener == null) {
            logger.warning("listener class is null");
            return;
        }

        logger.info("Listener registered");
        messageService.register(listener);
    }

    public static Optional<Module> getModule(String name) {
        return moduleManager.getModule(name);
    }

    public static Set<Module> getModules() {
        return moduleManager.getModules();
    }

    public static void load() {
        final ModuleLoaderConfiguration configuration = ModuleLoaderConfigure.configure().folder("modules").build();
        moduleManager.setConfiguration(configuration);
        moduleManager.load();
    }
}
