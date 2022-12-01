package com.foxdev.nightmain.AntiTNT;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class AntiTntListener implements Listener {
    public static Material[] blacklist = {Material.TNT};

    @EventHandler
    public void onBLockPLace(BlockPlaceEvent e) {
        Material blockplaced = e.getBlock().getType();
        Player p = e.getPlayer();

        for(Material blockinblacklist : blacklist) {

            if(blockinblacklist == blockplaced) {

                Block eblock = e.getBlock();

                eblock.setType(Material.AIR);

                p.chat("I Just Attempted To Place " + blockinblacklist);
                p.kickPlayer("You Have Been Kicked For Placing A Banned Block!");

            }
        }
    }
}
