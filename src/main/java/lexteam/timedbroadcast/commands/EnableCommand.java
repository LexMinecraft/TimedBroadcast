/**
 * Copyright 2014 by Lexteam and Contributors
 *
 * This work is licensed under the Creative Commons Attribution-ShareAlike 3.0 Unported License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 */
package lexteam.timedbroadcast.commands;

import lexteam.timedbroadcast.TimedBroadcast;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EnableCommand implements CommandExecutor {
	
	private final TimedBroadcast plugin;
	
	public EnableCommand(TimedBroadcast plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!sender.hasPermission("timedbroadcast.enable") || !sender.hasPermission("timedbroadcast.both")) {
			sender.sendMessage(ChatColor.RED
                    + "You don't have permission to enable TimedBroadcast!");
            return false;
		} else {
			if(!plugin.getEnabled()) {
				sender.sendMessage(ChatColor.RED
	                    + "TimedBroadcast is already enabled!");
	            return false;
			} else {
				sender.sendMessage("Enabled TimedBroadcast!");
				return true;
			}
		}
	}

}
