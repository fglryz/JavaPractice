package Day45.BrowserTask;

public class DriverObject {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        FireFoxDriver fireFoxDriver = new FireFoxDriver();
        EdgeDriver edgeDriver = new EdgeDriver();
        SafariDriver safariDriver = new SafariDriver();
        OperaDriver operaDriver = new OperaDriver();

        chromeDriver.get("https://www.amazon.com");
        chromeDriver.getTitle();
        chromeDriver.takeScreenShoot();
        chromeDriver.close();
        System.out.println("-----------------------------------------------");
        safariDriver.get("https://www.amazon.com");
        safariDriver.getTitle();
        safariDriver.takeScreenShoot();
        safariDriver.close();
    }
}
