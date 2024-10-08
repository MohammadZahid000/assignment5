package Assignment5;

public class MultilevelInheritanceTest {
    public static void main(String[] args) {
        
        HRManager hrManager = new HRManager("Alice", 35, 80000.0);
        
        
        hrManager.displayDetails();
        
        
        hrManager.work();                   
        hrManager.addEmployee("John Doe");  
        System.out.println("Salary: " + hrManager.getSalary()); 
    }
}

