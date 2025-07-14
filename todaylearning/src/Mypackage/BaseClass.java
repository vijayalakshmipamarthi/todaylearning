package Mypackage;

public class BaseClass {
    protected int protectedValue;

    public BaseClass(int value) {
        this.protectedValue = value;
    }

    public void displayValue() {
        System.out.println("Protected value: " + protectedValue);
    }
}
.
