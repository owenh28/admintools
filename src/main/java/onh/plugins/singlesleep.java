package onh.plugins;

import io.papermc.paper.event.player.PlayerDeepSleepEvent;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class singlesleep implements Listener {

    @EventHandler
    public void onSleep(PlayerDeepSleepEvent event){
        Player sleepy = event.getPlayer();
        Server srv = sleepy.getServer();
        World world = sleepy.getWorld();
        Player[] onlinePlayers = world.getPlayers().toArray(new Player[0]);
        if(sleepy.isSleeping()) {
            for (Player onlinePlayer : onlinePlayers) {
                onlinePlayer.sendMessage(sleepy.getName() + " is sleeping, changing to day");
            }
            world.setTime(6000);
            world.setClearWeatherDuration(400);
        }
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player joiner = event.getPlayer();
        if(joiner.getName().equalsIgnoreCase("FastPizzaGuy")){
            joiner.sendMessage("Hello father");
        }
    }
    @EventHandler
    public void onDeath(PlayerDeathEvent event){
        Player dead = event.getPlayer();
        Player[] online = event.getPlayer().getServer().getOnlinePlayers().toArray(new Player[0]);
        for(Player onlinep : online){
            onlinep.sendMessage(dead.getName() + "Has been binted");
        }
    }
}
