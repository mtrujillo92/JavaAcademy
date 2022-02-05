package com.globant.miguel.excercise3.decorators;

import com.globant.miguel.excercise3.BasicHotDog;

public class Pickle extends HotDogDecorator{
    private BasicHotDog hotDog;
    public Pickle (BasicHotDog hotDog){
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription()+", Some pickles";
    }
}
