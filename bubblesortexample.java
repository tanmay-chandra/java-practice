//bubble sort-it repeatedly compares adjacent elements&swaps them if they are in wrong order

public class bubblesortexample{
    public static void bubblesort(int[]arr){
        int n=arr.length;
        boolean swapped;
        for(int i=0;i<n-1;i++){         //outer loop to check rounds
            swapped=false;              //assume no swapping happened
        for(int j=0;j<n-i-1;j++){       //inner loop,compares nearby elements

            if(arr[j]>arr[j+1]){        //swapping as ascending to descending

                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;

            }
        }
        
        if(!swapped)break;
    }
}
public static void main(String[]args){

    int[]arr={5,3,1};
    bubblesort(arr);
    for(int num:arr)
        System.out.println(num+"");

}
}