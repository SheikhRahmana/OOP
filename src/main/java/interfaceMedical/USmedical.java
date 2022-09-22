package interfaceMedical;

public interface USmedical {
    public void test();//-- it is called Abstract method. , proto type, only decalaration
    public void cardioServices();
    public void cardioServices(int a);
    public void nuroServices();
    public void physoServices();
    public static void billing(){
        System.out.println("static implemented mehtod in side --interface--");
    }
    default void medicalResearch(){
        System.out.println("Default implemented in side -interface Usmedical");
    }


}
