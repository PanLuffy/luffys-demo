package com.pan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public class sout {
    public static void main(String[] args) {
        System.out.println(sout.class.getName());

        String s = new String("(aa+bb)*cc+dd");
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        List list = new ArrayList();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>=97&&chars[i]<=122){
                sb.append(chars[i]);
                if(i==chars.length-1&&sb.length()>0){
                    String ss = new String();
                    ss=sb.toString();
                    sb=new StringBuilder();
                    list.add(ss);
                }
            }else {
                if(sb.length()>0){
                    String ss = new String();
                    ss=sb.toString();
                    sb=new StringBuilder();
                    list.add(ss);
                }

            }
        }
        System.out.println(list);


    }

     Map getMap(){
        return new HashMap();
     }
}
