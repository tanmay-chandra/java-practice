class Student {
    int id;
    String name;

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 101;
        student.name = "tanmay";
        student.display();
    }
}
