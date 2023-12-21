package tests;

import manager.applicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    applicationManager app=new applicationManager();

    @BeforeSuite
    public void setUp(){
        app.init();
    }

  @AfterSuite
    public void tearDown(){
        app.stop();
    }
}
