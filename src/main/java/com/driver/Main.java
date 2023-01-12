package com.driver;

public class Main {
    public static void main(String[] args) {
        B object = new B(); //object of class B
//        object.meth();
        System.out.println(object.meth());
    }
}

class A{
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    String meth(){
        return "Method is overridden in Extendend class B";
    }
}

