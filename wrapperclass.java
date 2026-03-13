class wrapperclass{
    public static void main(String[]args){
        int num=10;
        Integer obj=Integer.valueOf(num);
        int newnum=obj.intValue();

        System.out.println("Wrapper Object:"+obj);
        System.out.println("primitive value:"+newnum);
        
    }
}