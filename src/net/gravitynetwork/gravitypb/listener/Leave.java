package net.gravitynetwork.gravitypb.listener;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Created by jesse on 26-12-15.
 */
public class Leave implements Listener {

    public void onQuit(PlayerQuitEvent e){
        //TODO: Remove player from team and broadcast a message that the player has left the game
    }
}
