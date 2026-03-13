import java.util.Vector;

class vectorexample{
    public static void main(String[]args){
        Vector<String>v=new Vector<>();

        v.add("car");
        v.add("bike");
        v.add("bus");

        for(String item:v){
            System.out.println(item);
            
        }
    }
}