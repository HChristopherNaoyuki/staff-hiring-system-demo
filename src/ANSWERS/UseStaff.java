package ANSWERS;

import java.util.Scanner;

public class UseStaff
{
    public static void main(String[] args)
    {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the current staff number
        System.out.print("Enter the current staff number: ");
        int staffNumber = scanner.nextInt();

        // Prompt the user to enter the staff hiring location
        System.out.print("Enter the staff hiring location: ");
        String staffLocation = scanner.next();

        // Create a StaffHiring object using the provided staff number and location
        StaffHiring staffHiring = new StaffHiring(staffNumber, staffLocation);

        // Print the staff hiring report
        staffHiring.printStaffHiring();

        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}
