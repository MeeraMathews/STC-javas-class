public class PrimePgm
{
public static void main(String[] args) {

    int count;
    for(int i=2;i<100;i++)
    {
        count =0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
                count++;
        }
        if(count==2)
        System.out.println("The Prime numbers between 2 and 100 are : "+i);

        
    }

}

}