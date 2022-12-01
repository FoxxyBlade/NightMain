package com.foxdev.nightmain.Pvp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PvpOn implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;

        p.getWorld().setPVP(true);
        Bukkit.broadcastMessage(ChatColor.GREEN + "De pvp staat nu aan!");




        return false;
    }
}
