package com.edison.impl;


import java.util.List;

import com.edison.inter.Strategy;

public class CombinationContext {

    private Strategy strategy;

    public CombinationContext(Strategy strategy){
        this.strategy = strategy;
    }

    public List<String> executeStrategy(String input){
        return strategy.execute(input);
    }
}
