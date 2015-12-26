package net.gravitynetwork.gravitypb.arena;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2015, Experminator.
 */
public class ArenaManager {

    private static List<Arena> arenas = new ArrayList<>();

    private ArenaManager() {
    }

    public static Arena addArena(Arena arena) {
        arenas.add(arena);
        return arena;
    }

    public static List<Arena> getArenas() {
        return arenas;
    }

    public static Arena getArena(int id) {
        for (Arena arena : arenas) {
            if (arena.getId() == id) {
                return arena;
            }
        }

        return null;
    }

    public static Arena getArena(Player p) {
        for (Arena arena : arenas) {
            for (Team team : arena.getTeams()) {
                if (team.hasPlayer(p)) {
                    return arena;
                }
            }
        }

        return null;
    }
}
