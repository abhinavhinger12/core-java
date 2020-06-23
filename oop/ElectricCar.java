package oop;

/*
Abstract class is a class that has unimplemented methods. But it can have BOTH.
If there is even 1 method not implemented it is an abstract class and we cant use NEW keyword for this class.
Concrete class is a class that is fully implemented and functional.
Whether the methods are inherited or implemented, only thing that matters that they are there.

An interface is a class that has only abstract methods.
A class can implement many interfaces but only extend 1 abstract class.
 */

public class ElectricCar extends Vehicle implements Driveable {

    public String honk() {
        return "beep";
    }

    public static void main(String [] args){
        ElectricCar tesla = new ElectricCar();
        System.out.println(tesla.honk());
        System.out.println(tesla.drive());
    }

}