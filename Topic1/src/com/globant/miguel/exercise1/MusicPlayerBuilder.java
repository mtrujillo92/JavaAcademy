package com.globant.miguel.exercise1;

public class MusicPlayerBuilder implements Builder {
    private Color color;
    private Storage storage;
    private Battery battery;

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "MusicPlayerBuilder{" +
                "color= " + color +
                ", storage= " + storage +
                ", battery= " + battery +
                '}';
    }
    public MusicPlayer getResult(){
        return new MusicPlayer(this.color,this.battery,this.storage);
    }
}
