// Create java project using constuctor using setter and getter for employee having id ,name,salary.
package Constructor;

class Employee {
    // 1. Instance Variables (Moved to top for readability)
    private int id;
    private String name;
    private float salary;
    private String ssn;

    // 2. Added the missing Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 3. Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}

public class Constructor_Using_Setter_Getter {
     public static void main(String[] args) {

            // This will now work perfectly!
            Employee Manu = new Employee(143, "Manu Pratap Singh");

            // Setting remaining values using setters
            Manu.setSalary(75000.0f);
            Manu.setSsn("123-45-6789");

            // Displaying values using getters
            System.out.println("Employee ID: " + Manu.getId());
            System.out.println("Employee Name: " + Manu.getName());
            System.out.println("Employee Salary: " + Manu.getSalary());
            System.out.println("Employee SSN: " + Manu.getSsn());
        }
}