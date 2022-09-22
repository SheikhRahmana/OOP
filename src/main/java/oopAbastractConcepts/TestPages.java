package oopAbastractConcepts;

import interfaceMedical.Myclass;

public class TestPages {
    public static void main(String[] args) {

        LoginPage lgp= new LoginPage();
        System.out.println("-------------");
        lgp.logo();
        lgp.search();
        Page.pageFooter();
        lgp.loadingPage();
        lgp.loader();

        Page p= new LoginPage();
        System.out.println("Top custing----------------");
        p.logo();
        p.product();
        // create object of Abstract class  ======NO NO NO
       // Page ps= new Page() ;
        // down custing   NON NO

        Myclass ms= new Myclass();
        ms.calls(10,5);//Encaptulation
        //System s= new System();   we can not create object of Sysetm class
        //because  System class constructor is  private

    }
}
