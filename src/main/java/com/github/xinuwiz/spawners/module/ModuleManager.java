package com.github.xinuwiz.spawners.module;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ModuleManager {

    private final ModuleLoader loader;
    private final Set<Module> modules;

    public ModuleManager() {
        this.loader = new ModuleLoader();
        this.modules = new HashSet<>();
    }

    public void setConfiguration(ModuleLoaderConfiguration configuration) {
        loader.setConfiguration(configuration);
    }

    public Optional<Module> getModule(String name) {
        return modules
                .stream()
                .filter(module -> module.getPlugin().getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public Set<Module> getModules() {
        return modules;
    }

    public void load() {
        final Set<Module> modules = loader.load();
        this.modules.addAll(modules);
    }
}