package me.Michel.OTC.Modules.Modules;

import me.Michel.OTC.Modules.Module;
import me.Michel.OTC.Studios.Rides.IndianaJones.IndianaJones;

public class studioModule implements Module {

    @Override
    public void load() {
        new IndianaJones();
    }

    @Override
    public void unload() {

    }

}
