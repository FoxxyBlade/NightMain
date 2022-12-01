package com.foxdev.nightmain.Punish;

import dev.triumphteam.gui.builder.item.ItemBuilder;
import dev.triumphteam.gui.guis.Gui;
import dev.triumphteam.gui.guis.GuiItem;
import net.kyori.adventure.text.Component;
import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.Date;

public class PunishCMD implements CommandExecutor {
    Gui gui = Gui.gui()
            .title(Component.text(ChatColor.BLUE + "Punish"))
            .rows(6)
            .disableAllInteractions()
            .create();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Calendar calPerm = Calendar.getInstance();
        calPerm.add(Calendar.YEAR, 99);
        Calendar cal2 = Calendar.getInstance();
        cal2.add(Calendar.DAY_OF_WEEK, 2);
        Calendar cal3 = Calendar.getInstance();
        cal3.add(Calendar.DAY_OF_WEEK, 3);
        Calendar cal4 = Calendar.getInstance();
        cal4.add(Calendar.DAY_OF_WEEK, 4);
        Calendar cal5 = Calendar.getInstance();
        cal4.add(Calendar.DAY_OF_WEEK, 5);
        Calendar cal7 = Calendar.getInstance();
        cal7.add(Calendar.DAY_OF_WEEK, 7);

        Player p = (Player) sender;
        Player target = Bukkit.getPlayer(args[0]);
        GuiItem Hacker = null;

            Hacker = ItemBuilder.from(Material.PAPER).name(Component.text(ChatColor.GOLD + "Hacken")).asGuiItem(event -> {

                target.kickPlayer("U bent verbannen!\n " + ChatColor.BLUE + "Reden: U bent aan het hacken");
                Bukkit.getBanList(BanList.Type.NAME).addBan(target.getName(), "U bent verbannen door Hacken!", cal7.getTime(), null);
                p.sendMessage(ChatColor.GOLD + "U heeft " + ChatColor.RED + target.getName() + ChatColor.GOLD + " Gebant");
            });


         GuiItem Abuse = ItemBuilder.from(Material.BARRIER).name(Component.text(ChatColor.BLUE + "Abuse!")).asGuiItem(event -> {
            target.kickPlayer("U bent verbannen  \n" + ChatColor.BLUE + "Reden: U bent aan het abusen!");
            Bukkit.getBanList(BanList.Type.NAME).addBan(target.getName(), "U bent verbannen door Abusen!", cal4.getTime(), null);

        });

        GuiItem Autoclicken = ItemBuilder.from(Material.NAME_TAG).name(Component.text(ChatColor.BLUE + "AutoClicker")).asGuiItem(event -> {

            target.kickPlayer("U bent verbannen \n" + ChatColor.BLUE + "Reden: U bent aan het autoclicken");
            Bukkit.getBanList(BanList.Type.NAME).addBan(target.getName(), "U bent verbannen door AutoClicker!!", cal2.getTime(), null);


        });

        GuiItem Grieven = ItemBuilder.from(Material.TNT).name(Component.text(ChatColor.BLUE + "Grieven" )).asGuiItem(event -> {
            target.kickPlayer("U bent verbannen \n" + ChatColor.BLUE + "Reden: U bent aan het grieven");
            Bukkit.getBanList(BanList.Type.NAME).addBan(target.getName(), "U bent verbannen door AutoClicker!!", cal7.getTime(), null);




        });
        GuiItem Xray = ItemBuilder.from(Material.DIAMOND_ORE).name(Component.text(ChatColor.BLUE + "Xray")).asGuiItem(event -> {

            target.kickPlayer("U bent verbannen \n" + ChatColor.BLUE + "Reden: Het gebruik van xray is niet toegestaan");
            Bukkit.getBanList(BanList.Type.NAME).addBan(target.getName(), "Gebruik maken van xray", cal7.getTime(), null);


        });

        GuiItem Booten = ItemBuilder.from(Material.BARRIER).name(Component.text(ChatColor.BLUE + "Booten")).asGuiItem(event -> {

            target.kickPlayer("U bent verbannen \n" + ChatColor.BLUE + "Reden: Booten");
            Bukkit.getBanList(BanList.Type.IP).addBan(target.getName(), "Booten", calPerm.getTime(), null);


        });

        GuiItem DDossen = ItemBuilder.from(Material.BARRIER).name(Component.text(ChatColor.BLUE + "Ddos")).asGuiItem(event -> {

            target.kickPlayer("U bent verbannen \n" + ChatColor.BLUE + "Reden: DDossen");
            Bukkit.getBanList(BanList.Type.IP).addBan(target.getName(), "DDossen", calPerm.getTime(), null);


        });


        gui.setItem(0, Hacker);
        gui.setItem(1, Abuse);
        gui.setItem(2, Autoclicken);
        gui.setItem(3, Grieven);
        gui.setItem(4, Xray);
        gui.setItem(5, Booten);
        gui.setItem(6, DDossen);


        gui.open(p);


        return false;
    }
}
