package metodos;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodos {

	public static WebDriver driver;

	public void abrirNavegador() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	}
	
	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	
	public void escrever(String texto, By elemento ) {
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public void validarTexto(String textoEsperado, By elemento) {
		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);
	}
	
	public void validarTitle(String tituloEsperado) {
		String tituloCapturado = driver.getTitle();
		assertEquals(tituloEsperado, tituloCapturado);
	}
	
	public void fecharNavegador() {
		driver.close();
	}
	
	public void esperarElemento(int tempo) throws InterruptedException {
		driver.wait(tempo);
	}
	public void submit(By elemento) {
		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}
	}
	
	public void preencherDadosCadastrais(String email, String fone, String usuario, String senha, String confirma) {
		try {
			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.id("phone")).sendKeys(fone);
			driver.findElement(By.id("username")).sendKeys(usuario);
			driver.findElement(By.id("password")).sendKeys(senha);
			driver.findElement(By.id("confirmpassword")).sendKeys(confirma);
		} catch (Exception e) {
			System.out.println(" ------ Erro no metodo -----" + e.getMessage());
			System.out.println(" ------ Causa do erro -----" + e.getCause());
		}
	}

    public void esperaPeloElementoEClica(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        try {
            // Aguarda até o elemento estar visível
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            // Clica no elemento
            element.click();
        } catch (Exception e) {
            System.out.println("Elemento não foi encontrado ou não ficou visível dentro do tempo limite: " + e.getMessage());
        }
    }
}

