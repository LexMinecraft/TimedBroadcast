/**
 * Copyright 2014 by Lexteam and Contributors
 *
 * This work is licensed under the Creative Commons Attribution-ShareAlike 3.0 Unported License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 */
package lexteam.timedbroadcast.commands;

import java.util.ArrayList;
import java.util.List;

import lexteam.timedbroadcast.TimedBroadcast;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TimedBroadcastCommand implements CommandExecutor {
	
	private final TimedBroadcast plugin;
	
	public TimedBroadcastCommand(TimedBroadcast plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (args.length == 0) {
            this.printUsage(sender);
            return false;
        }
		
		if(args[0].equals("enable") && args.length == 1) {
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
		} else if(args[0].equals("disable") && args.length == 1) {
			if(!sender.hasPermission("timedbroadcast.disable") || !sender.hasPermission("timedbroadcast.both")) {
				sender.sendMessage(ChatColor.RED
	                    + "You don't have permission to disable TimedBroadcast!");
	            return false;
			} else {
				if(!plugin.getEnabled()) {
					sender.sendMessage(ChatColor.RED
		                    + "TimedBroadcast is already disabled!");
		            return false;
				} else {
					sender.sendMessage("Disabled TimedBroadcast!");
					return true;
				}
			}
		} else if(args[0].equals("add") && args.length == 2) {
			if(!sender.hasPermission("timedbroadcast.add")) {
				
			} else {
				
			}
		} else if(args[0].equals("removeall") && args.length == 1) {
			if(!sender.hasPermission("timedbroadcast.removeall")) {
				
			} else {
				
			}
		}
		
		return false;
	}
	
	public void printUsage(CommandSender sender) {
        List<String> usage = new ArrayList<String>();
        usage.add(ChatColor.YELLOW + "/timedbroadcast usage:");
        if (sender.hasPermission("timedbroadcast.enable")) {
            usage.add(ChatColor.AQUA
            		+ "/timedbroadcast enable"
            		+ ChatColor.RESET
                    + " - Enable TimedBroadcast.");
        }
        if (sender.hasPermission("timedbroadcast.disable")) {
            usage.add(ChatColor.AQUA
                    + "/timedbroadcast disable"
                    + ChatColor.RESET
                    + " - Disable TimedBroadcast.");
        }
        if (sender.hasPermission("timedbroadcast.add")) {
            usage.add(ChatColor.AQUA 
            		+ "/timedbroadcast add [text]" 
            		+ ChatColor.RESET
                    + " - Adds a phrase to the broadcast list.");
        }
        if (sender.hasPermission("timedbroadcast.removeall")) {
            usage.add(ChatColor.AQUA 
            		+ "/timedbroadcast removeall"
            		+ ChatColor.RESET
                    + " - Removes all phrases in the broadcast list.");
        }
        sender.sendMessage(usage.toArray(new String[usage.size()]));
    }

}
