/**
 * Copyright 2014 by Lexteam and Contributors
 *
 * This work is licensed under the Creative Commons Attribution-ShareAlike 3.0 Unported License.
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 */
package lexteam.timedbroadcast;

import lexteam.timedbroadcast.commands.DisableCommand;
import lexteam.timedbroadcast.commands.EnableCommand;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class TimedBroadcast extends JavaPlugin {

    @Override
    public void onDisable() {
    	PluginDescriptionFile dataFile = this.getDescription();
        getLogger().info(dataFile.getName() + " version " + dataFile.getVersion() + " is disabled!");
    }

    @Override
    public void onEnable() {
        PluginDescriptionFile dataFile = this.getDescription();
        getLogger().info(dataFile.getName() + " version " + dataFile.getVersion() + " is enabled!");
        
        // Register our commands
        getCommand("enabletb").setExecutor(new EnableCommand(this));
        getCommand("disabletb").setExecutor(new DisableCommand(this));
    }
}
