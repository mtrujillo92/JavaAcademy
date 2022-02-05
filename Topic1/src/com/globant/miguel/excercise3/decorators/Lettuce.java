package com.globant.miguel.excercise3.decorators;

import com.globant.miguel.excercise3.BasicHotDog;

public class Lettuce extends HotDogDecorator{
    private BasicHotDog hotDog;
    public Lettuce (BasicHotDog hotDog){
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription()+", Lettuce";
    }
}
