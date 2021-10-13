package com.company;

public class NotSpicyFactory implements ChiefFactory {
    @Override
    public Chicken cookTastyChiken() {
        return new Strips();
    }

    @Override
    public Sandwich cookTastySanwich() {
        return new Classic();
    }
}
