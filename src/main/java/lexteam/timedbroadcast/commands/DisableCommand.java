package lexteam.timedbroadcast.commands;

import lexteam.timedbroadcast.TimedBroadcast;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DisableCommand implements CommandExecutor {
	
	private final TimedBroadcast plugin;
	
	public DisableCommand(TimedBroadcast plugin) {
		this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		boolean isPlayer = false;
		
		if (sender instanceof Player) {
            isPlayer = true;
        }
		sender.sendMessage("Disabled TimedBroadcast!");
		return true;
	}

}