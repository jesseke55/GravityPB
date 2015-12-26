package net.gravitynetwork.gravitypb.arena;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

/**
 * Copyright (c) 2015, Experminator.
 */
public class Arena {

    private int id;
    private Location[] arenaBounds;
    private Team red, blue;

    public Arena(int id) {
        this.id = id;
        this.red = new Team("Red", ChatColor.RED);
        this.blue = new Team("Blue", ChatColor.BLUE);
        this.arenaBounds = new Location[0];
    }

    public int getId() {
        return id;
    }

    public Team[] getTeams() {
        return new Team[]{red, blue};
    }

    public Location[] getArenaBounds() {
        return arenaBounds;
    }

    public Team getRed() {
        return red;
    }

    public Team getBlue() {
        return blue;
    }

    public void setArenaBounds(Location[] arenaBounds) {
        if (arenaBounds.length != 2) {
            throw new IllegalArgumentException("An arena cannot have more or less than two bounds.");
        }

        this.arenaBounds = arenaBounds;
    }

    public boolean hasPlayer(Player p) {
        for (Team team : new Team[]{red, blue}) {
            if (team.getPlayers().contains(p)) {
                return true;
            }
        }

        return false;
    }
}
