package net.gravitynetwork.gravitypb.listener;

import net.gravitynetwork.gravitypb.Main;
import net.gravitynetwork.gravitypb.utils.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.PlayerInventory;

/**
 * Copyright (c) 2015-2016, ProtocollWeb/jesseke55/Jesse.
 */
public class Join implements Listener {
     
    public void onJoin(PlayerJoinEvent e){
        // TODO: Add player to the team and customize the join message
        // TODO: for settings the player in that team but also a message with You are in RED or BLUE

        Player p = e.getPlayer();
        PlayerInventory pi = p.getInventory();

        pi.addItem(new ItemBuilder(Material.EMPTY_MAP).name(ChatColor.translateAlternateColorCodes('&', Main.getPlugin().getConfig().getString("Items.JoinLobby.About"))).getStack());


    }

}
