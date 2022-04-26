package onh.plugins.commands;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;
import org.jetbrains.annotations.NotNull;

public class beaconother implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        //Get server and search for the player on the server
        Player sndPl = (Player) sender;
        Server server = sender.getServer();
        Player target = server.getPlayer(args[0]);
        assert target != null;
        Firework fw = target.getWorld().spawn(target.getLocation(), Firework.class);
        FireworkMeta fwm = fw.getFireworkMeta();
        FireworkEffect effect = FireworkEffect.builder().with(FireworkEffect.Type.CREEPER).withColor(Color.MAROON).flicker(true).withFade(Color.FUCHSIA).build();
        fwm.addEffects(effect);
        fwm.setPower(1);
            //Send firework
        fw.setFireworkMeta(fwm);
        sndPl.sendMessage("Player " + target.getName() + " has been shown.");
        return true;


    }
}
