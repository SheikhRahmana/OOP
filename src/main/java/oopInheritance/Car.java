package oopInheritance;

public class Car extends Vehicle{

    public Car(){
      super();
    }
    public void start(){
        System.out.println("start()=== From car class");
    }
    public void stop(){
        System.out.println("stop() === from care class");
    }
    public void refuel(){
        System.out.println("refuel()=== car refuel from car class");
    }
}
