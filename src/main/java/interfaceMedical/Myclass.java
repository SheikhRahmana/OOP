package interfaceMedical;

public class Myclass {
    private void sum(){
        System.out.println("privae method ");
    }
    public int  calls( int k,int m){
        sum();
        int sub=k/m;
        System.out.println(sub);
        addNumber(2,5);
        return sub;
    }
    private int addNumber(int i, int j){
        int sum=i+j;
        return sum;
    }
}
