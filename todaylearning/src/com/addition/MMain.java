package com.addition;

import Mypackage.DerivedClass;

public class MMain {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass(10);
        obj.displayValue();
        obj.changeValue(20);
        obj.displayValue();
    }
}
