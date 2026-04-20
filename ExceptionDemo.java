class ExceptionDemo{
    static void checkNumber(int num)throws ArithmeticException{
        if (num<0){
            throw new ArithmeticException("negative no. not allowed");
        }
    }
public static void main(String[]args){
    try{
        int a=10/0;
        int arr[]=new int[3];
        arr[5]=10;
        Object x[]=new String[2];
        x[0]=Integer.valueOf(10);
        checkNumber(-5);
    }
    catch(ArithmeticException e){
        System.out.println("arithmetic exception caught:"+e);

    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBoundsException caught:"+e);
    }
    catch(ArrayStoreException e){
        System.out.println("array store exception caught:"+e);
    }
    finally{
        System.out.println("finallyblock executed");
    }
}
}
