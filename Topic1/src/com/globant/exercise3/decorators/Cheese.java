package com.globant.exercise3.decorators;

import com.globant.exercise3.BasicHotDog;

public class Cheese  extends HotDogDecorator{
    private BasicHotDog hotDog;
    public Cheese(BasicHotDog hotDog){
        this.hotDog = hotDog;
    }

    @Override
    public String getDescription() {
        return hotDog.getDescription()+ ", Cheese";
    }
}
