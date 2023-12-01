package codigo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions {
    public static void main(String[] args) throws InterruptedException{

        String rutaProyecto = System.getProperty("user.dir"); //Parametrizar el driver

        String rutaDriver = rutaProyecto+"\\src\\test\\resources\\drivers\\chromedriver.exe";

        //Enlazar el driver via property en el sistema
        System.setProperty("webdriver.chrome.driver",rutaDriver);

        //Instanciar objetos para emular el browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.spotify.com/");

        driver.manage().window().maximize();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='Registrarte']")).click();
        //driver.navigate().back();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("prueba_osito1@mail.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Siguiente']")).click();
        //driver.navigate().refresh();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='new-password']")).sendKeys("Carlitos123");

        driver.quit();
        System.out.println("Fin");

    }
}
