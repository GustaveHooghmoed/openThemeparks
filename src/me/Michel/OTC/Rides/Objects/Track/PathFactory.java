package me.Michel.OTC.Rides.Objects.Track;


import me.Michel.OTC.Rides.Objects.TrackPoint;
import toxi.geom.Spline3D;
import toxi.geom.Vec3D;

import java.util.ArrayList;

public class PathFactory {

    private final ArrayList<TrackPoint> points;
    private Spline3D spline;

    public PathFactory(ArrayList<TrackPoint> arrayList) {
        this.points = arrayList;
    }

    public ArrayList<TrackPoint> calculate() {

        ArrayList<TrackPoint> returne = new ArrayList<TrackPoint>();
        this.spline = new Spline3D();
        for (TrackPoint point : this.points) {
            spline.add((float) point.getX(), (float) point.getY(), (float) point.getZ());
        }
        this.spline.updateCoefficients();
        for (Vec3D vec : this.spline.getDecimatedVertices(0.05f)) {
            TrackPoint tp = new TrackPoint(vec.x, vec.y, vec.z, 0, 0, 0);
            returne.add(tp);
        }
        return returne;

    }

}
