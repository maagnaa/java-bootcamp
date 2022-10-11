public class Employee {

    // Fields belong to an object
    private String name;
    private String position;

    // ... but static variables belong to a class
    private static int hiredCount; 
    private static final String COMPANY_NAME = "JAVASTARS";

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
        hiredCount ++;
    }
  
    public Employee(Employee source) {
        this.name = source.name;
        this.position = source.position;
    }

    public String getName() {
        return name;
    }
    
    public String getPosition() {
        return position;
    }
  
    // A static method can only access static variables 
    public static int getHiredCount() {
        return hiredCount;
    }

    public static String getCompanyName() {
        return COMPANY_NAME;
    }

    public void greet(String company) {
        if (company.equals(COMPANY_NAME)) {
            System.out.println("Welcome!");
        }
    }


    public String toString() {

        return "\tName: " + name + "\tPosition: " + this.position + "\tCompany: " + COMPANY_NAME + "\n";
    }
}
