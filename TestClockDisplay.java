package ClockDisplay;


/**
 * A Class to test changes to the ClockDisplay class.
 * 
 * @author Trevor Carter 
 * @version 0.1
 */
public class TestClockDisplay
{

    /**
     * Constructor for objects of class TestClockDisplay
     */
    public TestClockDisplay()
    {
    }
    
    public void test()
    {
        ClockDisplay clock = new ClockDisplay();
        
        clock.setTime(22, 30);
        System.out.println(clock.getTime());
        
        clock.setTime(10, 30);
        System.out.println(clock.getTime());
                
        clock.setTime(0, 0);
        System.out.println(clock.getTime());
                
        clock.setTime(12, 0);
        System.out.println(clock.getTime());
    }
}
