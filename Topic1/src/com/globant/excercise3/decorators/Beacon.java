package com.globant.excercise3.decorators;

import com.globant.excercise3.BasicHotDog;

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
