package net.gravitynetwork.gravitypb;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Copyright (c) 2015, Experminator.
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    }

    private void initConfig(){


        getConfig().addDefault("Items.JoinLobby.About", "&aTutorial");
    }

    private void noWorldDL(){

    }
}
