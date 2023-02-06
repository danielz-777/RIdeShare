public class Tester 
{
    public static void main(String[] args) 
    {
        Passenger p = new Passenger(3, 5);
        Passenger p1 = new Passenger(2, 6);
        Passenger p2 = new Passenger(4, 10);
        Passenger p3 = new Passenger(20, 13);
        Passenger p4 = new Passenger(2, 1);

        Station s1 = new Station();
        Station s2 = new Station();
         
        s1.addPass(p);
        s1.addPass(p1);

        s2.addPass(p2);
        s2.addPass(p3);

        System.out.println(s1.passIn());
        
        s2.passIn();

    }
}
