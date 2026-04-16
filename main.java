class student{
    int id;
    String name;
    void display(){
        System.out.println("Student ID:"+id);
        System.out.println("Student Name:"+name);
    }
}

public class main{
    public static void main(String[]args){

        student s=new student();
        s.id=101;
        s.name="tanmay";
        s.display();
    }
}
