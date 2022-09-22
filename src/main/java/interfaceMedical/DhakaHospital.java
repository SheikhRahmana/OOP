package interfaceMedical;

public class DhakaHospital extends Medical implements USmedical,Ukmedical,BangladeshMedical {
    @Override
    public void pediaServices() {
        System.out.println("DhakaHospitla==pedia services");

    }

    @Override
    public void oncologyServices() {
         System.out.println("DhakaHospital ==oncologyServices");
    }

    @Override
    public void test() {
    System.out.println("DhakaHospital==Test services");
    }

    @Override
    public void dentalServices() {

    }

    @Override
    public void cardioServices() {

    }

    @Override
    public void cardioServices(int a) {

    }

    @Override
    public void nuroServices() {

    }

    @Override
    public void physoServices() {

    }
    public void dhakaHospitalPrimaryCare(){
        System.out.println("Dhaka Hospital primary care");
    }
}
