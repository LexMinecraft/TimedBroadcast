package lexteam.timedbroadcast;

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
    }
}
