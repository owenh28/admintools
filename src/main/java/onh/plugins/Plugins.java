package onh.plugins;

import onh.plugins.commands.beacon;
import onh.plugins.commands.beaconother;
import onh.plugins.commands.bitches;
import onh.plugins.commands.info;
import org.bukkit.plugin.java.JavaPlugin;
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
        getServer().getPluginManager().registerEvents(new singlesleep(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Goodbye, see everyone next time...");
    }

}
