package stringManupulations;

public class StringManupulations {
    public static void main(String[] args) {
        String str= "This is my java codie and I am happies";
        /*
        String is a class,it is a collection of character , Internally it
        maintain character Array.
         */
        System.out.println(str.charAt(21));
        try {
        System.out.println(str.charAt(85));
        }catch (Exception e){
            //e.printStackTrace();
        }
        System.out.println(str.indexOf('p'));
        System.out.println(str.indexOf('i'));
        System.out.println(str.indexOf('i',str.indexOf('i')+1));
        System.out.println(str.indexOf("am"));
    }
}
