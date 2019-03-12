class A{
     public void car()
     {
         System.out.println("Audi car");

     }
}

class B extends A{
    public void bike()
    {
        System.out.println("Bike");
    }
}
public class inheritance
{
     public static void main(String[] args) {
         B ob=new B();
         ob.car();
         ob.bike();
     }


}