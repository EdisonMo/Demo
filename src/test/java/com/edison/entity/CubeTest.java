package com.edison.entity;
import org.junit.Assert;
import org.junit.Test;

public class CubeTest {

    @Test
    public void getInstance() {

        Assert.assertNotNull(Cube.getInstance());
    }

    @Test
    public void getCubeMap() {

        Assert.assertNotNull(Cube.getInstance().getintToStringArray());
    }
}