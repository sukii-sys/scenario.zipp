import java.util.Scanner;
public class RickshawFare{
    public static void main(String[] agrs){
        Scanner sc = new Scanner (System.in);
        System.out.println("============ RickshawFare Calculator =================");
        System.out.print("Please Enter your travelled distance in 'KM' : ");
        double distance = sc.nextDouble();
        System.out.print("\nPlease Enter your travelled time in 'min' : ");
        double time = sc.nextDouble();
        sc.nextLine();
        System.out.print("\nLocal Customer? : (Y/N)");
        boolean local = sc.nextLine().trim().equalsIgnoreCase("y");
        System.out.print("\nNight Time? : (Y/N)");
        boolean night = sc.nextLine().trim().equalsIgnoreCase("y");
        System.out.println("------------------------------------------------------");
        int baseFare = 20;
        int ratePerKM = 10;
        int ratePerMin= 2;
        double SubTotal = baseFare + (ratePerKM * distance) + (ratePerMin * time);
        double nightcharge = night ? (SubTotal * 0.20) : 0;
        double discount = (local && distance > 2) ? (SubTotal * 0.10) : 0;
        double grandtotal = SubTotal + nightcharge -discount;
        System.out.println("\n------------------------------------------------------");
        System.out.println("Your Total Fare Price is :"+ grandtotal);
        System.out.println("Please Travel with us Again and Have a GOOD DAY");
        System.out.println("------------------------------------------------------");
        sc.close();
    }
}