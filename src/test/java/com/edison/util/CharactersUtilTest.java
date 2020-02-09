package com.edison.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharactersUtilTest {

    @Test
    public void isNumeric() {

        Assert.assertTrue(CharactersUtil.isNumeric("65"));
        Assert.assertFalse(CharactersUtil.isNumeric("4 5"));
        Assert.assertFalse(CharactersUtil.isNumeric("7u"));
        Assert.assertFalse(CharactersUtil.isNumeric("fz"));
    }

}