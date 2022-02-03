package com.globant.miguel.exercise1;

import com.globant.miguel.exercise1.exception.CreationalException;

public abstract class MusicPlayer {
    public abstract String getColor() throws CreationalException;
    public abstract int getBattery() throws CreationalException;
    public abstract int getStorage() throws CreationalException;

    @Override
    public String toString() {
        try {
            return "Color: "+this.getColor()+", Storage Capacity: "+this.getStorage()+"GB, Battery life: "+getBattery();
        } catch (CreationalException e) {
            e.printStackTrace();
        }
        return null;
    }
}
