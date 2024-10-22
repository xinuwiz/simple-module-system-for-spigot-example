package com.github.xinuwiz.spawners.module;

import org.bukkit.plugin.Plugin;

public abstract class Module implements OnceLifecycleModuleMethodsContext, ModuleDetailsContext {

    private final Plugin plugin;

    public Module(Plugin plugin) {
        this.plugin = plugin;
    }

    public Plugin getPlugin() {
        return plugin;
    }

}