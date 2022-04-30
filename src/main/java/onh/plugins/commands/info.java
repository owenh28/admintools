package onh.plugins.commands;

import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class info implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Server server = sender.getServer();
            //this is all garbage and useless
        sender.sendMessage("Info:");
        sender.sendMessage("AdminTools version is:");
        sender.sendMessage(server.getName() + server.getWorlds());
        return true;


    }
}
