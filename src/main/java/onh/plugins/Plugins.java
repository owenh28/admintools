package onh.plugins;

import io.papermc.paper.event.player.PlayerDeepSleepEvent;
import onh.plugins.commands.beacon;
import onh.plugins.commands.beaconother;
import onh.plugins.commands.bitches;
import onh.plugins.commands.info;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.EventListener;
import java.util.Objects;

public final class Plugins extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic, write some stuff to the console
        getLogger().info("GOOD MORNING VIETNAM!!!!");
        getLogger().info("Owen's AdminTools has loaded successfully!");
        //Register command executors for all commands
        Objects.requireNonNull(this.getCommand("adminfo")).setExecutor(new info());
        Objects.requireNonNull(this.getCommand("beacon")).setExecutor(new beacon());
        Objects.requireNonNull(this.getCommand("beaconother")).setExecutor(new beaconother());
        Objects.requireNonNull(this.getCommand("bitches")).setExecutor(new bitches());



        //Single player sleep?
//        while(true) {
//
//            Server srv = getServer();
//
//            Player[] onlp = srv.getOnlinePlayers().toArray(new Player[0]);
//            for(int i = 0; i < srv.getOnlinePlayers().size(); i++){
//                if(onlp[i].isSleeping()){
//                    World wld = onlp[i].getWorld();
//                    wld.setTime(6000);
//                }
//            }
//        }


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Goodbye, see everyone next time...");
    }

}
