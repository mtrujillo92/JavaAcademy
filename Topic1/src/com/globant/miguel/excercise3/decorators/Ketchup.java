package com.globant.miguel.excercise3.decorators;

import com.globant.miguel.excercise3.BasicHotDog;

public class Ketchup extends HotDogDecorator {
    private BasicHotDog hotDog;
    public Ketchup (BasicHotDog hotDog){
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription()+", Ketchup";
    }
}
