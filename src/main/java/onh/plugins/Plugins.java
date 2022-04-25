package onh.plugins;

import onh.plugins.commands.beacon;
import onh.plugins.commands.info;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Plugins extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("GOOD MORNING VIETNAM!!!!");
        getLogger().info("Owen's AdminTools has loaded successfully!");
        Objects.requireNonNull(this.getCommand("adminfo")).setExecutor(new info());
        Objects.requireNonNull(this.getCommand("beacon")).setExecutor(new beacon());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Goodbye, see everyone next time...");
    }
}
