package me.Michel.OTC.Modules;

import me.Michel.OTC.Modules.Modules.baseModule;

import java.util.ArrayList;

public class ModuleManager {

    public static ArrayList<Module> modules = new ArrayList<Module>();

    public ModuleManager() {
        registerModule(new baseModule());
    }

    private void registerModule(Module module) {
        modules.add(module);
    }

    public void unregisterModule(Module module) {
        modules.remove(module);
    }

}
