package com.pan;

import java.util.*;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class IntegerEquals {

    public static void main(String[] args) throws InterruptedException {
        /*double a =2.0;
        int b = 2;
        long c = 2L;
        System.out.println(a==b);
        System.out.println(b==c);*/

        /*String remove = "b";
        ArrayList<String> s = new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.remove("b");
        System.out.println(s);*/
        Map<Object,String> amap = new HashMap<>();
        amap.put("1","value 1");
        amap.put(1,"value 1");
        Thread thread = new Thread();
        ReentrantReadWriteLock rrw = new ReentrantReadWriteLock();
        System.out.println(amap.size());
    }

    int getnum(){
        return 0;
    }
}
