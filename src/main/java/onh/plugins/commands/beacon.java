package onh.plugins.commands;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;

public class beacon implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player pSend = (Player) sender;
        if(command.getName().equalsIgnoreCase("beacon")){
            Firework fw = pSend.getWorld().spawn(pSend.getLocation(), Firework.class);
            FireworkMeta fwm = fw.getFireworkMeta();
            FireworkEffect effect = FireworkEffect.builder().withColor(Color.AQUA).with(FireworkEffect.Type.CREEPER).withFade(Color.FUCHSIA).withFlicker().build();
            fwm.addEffects(effect);
            fwm.setPower(5);
            fw.setFireworkMeta(fwm);


        }
        return false;
    }
}
