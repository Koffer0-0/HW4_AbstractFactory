package com.company;

public class SpicydishesFactory implements ChiefFactory {
    @Override
    public Chicken cookTastyChiken() {
        return new Wings();
    }

    @Override
    public Sandwich cookTastySanwich() {
        return new Zinger();
    }
}
