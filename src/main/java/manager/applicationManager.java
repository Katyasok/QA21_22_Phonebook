package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class applicationManager {

    WebDriver wd;

    public void init(){
        wd=new ChromeDriver();
        String https;
        wd.navigate().to("https://telranedu.web.app/home");

    }

    public void stop(){
    wd.quit();

    }
}
