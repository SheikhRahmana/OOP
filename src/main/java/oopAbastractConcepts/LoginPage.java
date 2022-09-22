package oopAbastractConcepts;

public class LoginPage extends Page{
    public LoginPage(){
        System.out.println("LoginPage Constructor");
    }
    @Override
    public void title() {
        System.out.println("title is a abstract method in Page OnlyAbstracPage class");
    }

    @Override
    public void url() {
        System.out.println("url is a abstract method in Page OnlyAbstracPage class");
    }

    @Override
    public void header() {
        System.out.println("header is a abstract method in Page OnlyAbstracPage class");
    }

    @Override
    public void search() {
        System.out.println("search is a abstract method in Page  class");
    }

    @Override
    public void product() {

    }
    @Override
    public void loadingPage(){
        System.out.println("PageLoading Page class 30");
    }
}
