import java.util.Scanner;
public class GPA
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double gpa;
    
        while (true) 
        {
            System.out.print("Enter GPA (0.0 - 4.0): ");
            gpa = sc.nextDouble();

            if (gpa >= 0.0 && gpa <= 4.0) {
                break;
            } 
            else 
            {
                System.out.println("Invalid GPA! Try again.");
            }
        }
        if (gpa >= 3.6) {
            System.out.println("Grade: A");
        } else if (gpa >= 3.2) {
            System.out.println("Grade: B+");
        } else if (gpa >= 2.8) {
            System.out.println("Grade: B");
        } else if (gpa >= 2.4) {
            System.out.println("Grade: C+");
        } else if (gpa >= 2.0) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}