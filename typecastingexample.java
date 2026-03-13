class typecastingexample{
    public static void main(String[]args){

        int a=10;
        double b=a;
        System.out.println("widening:"+b);

        double x=9.78;
        int y=(int)x;
        System.out.println("narrowing:"+y);
    }
}