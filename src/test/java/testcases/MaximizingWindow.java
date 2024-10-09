package testcases;

import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MaximizingWindow {

	
	public static void main(String[] args){
	Playwright playwright = Playwright.create();
	ArrayList<String> arguments = new ArrayList<>();
	arguments.add("--start-maximized");
	
	Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
	BrowserContext	context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
	//BrowserContext	browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(1260,768));
	
	Page page = context.newPage();
	page.navigate("http://way2automation.com");
	System.out.println(page.title());
	
	}
}
