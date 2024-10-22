package com.github.xinuwiz.spawners.module;

import java.io.File;

public final class ModuleLoaderConfigure {

    private ModuleLoaderConfiguration configuration;

    public ModuleLoaderConfigure() {
    }

    public ModuleLoaderConfigure(ModuleLoaderConfiguration configuration) {
        this.configuration = configuration;
    }

    public static ModuleLoaderConfigure configure() {
        return new ModuleLoaderConfigure();
    }

    public static ModuleLoaderConfigure configure(ModuleLoaderConfiguration configuration) {
        return new ModuleLoaderConfigure(configuration);
    }

    public ModuleLoaderConfigure folder(String path) {
        final File folder = new File(path);

        final boolean isFolder = folder.isDirectory();
        if (isFolder)
            configuration.setFolder(folder);
        else throw new IllegalArgumentException("Not a folder: " + path);

        return this;
    }

    public ModuleLoaderConfiguration build() {
        return configuration;
    }
}
