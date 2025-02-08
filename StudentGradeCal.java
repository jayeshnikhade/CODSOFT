import java.util.*;

public class StudentGradeCal 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("There are five subjects namely:- Physics, Chemistry, Biology, Mathematics, English");
        System.out.println("Please Enter the marks obtained in each subject respectively out of 100");

        //Taking marks of each subject as input from the user

        System.out.println("Marks obtained in Physics: ");
        int physmarks = sc.nextInt();
        System.out.println("Marks obtained in Chemistry: ");
        int chemamrks = sc.nextInt();
        System.out.println("Marks obtained in Biology: ");
        int biomarks = sc.nextInt();
        System.out.println("Marks obtained in Mathematics: ");
        int mathmarks = sc.nextInt();
        System.out.println("Marks obtained in English: ");
        int engmarks = sc.nextInt();

        //Summing the marks obtained in all the subjects

        int totalmarks = physmarks + chemamrks + biomarks + mathmarks + engmarks;

        //Calculating the Average Percentage

        int avgper = totalmarks / 5;

        //Displaying the Total Marks obtained 

        System.out.println("Total marks: " + totalmarks);

        //Displaying the Avergae Percentage
        System.out.println("Average Percentage: " + avgper + "%");

        //Assigning grades based on the obtained percentage and displaying it

        System.out.println("You have got the grades: ");
        
        if(avgper >= 80)
        {
            System.out.println("O: Outstanding");
        }
        if(avgper >= 70 && avgper <= 79)
        {
            System.out.println("A+: Excellent");
        }
        if(avgper >= 60 && avgper <= 69)
        {
            System.out.println("A: Very Good");
        }
        if(avgper >= 55 && avgper <= 59)
        {
            System.out.println("B+: Good");
        }
        if(avgper >= 50 && avgper <= 54)
        {
            System.out.println("B: Above Average");
        }
        if(avgper >= 45 && avgper <= 49)
        {
            System.out.println("C: Average");
        }
        if(avgper >= 40 && avgper <= 44)
        {
            System.out.println("P: Pass");
        }
        if(avgper >= 0 && avgper <= 39)
        {
            System.out.println("F: Fail");
        }
    }
}
