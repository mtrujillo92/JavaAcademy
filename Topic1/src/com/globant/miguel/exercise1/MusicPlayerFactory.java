package com.globant.miguel.exercise1;
import com.globant.miguel.exercise1.exception.CreationalException;

public class MusicPlayerFactory {
    public static MusicPlayer getMusicPlayer(String color, int battery, int storage){
        return new MusicPlayer() {
            @Override
            public String getColor() throws CreationalException {
                if (color.equals("Green")||color.equals("Blue"))
                    return color;
                else
                    throw new CreationalException("Color not available");
            }

            @Override
            public int getBattery() throws CreationalException {
                if (battery == 5 || battery == 8)
                    return battery;
                else
                    throw new CreationalException("Battery life not available");
            }

            @Override
            public int getStorage() throws CreationalException {
                if (storage == 8 || storage == 16)
                    return storage;
                else
                    throw new CreationalException("Storage not available");
            }
        };
    }


}
