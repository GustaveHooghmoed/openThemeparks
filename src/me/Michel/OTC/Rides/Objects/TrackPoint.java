package me.Michel.OTC.Rides.Objects;

import me.Michel.OTC.Core.Core;
import org.bukkit.Location;

public class TrackPoint {

    private double speed;
    private boolean active;
    private double x;
    private double y;
    private double z;
    private double pitch;
    private double yaw;
    private double roll;

    public TrackPoint(Location loc, double pitch, double yaw, double roll) {
        this.x = loc.getX();
        this.y = loc.getY();
        this.z = loc.getZ();
        this.pitch = pitch;
        this.yaw = yaw;
        this.roll = roll;
        this.speed = 5;
        this.active = false;
    }

    public TrackPoint(Location loc) {
        this.x = loc.getX();
        this.y = loc.getY();
        this.z = loc.getZ();
        this.pitch = 0;
        this.yaw = 0;
        this.roll = 0;
        this.speed = 5;
        this.active = false;
    }

    public TrackPoint(double x, double y, double z, double pitch, double yaw, double roll) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.pitch = pitch;
        this.yaw = yaw;
        this.roll = roll;
        this.speed = 5;
        this.active = false;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getPitch() {
        return pitch;
    }

    public void setPitch(double pitch) {
        this.pitch = pitch;
    }

    public double getYaw() {
        return yaw;
    }

    public void setYaw(double yaw) {
        this.yaw = yaw;
    }

    public double getRoll() {
        return roll;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Location toLocation() {
        return new Location(Core.getWorld(), this.x, this.y, this.z);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
