package Codigo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class Browser {
    public static void main(String[] args) throws InterruptedException, AWTException {

        //Abrir Chrome y cargar web a probar

        String rutaProyecto = System.getProperty("user.dir");

        String rutaDriver = "C:\\Users\\exlcaru\\Desktop\\Curso BCI\\Prueba1_Selenium\\src\\test\\resources\\drivers\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", rutaDriver);

        WebDriver driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.ubereats.com/cl");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Ingresar datos para registrarse

    }
}