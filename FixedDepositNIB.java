import java.util.Scanner;
public class FixedDepositNIB{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char ch = 'y';
        do{
        System.out.print("Enter deposit amount (Minimum Rs.1000): ");
        double P = sc.nextDouble();
        if(P<1000){
            System.out.println("Deposit must be atleast Rs.1000");
            continue;
        }
        System.out.print("Enter annual intrest rate (8% - 12%): ");
        double annualRate = sc.nextDouble();
        if(annualRate < 7 || annualRate>13){
            System.out.println("Annual Intrest Rate must be between 8% and 12%");
            continue;
        }
        System.out.print("Enter duration (years): ");
        int year = sc.nextInt();
        if(year<0||year>6){
            System.out.println("Duration must be 1 to 5 years");
            continue;
           }
        double mrate = annualRate/100/12; 
        int month = year *12;
        double A = P; 
        double feeRate = 0.005;
        double fee =  P * feeRate;
        int i =1;
        while(i<= month){
            A = A*(1+mrate);
            i++;
        }
        double total = A -fee;
        System.out.println("\n ------------ Fixed Deposit Detail -----------");
        System.out.println("The Original Deposit : "+ P);
        System.out.println("The Intrest Rate : "+ annualRate+ "%");
        System.out.println("The Duration : "+ year +"years");
        System.out.println("The Total Amount : Rs. " + A);
        System.out.println("The Processing Fee : "+ fee);
        System.out.println("Final Amount: Rs. "+ total);
        
        System.out.print("\nDo another calculation? (y/n): ");
        ch = sc.next().charAt(0);
        }while(ch == 'Y'|| ch == 'y');
        sc.close();
    }
}