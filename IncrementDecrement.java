public class IncrementDecrement{
    public static void main(String[]args){
        int a=5;

        System.out.println("Post Increment:"+(a++));
        System.out.println("after post increment:"+a);

        System.out.println("Pre increment"+(++a));
        
        System.out.println("Post decrement"+(a--));
        System.out.println("after post decrement"+a);

        System.out.println("Pre decrement:"+(--a));
    }
}