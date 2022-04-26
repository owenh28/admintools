package onh.plugins;

import onh.plugins.commands.beacon;
import onh.plugins.commands.beaconother;
import onh.plugins.commands.bitches;
import onh.plugins.commands.info;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Plugins extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic, write some stuff to the console
        getLogger().info("GOOD MORNING VIETNAM!!!!");
        getLogger().info("Owen's AdminTools has loaded successfully!");
        //Register command executors for all commands
        this.getCommand("adminfo").setExecutor(new info());
        this.getCommand("beacon").setExecutor(new beacon());
        this.getCommand("beaconother").setExecutor(new beaconother());
        this.getCommand("bitches").setExecutor(new bitches());
        //Single player sleep?

//        Server srv = getServer();
//        World wld = srv.getWorld("world");
//        Player[] onlp = srv.getOnlinePlayers().toArray(new Player[0]);
//        for(int i = 0; i < srv.getOnlinePlayers().size(); i++){
//            if(onlp[i].isSleeping()){
//                assert wld != null;
//                wld.setTime(6000);
//            }
//        }


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Goodbye, see everyone next time...");
    }
}
