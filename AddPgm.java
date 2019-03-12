import java.util.Scanner;
public class AddPgm
{
public static void main(String[] args) {
    int a,b,c;
    Scanner myinput =new Scanner(System.in);
    System.out.println("Enter the first number : ");
    a=myinput.nextInt();
    System.out.println("Enter the Second number : ");
    b=myinput.nextInt();
    c=a+b;
    System.out.println("The sum is : "+c);


}
}