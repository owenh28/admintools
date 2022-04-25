package onh.plugins;

import org.bukkit.plugin.java.JavaPlugin;

public final class Plugins extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("GOOD MORNING VIETNAM!!!!");
        getLogger().info("Owen's AdminTools has loaded successfully!");


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Goodbye, see everyone next time...");
    }
}
