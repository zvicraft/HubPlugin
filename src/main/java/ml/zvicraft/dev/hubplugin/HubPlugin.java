package ml.zvicraft.dev.hubplugin;

import ml.zvicraft.dev.hubplugin.lisiners.guimngers;
import ml.zvicraft.dev.hubplugin.utils.ColorUtils;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class HubPlugin extends JavaPlugin {
    public static HubPlugin plugin;
    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        Bukkit.getConsoleSender().sendMessage(ColorUtils.color(this.getConfig().getString("prefix") + "&athe plugin is enabled"));

        this.getConfig().options().copyDefaults(false);
        this.saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new guimngers(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
