public class Tester 
{
    public static void main(String[] args) 
    {
        Road r1 = new Road(32, 20, 10);
        r1.getStops();
        
        r1.getCars();
        
        //System.out.println("");
        //r1.getStation();
        
        for(int i = 0; i < 32; i++)
        {
            
            r1.moveCar();
            System.out.println("");
            r1.getCars();
        }
        
        System.out.println("");
        r1.getCars();
        
        r1.getStops();
        //r1.getPassLoc();
        

    }
}
