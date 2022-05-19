import static org.junit.Assert.*;
import org.junit.Test;

public class testCoffeeMachine {
    @Test
    public void test1(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.openMachine());
    }
    @Test
    public void test2(){
        CoffeeMachine c= new CoffeeMachine();
        c.isPowerOn = true;
        assertEquals("Error!",c.openMachine());
    }
    @Test
    public void test3(){
        CoffeeMachine c = new  CoffeeMachine();
        assertEquals("Turn Machine On first!", c.addMoney(30));
    }
    @Test
    public void test4(){
        CoffeeMachine c = new  CoffeeMachine();
        c.openMachine();
        assertEquals("Successfully added money",c.addMoney(30));
    }
    @Test
    public void test5(){
        CoffeeMachine c = new  CoffeeMachine();
        c.openMachine();
        c.closeMachine();
        assertEquals("Turn Machine On first!",c.addMoney(30));
    }
    @Test
    public void test6(){
        CoffeeMachine c = new  CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.openMachine());
        assertEquals("Successfully added money",c.addMoney(30));
    }
    @Test
    public void test7(){
        CoffeeMachine c = new  CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.openMachine());
        assertEquals("Successfully added money",c.addMoney(30));
        assertEquals("Lights Off!" + "Power Off!",c.closeMachine());
    }
    @Test
    public void test8(){
        CoffeeMachine c = new  CoffeeMachine();
        assertEquals("Turn Machine On first!",c.makeCoffee(2));
    }
    @Test
    public void test9(){
        CoffeeMachine c = new  CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.openMachine());
        assertEquals("Successfully added money",c.addMoney(30));
        assertEquals(3+ " Cup Of coffee Made!",c.makeCoffee(3));
    }
    @Test
    public void test10(){
        CoffeeMachine c = new  CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.openMachine());
        assertEquals("Successfully added money",c.addMoney(30));
        assertEquals(3+ " Cup Of coffee Made!",c.makeCoffee(4));
    }
    @Test
    public void test11(){
        CoffeeMachine c = new  CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.openMachine());
        assertEquals("Successfully added money",c.addMoney(30));
        assertEquals(1+ " Cup Of coffee Made!",c.makeCoffee(1));
    }
    @Test
    public void test12(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.openMachine());
        assertEquals("Successfully added money",c.addMoney(30));
        assertEquals(2+ " Cup Of coffee Made!",c.makeCoffee(2));
        assertEquals("Lights Off!" + "Power Off!",c.closeMachine());
    }

}
