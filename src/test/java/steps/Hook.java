package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {
    @Before
    public void initilizeTest(Scenario scenario){
        System.out.println("----------");
        System.out.println("Before hooks");
        System.out.println(scenario.getName());
        System.out.println(scenario.getStatus());
        System.out.println(scenario.getLine());
        System.out.println("-------------");
    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("------------");
        System.out.println("after hooks");
        System.out.println(scenario.getName());
        System.out.println("----------");
    }
}
