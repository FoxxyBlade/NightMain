package com.foxdev.nightmain.events;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerLoginEvent event){
        if(event.getResult() == PlayerLoginEvent.Result.KICK_BANNED) {
                event.setKickMessage("§fReason §a'" + Bukkit.getBanList(BanList.Type.NAME).getBanEntry(event.getPlayer().getName()).getReason() + "'\n§fExpires in §a" + Bukkit.getBanList(BanList.Type.NAME).getBanEntry(event.getPlayer().getName()).getExpiration().toString());
                //event.disallow(PlayerJoinEvent.Result.KICK, "§fReason §a'" + Bukkit.getBanList(BanList.Type.NAME).getBanEntry(event.getName()).getReason() + "'\n§fExpires in §a" + Bukkit.getBanList(BanList.Type.NAME).getBanEntry(event.getName()).getExpiration().toString());
        }
    }

}
