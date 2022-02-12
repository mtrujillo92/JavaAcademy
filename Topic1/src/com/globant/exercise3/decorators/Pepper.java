package com.globant.exercise3.decorators;

import com.globant.exercise3.BasicHotDog;

public class Pepper extends HotDogDecorator{
    private BasicHotDog hotDog;
    public Pepper (BasicHotDog hotDog){
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription()+", Pepper";
    }
}
