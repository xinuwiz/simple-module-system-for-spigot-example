package com.github.xinuwiz.spawners.module;

import java.io.File;
import java.util.Set;

public final class ModuleLoader {

    private ModuleLoaderConfiguration configuration;

    public ModuleLoader() {
    }

    public void setConfiguration(ModuleLoaderConfiguration configuration) {
        this.configuration = configuration;
    }

    public Set<Module> load() {
        // TODO
    }
}