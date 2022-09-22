package oopInheritance;

public class TestClass {
    public static void main(String[] args) {
        BMW b= new BMW();
        b.start();// bmw own start method is called here it is @Override method
        /*
        BMW  has  start(), parent class car has same method start() same parameter
        same name ,same paremeteer,same return type, same sequence of parameter
         */
        b.refuel();// inherited method from care class is called
        b.autoParking();// individual method from BMW
        b.stop();// inherited method from care class called
        Car c= new Car();
        c.start();
        c.refuel();
        c.stop();

        //c. using   -- c-- reference variable we can not access Toyota method
        // because parent can not access child property.
        Toyota t= new Toyota();
        t.totyotAutoParking();//==individual method from toyota
        t.start();// inherited method from Car
        t.engine();// inherited method from grand parent class

        Car car= new BMW();
        car.start();// start() -- from  BMW class will be called
        car.stop();
        car.refuel();
        car.engine();// engine()-- from vheichle calss --grandparent
        //down custing
      // BMW bm= (BMW) new Car();// is not possible


    }
}
