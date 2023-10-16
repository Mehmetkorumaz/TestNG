package tests.practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class P01_Notation {
    @Test@Ignore
    public void ANergiz(){
        System.out.println("Nergiz");
    }
    @Test
    public void TOmer(){
        System.out.println("Omer");
    }
    @Test(dependsOnMethods = "ZBugra")
    public void ESenol(){
        System.out.println("Senol");
    }
    @Test
    public void ZBugra(){
        System.out.println("Bugra");
    }
}
