package ANSWERS;

// Define the StaffHiring subclass that extends the abstract Staff class
public class StaffHiring extends Staff
{
    // Constructor to initialize staff number and location
    public StaffHiring(int staffNumber, String staffLocation)
    {
        super(staffNumber, staffLocation);
    }

    // Implement the getStaffHiringProcess method
    @Override
    public String getStaffHiringProcess()
    {
        // Determine hiring eligibility based on staff number
        if (getStaffNumber() < 20)
        {
            return "YES"; // Eligible for hiring
        }
        else
        {
            return "NO"; // Not eligible for hiring
        }
    }

    // Method to print staff hiring details
    public void printStaffHiring()
    {
        System.out.println();
        System.out.println("STAFF HIRING REPORT");
        System.out.println("********************");
        System.out.println("LOCATION: " + getStaffLocation());
        System.out.println("STAFF NUMBER: " + getStaffNumber());
        System.out.println("HIRE STAFF: " + getStaffHiringProcess());
        System.out.println();
    }
}
