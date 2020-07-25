package stepdefinations;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before
    public void beforeVal(){
        System.out.println("Without the @Tags - Before");
    }

    @After
    public void afterVal(){
        System.out.println("Without the @Tags - After");
    }
    @Before("@MoblieTest")
    public void beforeValidation(){
        System.out.println("hooks - beforeValidation - for mobile");
    }


    @After("@MoblieTest")
    public void tearDown(){
        System.out.println("hooks - tearDown - for mobile");
    }

    @Before("@AppiumTest")
    public void beforeValidationForAppium(){
        System.out.println("hooks - beforeValidation - for Appium");
    }


    @Before("@WebTest")
    public void beforeValidationforWeb(){
        System.out.println("hooks - beforeValidation - for WebTest");
    }



    @After("@AppiumTest")
    public void tearValidationForAppium(){
        System.out.println("hooks - tearValidation - for Appium");
    }


    @After("@WebTest")
    public void tearValidationforWeb(){
        System.out.println("hooks - tearValidation - for WebTest");
    }

}
