package com.github.xinuwiz.spawners.module;

import java.io.File;

public class ModuleLoaderConfiguration {

    private File folder;

    public ModuleLoaderConfiguration() {
    }

    public void setFolder(File folder) {
        this.folder = folder;
    }

    public File getFolder() {
        return folder;
    }
}