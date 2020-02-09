package com.edison.impl;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.edison.entity.Cube;
import com.edison.inter.Strategy;

public class DigitsLetterCombinator implements Strategy {

	private String input;
    private List<String> output = new ArrayList<>();
    public DigitsLetterCombinator(String input){
        this.input = input;
    }

    @Override
    public List<String> execute(String digits) {
        output.clear();
        LinkedList<String> num = new LinkedList<String>();
        if (digits == null || digits.length() == 0) {
            return num;
        }
        output = digitCombit(digits,num);
        return output;
    }

    /**
     * 程序执行注释
     * 1. 当num首结点长度为0时，把第一个数代表的字符依次加入链表，
     *    当首结点长度为1时，需要进行下次循环，依次弹出首结点，首结点再与后面的数代表的每个字符累加，加入到链表中
     *    此时首结点的长度为2，重复操作..........最后输出
     * 2.先获取链表的首结点赋值到s，再删除首结点，避免下次再循环到，下次需要用到新的首结点
     * 3.用弹出的首结点去累加后面的字符
     * @param digits
     * @param num
     * @return
     */
    private List<String> digitCombit(String digits,LinkedList<String> num){
    	Cube cube = Cube.getInstance();
    	String[] intToStringArray = cube.getintToStringArray();
        int x, n = digits.length();
        String s;
        num.add("");
        for (int i = 0; i < n; i++) {
            while (num.peek().length() == i) {//1
                s = num.remove();//2
                x = Character.getNumericValue(digits.charAt(i));//char->int
                for (char c : intToStringArray[x].toCharArray()) {//3
                    num.add(s + c);
                }
            }
        }
        return num;
    }
}
