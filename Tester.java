public class Tester 
{
    public static void main(String[] args) 
    {
        Road r1 = new Road(32, 25, 20);
        r1.getStops();
        
        r1.getCars();
        
        //System.out.println("");
        //r1.getStation();
        
        for(int i = 0; i < 32; i++)
        {
            
            r1.moveCar();
            //r1.getStops();
            System.out.println("");
            System.out.println("");
            r1.getCars();
        }
        
        System.out.println("");
        r1.getCars();
        
        r1.getStops();

        System.out.println("The total miles traveled... " + r1.getMi() + " and total revenue was " + r1.getMi() * 5 + " and average revenue per mile " + (r1.getMi()*5)/(r1.getMi()));
        //r1.getPassLoc();
        

    }
}
