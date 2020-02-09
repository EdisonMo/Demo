package com.edison.entity;

public class Cube {

    private static String[] intToStringArray;

    private static Cube instance;

    private Cube(){
    	intToStringArray();
    }

    private void intToStringArray() {
    	intToStringArray = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    }

    public static Cube getInstance(){
        if(null == instance){
            synchronized (Cube.class){
                if (null == instance) {
                    instance = new Cube();
                }
            }
        }
        return instance;
    }

    public static String[] getintToStringArray() {
        return intToStringArray;
    }
}
