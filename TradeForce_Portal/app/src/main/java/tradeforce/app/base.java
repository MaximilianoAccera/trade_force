package tradeforce.app;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class base {
	
	
	
	
	
	@Test
	public void testLogin()  throws MalformedURLException {
		// Appium Coded
		
		File f=new File ("/Users/maximiliano.silva/Documents/TradeForce/Moblie/Apk");
		File fs=new File(f,"TradeForce2_34_00_7082_ak106_dev.apk");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability("autoGrantPermissions", true);
		
		
		
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		//Permitir acesso a midia
		//driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		
		//Permitir acesso a chamadas
		//driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		
		
		//Campo instância
		driver.findElement(By.id("trade.force.dev:id/input_layout_enterprise")).sendKeys("hlg-brf");;
		
		//Botão Próximo
		driver.findElement(By.id("trade.force.dev:id/loginNextStepButton")).click();
		
		//Campo User		
		driver.findElement(By.id("trade.force.dev:id/loginUserLoginField")).sendKeys("1993");;
		
		//Campo Password
		driver.findElement(By.id("Campo Senha - trade.force.dev:id/loginUserPasswordField")).sendKeys("2018superacao");;
		
		//Botão Entrar
		driver.findElement(By.id("Botão Entrar - trade.force.dev:id/loginDoLoginButton")).click();
		
		
		//driver.findElement(By.id(""));
		
		
		//driver.findElement(By.id(""));
		
	}

}
