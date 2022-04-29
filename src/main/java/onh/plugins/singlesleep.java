package onh.plugins;

import io.papermc.paper.event.player.PlayerDeepSleepEvent;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

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
}
