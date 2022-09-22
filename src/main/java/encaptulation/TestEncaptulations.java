package encaptulation;

public class TestEncaptulations {
    public static void main(String[] args) {
        Encaptulations e= new Encaptulations();
        String s=e.address="1132 Colfax Street";
        System.out.println(s);
        /*
        I can get access int age and holdingNo because they are private variable to access them I need to
        create a public layer  such as setter method getter method .
         */
        e.setAge(21);
        /*
        I can not access private int age variable directly , I am accessing variable using set method which is
        a public layer.
         */
        System.out.println(e.getAge());
        e.setHoldingNo("Joh23s");
        System.out.println(e.getHoldingNo());

        Login ls= new Login();
        ls.setUserName("john");
        System.out.println(ls.getUserName());
        ls.setPassWord("416416");
        System.out.println(ls.getPassWord());

        Logins lgs= new Logins("Sam","kdlkj");
        System.out.println(lgs.getUserName());
        System.out.println(lgs.getPassWord());

    }
}
