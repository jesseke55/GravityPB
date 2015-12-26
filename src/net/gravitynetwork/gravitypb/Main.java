package net.gravitynetwork.gravitypb;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Copyright (c) 2015, Experminator.
 */
public class Main extends JavaPlugin {

    private static Plugin plugin;

    @Override
    public void onEnable() {
        Main.plugin = this;
    }

    @Override
    public void onDisable() {
        Main.plugin = null;
    }

    public static Plugin getPlugin() {
        return plugin;
    }
}
