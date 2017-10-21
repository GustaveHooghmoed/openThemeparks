package me.Michel.OTC.Studios.Rides.IndianaJones;

import me.Michel.OTC.Rides.Enums.RideType;
import me.Michel.OTC.Rides.Objects.Ride;

public class IndianaJones implements Ride {

    private String ridenaam;
    private String ridewarp;
    private RideType type;
    private Track track;

    public IndianaJones() {
        this.ridenaam = "Indiana Jones";
        this.ridewarp = "iaj";
        this.type = RideType.DARKRIDE;
        this.track = new Track();
    }

    @Override
    public String getRidenaam() {
        return this.ridenaam;
    }

    @Override
    public String getRidewarp() {
        return this.ridewarp;
    }

    @Override
    public RideType getType() {
        return this.type;
    }
}
