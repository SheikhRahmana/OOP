package encaptulation;

public class EncapWithoutSetterOrGetter {
    public void launchBrowser(){
        checkOSCompatible();
        checkRamSize();
        checkChromeVersion();
        checkChromeServices();
        System.out.println("launch Chrome");
    }
    private void checkOSCompatible(){
        System.out.println("Check Os Compatable or not");
    }
    private void checkRamSize(){
        System.out.println("Check RAM size");
    }
    private void checkChromeVersion(){
        System.out.println("check chrome  verison");
    }
    private void checkChromeServices(){
        System.out.println("Check Chrome Services");
    }
}
