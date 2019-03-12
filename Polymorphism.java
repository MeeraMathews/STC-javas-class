class Bank {
    int getinterest()
    {
        return 0;

    }
}
class SBI extends Bank
{
    int getinterest()
    {
        return 4;

    }

}
class ICICI extends Bank
{
    int getinterest()
    {
        return 5;

    }

}

public class Polymorphism{

public static void main(String[] args) {
    
    Bank ob;
    ob=new SBI();
    System.out.println("The interest rate of SBI Bank is :");
    System.out.println(ob.getinterest());
    ob=new ICICI();
    System.out.println("The interest rate of ICICI Bank is :");
    System.out.println(ob.getinterest());
}

}