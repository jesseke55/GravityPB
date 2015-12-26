package net.gravitynetwork.gravitypb.arena;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2015, Experminator.
 */
public class Team {

    private String name;
    private ChatColor color;
    private List<Player> players;
    private Location spawnpoint;

    private Team() {
    }

    public Team(String name, ChatColor color) {
        this.name = name;
        this.color = color;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ChatColor getColor() {
        return color;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Location getSpawnpoint() {
        return spawnpoint;
    }

    public void setSpawnpoint(Location spawnpoint) {
        this.spawnpoint = spawnpoint;
    }
}
