interface parent1
{
    default void car()
    {
        System.out.println("Audi ");

    }

}
interface parent2
{
    default void car()
    {
        System.out.println("BMW");
    }
}
public class MultipleinhPgm implements parent1,parent2
{

    public void car()
    {
        parent1.super.car();
    }
public static void main(String[] args) {
    MultipleinhPgm obj=new MultipleinhPgm();
    obj.car();
    
}
}