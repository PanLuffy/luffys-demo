package com.pan;

import java.util.concurrent.ConcurrentHashMap;

public class demo {
    private final int MAX_LENGTH = 1000;
    public static void main(String[] args) {
        int random = (int)(Math.random()*30+31);
        int a=0,c=0;
        do {
            --c;
            a=a-1;
        }
        while (a>0);
        System.out.println(c);
    }
}
