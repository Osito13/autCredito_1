package codigo;

import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ConsultaBE {

    public static String frame;
    public static void main(String[] args) throws InterruptedException, AWTException {


//SE VALIDA MENSAJE DE ERROR INGRESANDO RUT INVALIDO "El campo RUN no es un RUN válido"


        String rutaProyecto = System.getProperty("user.dir"); //Parametrizar el driver

        String rutaDriver = rutaProyecto + "\\src\\test\\resources\\drivers\\chromedriver.exe";

        //Enlazar el driver via property en el sistema
        System.setProperty("webdriver.chrome.driver", rutaDriver);

        //Instanciar objetos para emular el browser
        WebDriver driver = new ChromeDriver();

        //Crear el ejecutor de javascript para el scrolling via evento
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //driver.manage().window().maximize();
        System.out.println("Accedo a BE");
        driver.get("https://www.bancoestado.cl/");
        driver.manage().window().maximize();

        //driver.findElement(By.id("headermenu-eeb7ca1812-item-2ce075b597-tab")).click();
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.id("headermenu-eeb7ca1812-item-2ce075b597-tab"));
        action.moveToElement(we).build().perform();
        System.out.println("[Click] - Consulto por rut");
        driver.findElement(By.xpath("//a[@href='#consulta-rut']")).click();
        Thread.sleep(3000);
        System.out.println("[Sendkeys] Completar rut");
        driver.findElement(By.xpath("//input[@placeholder='Ingresa tu RUT']")).sendKeys("18586782-K");
        Thread.sleep(1000);
        System.out.println("[Click] - Simular");
        driver.findElement(By.xpath("//button[contains(text(),'Simular')]")).click();
        Thread.sleep(5000);
        /*
        System.out.println("Ingreso monto");
        driver.findElement(By.id("idIngresaMonto")).sendKeys("50000000");
        System.out.println("Click cuotas");
        driver.findElement(By.xpath("//div//select[@formcontrolname='numeroCuotas']")).click();
        System.out.println("Ingreso Numero cuotas");
        driver.findElement(By.xpath("//div//select[@formcontrolname='numeroCuotas']//option[@value= '60']")).click();
        Thread.sleep(2000);
        System.out.println("Click mes de pago");
        driver.findElement(By.xpath("//select[@formcontrolname='mesPago']")).click();
        System.out.println("[Click] - Selecciono mes de pago");
        driver.findElement(By.xpath("//select[@formcontrolname='mesPago']//option[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@formcontrolname='diaPago']")).click();
        driver.findElement(By.xpath("//select[@formcontrolname='diaPago']//option[2]")).click();
        */

        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, 20);
        //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
        //driver.findElement(By.xpath("//div[@role='radiogroup']//div[@for='c07']")).click();
        //driver.findElement(By.xpath("//div[@role='radiogroup']//div[@for='c07']//input")).click();

        driver.findElement(By.xpath("//div[@role='radiogroup']//div[@for='c07']//label")).click();

        driver.findElement(By.xpath("//div[@role='radiogroup']//div[@for='c07']//p")).click();

        driver.findElement(By.xpath("//button[contains(text(),'Continuar')]")).click();
//Assert.assertTrue(true);



    }

}

   
