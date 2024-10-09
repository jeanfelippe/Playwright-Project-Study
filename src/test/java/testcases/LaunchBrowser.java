package testcases;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Pattern;

import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Request;
import com.microsoft.playwright.Response;
import com.microsoft.playwright.Route;
import com.microsoft.playwright.Tracing;
import com.microsoft.playwright.BrowserContext.ExposeBindingOptions;
import com.microsoft.playwright.BrowserContext.GrantPermissionsOptions;
import com.microsoft.playwright.BrowserContext.RouteFromHAROptions;
import com.microsoft.playwright.BrowserContext.RouteOptions;
import com.microsoft.playwright.BrowserContext.StorageStateOptions;
import com.microsoft.playwright.BrowserContext.WaitForPageOptions;
import com.microsoft.playwright.options.BindingCallback;
import com.microsoft.playwright.options.Cookie;
import com.microsoft.playwright.options.FunctionCallback;
import com.microsoft.playwright.options.Geolocation;

public class LaunchBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//		double width = screenSize.getWidth();
//		double height = screenSize.getHeight();
//
//		System.out.println(width+"---"+height);
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext	browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(1260,768));
		//BrowserContext	browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(1260,768));
		
		Page page = browser.newPage();
		page.navigate("http://way2automation.com");
		System.out.println(page.title());
		Thread.sleep(2000);
		page.close();
		playwright.close();
	}

}
