package com.globant.excercise3.decorators;

import com.globant.excercise3.BasicHotDog;

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
