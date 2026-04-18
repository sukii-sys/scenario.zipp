import java.util.Scanner;
public class Scholarship{
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the GPA of student(0.0 to 4.0) :");
        double gpa = sc.nextDouble();
        if (gpa<0.0 && gpa>4.0){
            System.out.println("Invalid GPA");
        }
        else if(gpa > 3.6){
            System.out.println("Grade: A+");
        }
        else if(gpa > 3.2){
            System.out.println("Grade: A");
        }
        else if(gpa > 2.8){
            System.out.println("Grade: B+");
        }
        else if(gpa > 2.4){
            System.out.println("Grade: B");
        }
        else if(gpa > 2.0){
            System.out.println("Grade: C+");
        }
        else if(gpa > 1.6){
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Failed");
        }
        if (gpa >= 3.6){
            System.out.println("You are Eligible for a Scholarship.");
        }
        sc.close();
    }
}