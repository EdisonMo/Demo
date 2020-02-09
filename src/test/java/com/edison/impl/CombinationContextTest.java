package com.edison.impl;

import org.junit.Test;
import java.util.List;

public class CombinationContextTest {

    @Test
    public void executeStrategy() {

        List<String> output2;
        CombinationContext context2 = new CombinationContext(new DigitsLetterCombinator("99"));
        for (int m = 0; m <= 99; m++){
            output2 = context2.executeStrategy(String.valueOf(m));
            System.out.println(output2);
        }
    }
}