package Fontes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Testes.TestScript;

public class Login {
	public static void main(String[] args) {

		String nomeUsuario = "15815";
		String senhaUsuario = "123456";
		String trilha = "teste2";
		String xPathSair = "/html/body/div[1]/div/div/div/div[2]/div[3]/div/a";

		WebDriver driver = new ChromeDriver();
		driver.get("http://qa.agiplan.com.br/" + trilha + "/portal.ui.web");

		WebElement campoUsuario = driver.findElement(By.id("UserName"));
		campoUsuario.sendKeys(nomeUsuario);

		WebElement campoSenha = driver.findElement(By.id("Password"));
		campoSenha.sendKeys(senhaUsuario);

		WebElement botaoConectar = driver.findElement(By.className("button"));
		botaoConectar.click();

		driver.findElement(By.xpath(xPathSair));
	}
}
