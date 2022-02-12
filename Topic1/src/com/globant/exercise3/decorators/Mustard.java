package com.globant.exercise3.decorators;

import com.globant.exercise3.BasicHotDog;

public class Mustard extends HotDogDecorator{
    private BasicHotDog hotDog;
    public Mustard (BasicHotDog hotDog){
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription()+", Mustard";
    }
}
