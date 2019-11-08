package com.company;

public class Main2 extends Singleton {

    private void test(){
        Singleton.getInstance("a");
        Singleton.getInstance("b");
    }

}

final class Singleton {
    private static Singleton instance;
    public String value;

    public Singleton(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}