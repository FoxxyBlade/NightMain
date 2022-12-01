package com.foxdev.nightmain.Freeze;

import com.foxdev.nightmain.NightMain;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.net.http.WebSocket;
import java.util.HashMap;

public class FreezeCommand implements CommandExecutor {

    NightMain plugin;

    public FreezeCommand(NightMain freeze) {
        plugin = freeze;
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length == 1) {
            String targetName = args[0];
            if (Bukkit.getOfflinePlayer(targetName).getPlayer() != null) {
                Player target = Bukkit.getPlayer(targetName);
                if (plugin.frozenPlayers.containsKey(target)) {
                    plugin.frozenPlayers.remove(target);
                } else {
                    plugin.frozenPlayers.put(target, target.getLocation().clone());
                }
            }
        }
        return false;
    }
}
