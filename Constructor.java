class Studentdata{
    int id;
    String name;
    Studentdata(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class Constructor{
    public static void main(String[]args){
        Studentdata s1=new Studentdata(101,"Amit");
        Studentdata s2=new Studentdata(102,"Riya");

        s1.display();
        s2.display();
    }
}