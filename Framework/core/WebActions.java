package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions {

	WebDriverWait wait;
	private int waitTimeout = 30;
	
	public void click(WebDriver driver, WebElement elm) {
		waitForElementClickable(driver, elm);
		elm.click();
	}
	
	public void sendText(WebDriver driver, WebElement elm, String text) {
		waitForElementVisible(driver, elm);
		elm.sendKeys(text);
	}
	
	public void waitForElementVisible(WebDriver driver, WebElement elm) {
		this.wait = new WebDriverWait( driver, waitTimeout );
		wait.until(ExpectedConditions.visibilityOf(elm));
	}
	
	public void waitForElementClickable(WebDriver driver, WebElement elm) {
		this.wait = new WebDriverWait( driver, waitTimeout );
		wait.until(ExpectedConditions.elementToBeClickable(elm));
	}
	
	public int getWaitTimeout() {
		return this.waitTimeout;
	}
	
	public void setWaitTimeout(int timeout) {
		this.waitTimeout = timeout;
	}
	
}
