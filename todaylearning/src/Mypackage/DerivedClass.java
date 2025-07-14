package Mypackage;




public class DerivedClass extends BaseClass {
 public DerivedClass(int value) {
     super(value);
 }

 public void changeValue(int newValue) {
     protectedValue = newValue; // Accessing protected member
 }
}
