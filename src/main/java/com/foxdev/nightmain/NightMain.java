package com.foxdev.nightmain;

import com.foxdev.nightmain.AntiTNT.AntiTntListener;
import com.foxdev.nightmain.Freeze.FreezeCommand;
import com.foxdev.nightmain.Punish.PunishCMD;
import com.foxdev.nightmain.Pvp.PvpOff;
import com.foxdev.nightmain.Pvp.PvpOn;
import com.foxdev.nightmain.Rules.SendMessage;
import com.foxdev.nightmain.events.JoinEvent;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class NightMain extends JavaPlugin implements Listener {

    public static NightMain Instance;
    public HashMap<Player, Location> frozenPlayers = new HashMap<>();



    @Override
    public void onEnable() {
        Instance = this;

        getCommand("regels").setExecutor(new SendMessage());
        getCommand("freeze").setExecutor(new FreezeCommand(this));
        getCommand("punish").setExecutor(new PunishCMD());
        getCommand("pvpon").setExecutor(new PvpOn());
        getCommand("pvpoff").setExecutor(new PvpOff());
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);

        getServer().getPluginManager().registerEvents(new AntiTntListener(), this);
        getServer().getPluginManager().registerEvents(this, this);
        // Plugin startup logic

    }
    @EventHandler
    public void onPlayerMoveBlock(PlayerMoveEvent e){
        if(!frozenPlayers.containsKey(e.getPlayer())){
            return;
        }
        if(e.getFrom().getBlockX() != e.getTo().getBlockX() || e.getFrom().getBlockZ() != e.getTo().getBlockZ()){
            e.getPlayer().teleport(frozenPlayers.get(e.getPlayer()));
        }
    }
}
