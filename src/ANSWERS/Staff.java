package ANSWERS;

// Define the abstract Staff class that implements the iStaff interface
public abstract class Staff implements iStaff
{
    private final int staffNumber;   // Staff's unique number
    private final String staffLocation; // Staff's hiring location

    // Constructor to initialize staff number and location
    public Staff(int staffNumber, String staffLocation)
    {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    // Get method for retrieving the staff number
    @Override
    public int getStaffNumber()
    {
        return staffNumber;
    }

    // Get method for retrieving the staff location
    @Override
    public String getStaffLocation()
    {
        return staffLocation;
    }

    // Abstract method that must be implemented by subclasses to define the hiring process
    @Override
    public abstract String getStaffHiringProcess();
}
