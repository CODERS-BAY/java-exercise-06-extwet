import java.util.Arrays;



public class Sorting {

    public static void main(String[] args) {
        int[] arr = {44, 18, 1, 6, 9, 37};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    /* quelle: https://pdfs.semanticscholar.org/96df/d978e9636978b0769209423edf9422886269.pdf
    * Indem man kleine Elemente direkt nach links, und große Elemente nach recht bringt,
    *  kann man das Array in einem Durchlauf partitionieren,
    * in drei Bereiche aufteilen, die alle kleinen, das Pivot bzw .alle großen
    * Elemente beinhalten. Erste und letztere sortiert man anschließend
    * unabhängig voneinander rekursiv mit
    * dem gleichen Verfahren,solange das Teilarray mehr als ein Element umfasst.*/


    public static void quickSort(int[] arr, int start, int end){

        int partition = partition(arr, start, end);     //in der partition

        if(partition-1>start) {
            quickSort(arr, start, partition - 1);
        }
        if(partition+1<end) {
            quickSort(arr, partition + 1, end);
        }
    }
    /*der Rang des Pivots ist die Anzahl der Elemente,
     die kleiner als das Pivot sind,
     und damit die Position des Pivots
     im sortierten Array.*/

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];

        for(int i=start; i<end; i++){
            if(arr[i]<pivot){
                int temp= arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
            }
        }

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }
}