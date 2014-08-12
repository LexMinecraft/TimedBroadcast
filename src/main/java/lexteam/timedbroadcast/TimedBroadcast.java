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
