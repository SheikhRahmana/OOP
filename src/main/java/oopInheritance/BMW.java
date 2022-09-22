package oopInheritance;

public class BMW extends Car{

    public BMW(){
        super();
    }
    @Override
    public void start(){
        System.out.println("start()=== from BMW class");
    }
    public void autoParking(){
        System.out.println("autoParking()=== from BMW class");
    }
}
