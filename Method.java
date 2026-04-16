class Calculator{
    void add(int a,int b){
        int sum=a+b;
        System.out.println("sum="+sum);
    }
}
public class Method{
    public static void main(String[]args){
        Calculator c=new Calculator();
        c.add(10,20);
    }
}