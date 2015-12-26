package net.gravitynetwork.gravitypb;


import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
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
        initConfig();
        noWorldDL();

    }

    @Override
    public void onDisable() {
        Main.plugin=null;
    }

    public static Plugin getPlugin(){
        return plugin;
    }

    private void initConfig(){


        getConfig().addDefault("Items.JoinLobby.About", "&aTutorial");
        getConfig().addDefault("noWorldDL", "&6I have the world download client option disabled for:&c %p &bThe player will maybe get banned because he received a warning about this after 3 times!");
    }

    private void noWorldDL(){
        final FileConfiguration config = Main.getPlugin().getConfig();
        Bukkit.getMessenger().registerOutgoingPluginChannel(this, "WDL|CONTROL");
        Bukkit.getMessenger().registerIncomingPluginChannel(this, "WDL|INIT", (s, player, bytes) -> {
            ByteArrayDataOutput out = ByteStreams.newDataOutput();
            out.writeInt(1);
            out.writeBoolean(false);
            out.writeInt(1);
            out.writeBoolean(false);
            out.writeBoolean(false);
            out.writeBoolean(false);
            out.writeBoolean(false);
            getLogger().info("Blocking WorldDownloader for " + player.getDisplayName());
            Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&',config.getString("noWorldDL").replace("%p", player.getName()) ));
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "warn " + player.getName() + " You are using a world DL client wich are not allowed and are blocked!");
            player.sendPluginMessage(this, "WDL|CONTROL", out.toByteArray());
        });
    }
}
