package me.Michel.OTC.Core;

import me.Michel.OTC.Modules.ModuleManager;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {


    public static Plugin plugin = null;
    public static ModuleManager moduleManager;

    @Override
    public void onEnable() {
        plugin = this;
        this.moduleManager = new ModuleManager();

    }

    @Override
    public void onDisable() {
        plugin = null;
    }

    public static Plugin getPlugin() {
        return plugin;
    }

    public static ModuleManager getModuleManager() {
        return moduleManager;
    }
}
