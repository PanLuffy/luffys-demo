package com.pan;

public class SingletByStatic {
    private SingletByStatic(){}

    private static class SingletInstance{
        private static SingletByStatic singletByStatic = new SingletByStatic();
    }

    public static SingletByStatic getInstance(){
        return SingletInstance.singletByStatic;
    }
}
