package codigo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Casos_Comisaria2 {

    //Instanciar objetos para emular el browser
    WebDriver driver = new ChromeDriver();


//SE VALIDA MENSAJE DE ERROR INGRESANDO RUT INVALIDO "El campo RUN no es un RUN válido"
    @Test
    public void CP001_El_campo_RUN_no_es_un_RUN_valido() {

        String rutaProyecto = System.getProperty("user.dir"); //Parametrizar el driver

        String rutaDriver = rutaProyecto + "\\src\\test\\resources\\drivers\\chromedriver.exe";

        //Enlazar el driver via property en el sistema
        System.setProperty("webdriver.chrome.driver", rutaDriver);



        //Crear el ejecutor de javascript para el scrolling via evento
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //instanciar un objeto de tipo webdriver
        driver = new ChromeDriver();

        //instanciar un objeto de tipo WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, 30);

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

//validar mensaje de error "El campo Número de Serie es obligatorio" con campo Número de serie vacio
    @Test
    public void CP002_Validar_mensaje_con_Campo_vacio_Nuemeroserie () {
        driver.findElement(By.id("btnCedula")).click();
        driver.findElement(By.id("1897")).click();
        driver.findElement(By.id("1897")).clear();
        driver.findElement(By.id("1897")).sendKeys("valeria martinez parada");
        driver.findElement(By.id("1898")).click();
        driver.findElement(By.id("1898")).clear();
        driver.findElement(By.id("1898")).sendKeys("16546236-k");
        driver.findElement(By.id("3000")).sendKeys("");
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
        driver.findElement(By.id("1905")).sendKeys("Farmacia");
        driver.findElement(By.id("No")).click();
        driver.findElement(By.id("en_caso_de_comprobarse_falsedad_en_la_declaracion_de_la_causal_invocada_para_requerir_el_presente_documento_se_incurrira_en_las_penas_del_art_210_del_codigo_penal")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/form/div/div/button/span")).click();
        //Assert.assertTrue(true);
    }
    //validar mensaje de error"El Recaptcha no es válido"
    @Test
    public void CP003_Validar_mensaje_El_Recaptcha_no_es_valido () {
        driver.findElement(By.id("btnCedula")).click();
        driver.findElement(By.id("1897")).click();
        driver.findElement(By.id("1897")).clear();
        driver.findElement(By.id("1897")).sendKeys("valeria martinez parada");
        driver.findElement(By.id("1898")).click();
        driver.findElement(By.id("1898")).clear();
        driver.findElement(By.id("1898")).sendKeys("16546236-k");
        driver.findElement(By.id("3000")).sendKeys("123456");
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
        driver.findElement(By.id("1905")).sendKeys("farmacia");
        driver.findElement(By.id("No")).click();
        driver.findElement(By.id("en_caso_de_comprobarse_falsedad_en_la_declaracion_de_la_causal_invocada_para_requerir_el_presente_documento_se_incurrira_en_las_penas_del_art_210_del_codigo_penal")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/form/div/div")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/form/div/div/button/span")).click();
        //Assert.assertTrue(true);
    }

    //SE VALIDA MENSAJE "El campo Indique su edad es obligatorio" DEJANDO CAMPO "Indique su edad" VACIO
    @Test
    public void CP004_Validar_mensaje_con_campo_vacio_edad () {
        driver.findElement(By.id("btnCedula")).click();
        driver.findElement(By.id("1897")).click();
        driver.findElement(By.id("1897")).clear();
        driver.findElement(By.id("1897")).sendKeys("valeria martinez parada");
        driver.findElement(By.id("1898")).click();
        driver.findElement(By.id("1898")).clear();
        driver.findElement(By.id("1898")).sendKeys("16546236-k");
        driver.findElement(By.id("3000")).sendKeys("110123123");
        driver.findElement(By.id("2529")).click();
        driver.findElement(By.id("2529")).clear();
        driver.findElement(By.id("2529")).sendKeys("");
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
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/form/div/div")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/form/div/div/button/span")).click();
        //Assert.assertTrue(true);
    }


//SE VALIDAN MENSAJES NO INGERSANDO DATOS AL FORMULARIO
    @Test
    public void CP005_Ingresar_y_validarmensajes_de_error () {
        driver.findElement(By.id("btnCedula")).click();
        driver.findElement(By.id("1897")).click();
        driver.findElement(By.id("1897")).clear();
        driver.findElement(By.id("1897")).sendKeys("");
        driver.findElement(By.id("1898")).click();
        driver.findElement(By.id("1898")).clear();
        driver.findElement(By.id("1898")).sendKeys("");
        driver.findElement(By.id("3000")).sendKeys("");
        driver.findElement(By.id("2529")).click();
        driver.findElement(By.id("2529")).clear();
        driver.findElement(By.id("2529")).sendKeys("");
        driver.findElement(By.xpath("//div[@id='regiones_1899_chosen']/a/span")).click();
        driver.findElement(By.xpath("//div[@id='regiones_1899_chosen']")).click();
        driver.findElement(By.xpath("//div[@id='comunas_1899_chosen']/a/span")).click();
        driver.findElement(By.xpath("//div[@id='comunas_1899_chosen']")).click();
        driver.findElement(By.id("1900")).click();
        driver.findElement(By.id("1900")).clear();
        driver.findElement(By.id("1900")).sendKeys("");
        driver.findElement(By.id("Ida - Regreso")).click();
        driver.findElement(By.id("1905")).click();
        driver.findElement(By.id("1905")).clear();
        driver.findElement(By.id("1905")).sendKeys("");
        driver.findElement(By.id("No")).click();
        driver.findElement(By.id("en_caso_de_comprobarse_falsedad_en_la_declaracion_de_la_causal_invocada_para_requerir_el_presente_documento_se_incurrira_en_las_penas_del_art_210_del_codigo_penal")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/form/div/div/button/span")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/form/div/div/button/span")).click();
        //Assert.assertTrue(true);


    }

}

   
