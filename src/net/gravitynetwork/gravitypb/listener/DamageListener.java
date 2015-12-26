package net.gravitynetwork.gravitypb.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

/**
 * Copyright (c) 2015, Experminator.
 */
public class DamageListener implements Listener {

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Player) {
            Player damaged = (Player) e.getEntity();

            if (e.getDamager() instanceof Player) {
                Player damager = (Player) e.getDamager();

                // TODO: Check on same team and stop damage.
            }
        }
    }
}
