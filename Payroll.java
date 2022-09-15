import java.util.Arrays;
import java.util.Scanner;

public class Payroll
{
    
    //creating datafields as array,private
    Scanner hello = new Scanner(System.in);
    final int SIZE = 5;
    private int[] employeeId;
    private int[] hours;
    private double[] payRate;

    public Payroll(int[] employeeId,int[] hours,double[] payRate)
    {
        this.employeeId = employeeId;
        this.hours = hours;
        this.payRate = payRate;
    }
    public int[] getemployeeId()
    {
        return this.employeeId;
    }
    public int[] gethours()
    {
        return this.hours;
    }
    public double[] payRate()
    {
        return this.payRate;
    }

     public   void searchEmployee()
    {
        double[] a = new double[5];
        
        Arrays.sort(employeeId);    //sort method
        
        for(int i=0;i<employeeId.length;i++)
        {
            System.out.println("AFTER SORTING EMPLOYEE ID IS  " +employeeId[i]);
        }
        
        System.out.println("ENTER EMPLOYEE ID YOU WANT TO CALCUALTE GROSS PAY FOR?");
        int key = hello.nextInt();
       

        int temp = Arrays.binarySearch(employeeId, key);    //binary search
        
       
        //to find  gross for key employee
        if(temp>=0 && temp<5)
        {
          
           a[temp]=  hours[temp] * payRate[temp];
           System.out.println("gross pay is = " +a[temp]);
        }
        
      
  
    }  

}