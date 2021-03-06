package me.Michel.OTC.Core;

import me.Michel.OTC.Modules.ModuleManager;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {


    public static Plugin plugin = null;
    public static ModuleManager moduleManager;
    public static World world = null;

    public static World getWorld() {
        return world;
    }

    @Override
    public void onEnable() {
        plugin = this;
        world = Bukkit.getWorld("wereld");
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
