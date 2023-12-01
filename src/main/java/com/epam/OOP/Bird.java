package com.epam.OOP;

public class Bird extends Animal {
    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription(){
        //You can inherit method and call method from superclass
        return super.getDescription() + " Moreover, it has 2 wings and can fly.";
    }
}
