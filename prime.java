import java.util.*;
 
 class Prime
{
    public static void main(String args[]){
        int num,loop;
        boolean flag=false;
         
        Scanner bf=new Scanner(System.in);
         
        //input an integer number
        System.out.print("Enter any integer number: ");
        num= bf.nextInt();
         
        //check prime
        for(loop=2; loop<=(num/2); loop++)
        {
            if(num%loop==0)
            {
                flag=true;
                break;
            }
        }
         
        if(flag==false)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
