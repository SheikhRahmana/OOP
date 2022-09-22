package oopAbastractConcepts;

public abstract class Page extends OnlyAbstracPage{
    public Page(){
        System.out.println("Page Constractor default/zero parameter");
    }
    public abstract void search();
    public abstract void product();

    public void loadingPage(){
        System.out.println("PageLoading Page class");
    }
    public final void logo(){
        System.out.println("abstruct page class logo");
    }
    public static void pageFooter(){
     System.out.println("Page footer");
    }
    public void loader(){
        loadHtml();
    }
    private void loadHtml(){
        System.out.println("Page class ==Private== method");
    }
}
