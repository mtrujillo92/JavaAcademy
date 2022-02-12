package com.globant.exercise3.decorators;

import com.globant.exercise3.BasicHotDog;

public class RawOnion extends HotDogDecorator{
    private BasicHotDog hotDog;
    public RawOnion (BasicHotDog hotDog){
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription()+", Raw Onion";
    }
}
