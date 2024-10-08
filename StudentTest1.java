package Assignment5;
public class StudentTest1 {
    public static void main(String[] args) {
        
        Student[] students = new Student[10];

        
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(); 
        }

        
        students[0].setInfo("Alice", 20, "123 Main St");
        students[1].setInfo("Bob", 21, "456 Maple Ave");
        students[2].setInfo("Charlie", 22, "789 Elm St");
        students[3].setInfo("Diana", 19, "321 Oak St");
        students[4].setInfo("Ethan", 23, "654 Pine St");
        students[5].setInfo("Fiona", 20, "987 Cedar St");
        students[6].setInfo("George", 22, "159 Birch St");
        students[7].setInfo("Hannah", 21, "753 Spruce St");
        students[8].setInfo("Isaac", 19, "951 Walnut St");
        students[9].setInfo("Julia", 20, "852 Chestnut St");

       
        for (Student student : students) {
            student.printInfo();
        }
    }
}


