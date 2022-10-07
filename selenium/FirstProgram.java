package gitdemo.selenium;

public class FirstProgram {

	public static void main(String[] args) {
		
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.google.com");
				
	}

}
