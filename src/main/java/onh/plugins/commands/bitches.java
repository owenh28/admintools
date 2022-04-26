package onh.plugins.commands;

import onh.plugins.Plugins;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class bitches implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player sndPl = (Player) sender;
        Server srv = sender.getServer();
        sndPl.setHealth(0);
        Player[] onlines = srv.getOnlinePlayers().toArray(new Player[0]);
        for(int i = 0; i < srv.getOnlinePlayers().size(); i++){
            onlines[i].sendMessage(sndPl.getName() + " has died due to no maidens... OOPS!");
        }
//            Player gunnar = srv.getPlayer("Guno327");
//            assert gunnar != null;
//            if(gunnar.isOnline()){
//                gunnar.setHealth(0);
//
//            }
        return true;


    }
}
