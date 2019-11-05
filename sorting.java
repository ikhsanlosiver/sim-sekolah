import java.util.Random;
public class BubbleSort {
    void bubbleSort(int arr[]) {
        System.out.println("Bubble Sorting");
        System.out.print("Data Sebelum di Sorting : ");
        for(int x = 0; x < 10; x++)
            System.out.print(arr[x]+" ");
        int n = arr.length;
        int p=1;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.print("\nProses iterasi ke-"+p+" :");
                    p++;
                     for(int x = 0; x < 10; x++)
            System.out.print(arr[x]+" ");
                }
    }

    void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    int[] mantul(){
        int arr[]=new int[10];
        Random d=new Random();
        for(int x=0;x<10;x++){
            arr[x]= d.nextInt(100);
        }
        return arr;
    }

    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
       int arr[]=ob.mantul();
        ob.bubbleSort(arr);
        System.out.println("");
        System.out.print("Data Setelah di Sorting : ");
        ob.printArray(arr);
    }
}
