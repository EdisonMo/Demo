package com.edison.factory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CombinationContextFactoryTest {

    @Test
    public void getContext() {

        String inputString = "8,5";
        Assert.assertNull(CombinationContextFactory.getContext(inputString));

        inputString = "98";
        Assert.assertNotNull(CombinationContextFactory.getContext(inputString));

        inputString = "Test";
        Assert.assertNull(CombinationContextFactory.getContext(inputString));
    }

}