package com.globant.miguel.excercise3.decorators;

import com.globant.miguel.excercise3.BasicHotDog;

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
