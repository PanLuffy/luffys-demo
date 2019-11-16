package com.pan;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Student s = new Student();

        s.setName("zhangsan");
        s.setAge(20);

        Map<Integer,Student> map = new HashMap<>();
        map.put(1,s);
        map.put(2,s);
        System.out.println(map);

    }

}
