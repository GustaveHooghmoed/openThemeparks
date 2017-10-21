package me.Michel.OTC.Studios.Rides.IndianaJones;

import me.Michel.OTC.Rides.Objects.Track.PathFactory;
import me.Michel.OTC.Rides.Objects.TrackPoint;

import java.util.ArrayList;

public class Track {

    private ArrayList<TrackPoint> points;

    public Track() {
        this.points = new ArrayList<TrackPoint>();
        load();
        calculator();
    }

    private void calculator() {
        this.setPoints(new PathFactory(this.getPoints()).calculate());
    }

    private void load() {
        a(0, 1, 0);
    }

    private void a(double x, double y, double z) {
        this.points.add(new TrackPoint(x, y, z, 0, 0, 0));
    }

    public ArrayList<TrackPoint> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<TrackPoint> points) {
        this.points = points;
    }
}
