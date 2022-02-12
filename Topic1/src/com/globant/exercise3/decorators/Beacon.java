package com.globant.exercise3.decorators;

import com.globant.exercise3.BasicHotDog;

public class Beacon extends HotDogDecorator {
    private BasicHotDog hotDog;
    public Beacon(BasicHotDog hotDog){
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription() + ", Beacon";
    }
}
