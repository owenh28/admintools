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
        Player pSend = (Player) sender;
        Server server = pSend.getServer();
        if(command.getName().equalsIgnoreCase("adminfo")){
            pSend.sendMessage("Info:");
            pSend.sendMessage("AdminTools version is:");
            pSend.sendMessage(server.getName() + server.getWorlds());
            return true;
        }
        return false;
    }
}
