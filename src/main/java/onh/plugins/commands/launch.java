package onh.plugins.commands;

import org.bukkit.Server;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.jetbrains.annotations.NotNull;
public class launch implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command may only be run by a player");
            return false;
        }
        //get the player
        Player sndPl = (Player) sender;
        sndPl.setInvisible(true);
        sndPl.setInvulnerable(true);
        //declare a block that is 9 blocks away from what the player is looking.
        Block block = sndPl.getTargetBlock(9);
        assert block != null;
        //make a new tntPrimed entity to spawn and blow up under the player. (Uses the block data that the player is looking at.)
        TNTPrimed ttt = sndPl.getWorld().spawn(block.getLocation().add(sndPl.getLocation().getX(), sndPl.getLocation().getY(), sndPl.getLocation().getZ()), TNTPrimed.class );

        ttt.setFuseTicks(0);

        sndPl.setInvisible(false);
        sndPl.setInvulnerable(false);

        return true;
    }

}
