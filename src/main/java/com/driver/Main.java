package com.driver;

public class Main {
    public static void main(String[] args) {
        B object = new B(); //object of class B
        object.meth();
        System.out.println(object.meth());
    }

    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
}



