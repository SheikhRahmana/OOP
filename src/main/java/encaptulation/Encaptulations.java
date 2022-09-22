package encaptulation;

public class Encaptulations {
    String address;
    private String holdingNo;
    private int age;

    public String getHoldingNo() {
        return holdingNo;
    }

    public void setHoldingNo(String holdingNo) {
        this.holdingNo = holdingNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Encaptulations es= new Encaptulations();
        String s=es.address="124Main street";
        System.out.println(s);
        int a=es.age=14;
        System.out.println(a);
        /*
        Inside same class all types of variable and method are accessable
         */
    }
}
