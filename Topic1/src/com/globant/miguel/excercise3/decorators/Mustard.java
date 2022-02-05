package com.globant.miguel.excercise3.decorators;

import com.globant.miguel.excercise3.BasicHotDog;

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
