package com.foxdev.nightmain.Rules;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SendMessage implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        Player p = (Player) sender;


        p.sendTitle(ChatColor.BLUE + "Rules", ChatColor.BLUE + "Kijk chat!");

        p.sendMessage(ChatColor.BLUE + "-x-");
        p.sendMessage(" ");
        p.sendMessage(ChatColor.WHITE + "Het gebruik van xray texture packs/shaders is verboden.");
        p.sendMessage(ChatColor.WHITE + "Het gebruik van hack clients is niet toegestaan.");
        p.sendMessage(ChatColor.WHITE + "Het is niet toegestaan om te schelden met ziektes.");
        p.sendMessage(ChatColor.WHITE + "Respecteer de staff en luister naar hun aanwijzingen.");
        p.sendMessage(ChatColor.WHITE + "Griefen is niet toegestaan,");
        p.sendMessage(ChatColor.WHITE + "Het gebruik van auto clicker is niet toegestaan.");
        p.sendMessage(ChatColor.WHITE + "Mensen bedreigen voor out of character doeleindes is verboden.");
        p.sendMessage(ChatColor.WHITE + "Het is niet niet toegestaan om ingame reclame te maken.");
        p.sendMessage(ChatColor.WHITE + "Jezelf hiden op dynmap is niet toegestaan");
        p.sendMessage(ChatColor.WHITE + "AFK Fishing is niet toegestaan, Je mag alleen de AutoFish mod gebruiken maar dan moet je aanspreekbaar blijven.");
        p.sendMessage(ChatColor.WHITE + "Dynmap campen mag niet.");
        p.sendMessage(" ");
        p.sendMessage(ChatColor.BLUE + "-x-");
        p.sendMessage(" ");
        p.sendMessage(ChatColor.BLUE + "Sneak Regels");
        p.sendMessage(ChatColor.WHITE + "Voor iedere attacker moeten er 2 defenders zijn.");
        p.sendMessage(ChatColor.WHITE + "Sneaks mogen van 09:00 tot 00:00");
        p.sendMessage(ChatColor.WHITE + "Een sneak duurt maximaal 30 minuten");
        p.sendMessage(ChatColor.WHITE + "Als de Aanvallende partij eerder van het land gaat is de sneak automatisch afgelopen.");
        p.sendMessage(ChatColor.WHITE + "Voor een sneak aanvraag moet je een ticket aanmaken (we reageren zo snel mogelijk).");
        p.sendMessage(ChatColor.WHITE + "Je mag niks grieven.");
        p.sendMessage(ChatColor.WHITE + "De verdedigende partij moet op hun land blijven.");
        p.sendMessage(ChatColor.WHITE + "De aanvallende partij moet vrij toegang kunnen krijgen tegen de verdedigende partij.");
        p.sendMessage(ChatColor.WHITE + "De verdedigende partij mag geen loot wegleggen enkel betere loot pakken voor in plaats van die slechtere");
        p.sendMessage(ChatColor.WHITE + "Uitloggen wanneer je weet dat er een sneak komt is verboden");
        p.sendMessage(ChatColor.WHITE + "Bij sneaks worden er geen bondgenoten geroepen om te helpen");
        p.sendMessage(ChatColor.WHITE + "Inloggen van de verdedigende partij wanneer de sneak is gecalled is verboden doe je dit wel wordt dit een kick");
        p.sendMessage(ChatColor.WHITE + "De verdedigende partij mag niet uitloggen.");
        p.sendMessage(ChatColor.WHITE + "Als kingdom mag je maximaal 3 sneaks per week gooien");
        p.sendMessage(ChatColor.WHITE + "Als je gesneakt bent kan je 24 uur lang niet gesneakt worden.");
        p.sendMessage( " ");


        return false;
    }
}