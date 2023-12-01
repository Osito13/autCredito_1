package codigo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.*;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Casos_Comisaria {
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
        driver.get("https://comisariavirtual.cl/etapas/ver/permiso_general_desplazamiento/index.html#");
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.id("btnCedula")).click();
        driver.findElement(By.id("1897")).click();
        driver.findElement(By.id("1897")).clear();
        driver.findElement(By.id("1897")).sendKeys("valeria martinez parada");
        driver.findElement(By.id("1898")).click();
        driver.findElement(By.id("1898")).clear();
        driver.findElement(By.id("1898")).sendKeys("123456");
        //driver.findElement(By.id("1898")).sendKeys("16546236-k"); //RUT VALIDO
        driver.findElement(By.id("3000")).sendKeys("110123123");
        driver.findElement(By.id("2529")).click();
        driver.findElement(By.id("2529")).clear();
        driver.findElement(By.id("2529")).sendKeys("34");
        driver.findElement(By.xpath("//div[@id='regiones_1899_chosen']/a/span")).click();
        driver.findElement(By.xpath("//div[@id='regiones_1899_chosen']/div/ul/li[13]")).click();
        driver.findElement(By.xpath("//div[@id='comunas_1899_chosen']/a/span")).click();
        driver.findElement(By.xpath("//div[@id='comunas_1899_chosen']/div/ul/li[49]")).click();
        driver.findElement(By.id("1900")).click();
        driver.findElement(By.id("1900")).clear();
        driver.findElement(By.id("1900")).sendKeys("av las flores 38");
        driver.findElement(By.id("Ida - Regreso")).click();
        driver.findElement(By.id("1905")).click();
        driver.findElement(By.id("1905")).clear();
        driver.findElement(By.id("1905")).sendKeys("Pirque");
        driver.findElement(By.id("No")).click();
        driver.findElement(By.id("en_caso_de_comprobarse_falsedad_en_la_declaracion_de_la_causal_invocada_para_requerir_el_presente_documento_se_incurrira_en_las_penas_del_art_210_del_codigo_penal")).click();
        driver.findElement(By.id("3000")).click();
        driver.findElement(By.id("3000")).clear();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/form/div/div")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/form/div/div")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/form/div/div/button/span")).click();
        //Assert.assertTrue(true);
    }

}

   
