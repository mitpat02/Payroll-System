/*
AUTHOR - MIT PATEL
TASK : ASSIGNMENT 2
DATE - 16 FEB '22
*/

import java.util.Scanner;

public class Test
{
    public static void main(String[] args) 
    {
     
        Scanner sc = new Scanner(System.in);

        final int SIZE =5;  //declared int array size =5
       
        //created temporary array to store user inut
        int[] emp = new int[SIZE];
        int[] hr = new int[SIZE];
        double[] rate = new double[5];

        for(int i =0;i<emp.length;i++)
        {
            //here,taking user input storing in temp array
            System.out.println("ENTER EMPLOYEE ID");
            emp[i] = sc.nextInt();
            System.out.println("ENTER HOW MANY HOURS WORKED");
            hr[i] = sc.nextInt();
            System.out.println("ENTER THE RATE FOR YOUR JOB");
            rate[i] = sc.nextDouble();
        }

        //object reation of Payroll class
        Payroll p1 = new Payroll(emp,hr,rate);  //passed temp array as arg 
          
            //here,storing employee id taken from user in form of array in new temp array made
            int[] emp1 = p1.getemployeeId();
            int[] hr1 = p1.gethours();
            double[] r1 = p1.payRate();

            System.out.println("ID     WORKED    PAYRATE    grosspay");
        for(int i=0;i<emp.length;i++)   //WILL PRINT INPUT TAKEN FROM USER ,ORGANIZED
        {
            double[] grosspay = new double[5];
            grosspay[i] = hr1[i] * r1[i];

           
            System.out.println(emp1[i]+"\t"+hr1[i]+"\t"+r1[i]+"\t"+grosspay[i]);
            System.out.println();
        }
    
      
        p1.searchEmployee();    //will call searchEmployee() method
      sc.close();

    
      
    }
    
        

        
}
    

