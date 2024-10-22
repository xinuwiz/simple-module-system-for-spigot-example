package com.github.xinuwiz.spawners;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnersPlugin extends JavaPlugin {

    private static SpawnersPlugin instance;

    @Override
    public void onEnable() {

    }

    public static SpawnersPlugin getInstance() {
        return instance;
    }
}
