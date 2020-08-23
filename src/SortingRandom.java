import java.util.Random;

public class SortingRandom { //ich bau mir ein array
    public int[] arr;

    public SortingRandom(int[] arr) {                   //aktualisierung des arrays
        this.arr = arr;
    }
public static void main(String[] args) {            //Befüllung mit randomwerten und generiere methode SortinRandom
        SortingRandom quickSort = new SortingRandom(initRandomArray (10,100));
        quickSort.sort();
    }

private static int[] initRandomArray(int range, int size) {     //Länge und Werte<100
        int[] arr = new int[range];
        for (int i = 0; i < range; i++) arr[i] = new Random().nextInt(size);
        return arr;
    }

public void sort() {                                //beginn der sortierung der länge des Arrays -unten mit range gestzt
        sort(0, arr.length - 1);
    }

public void sort(int first, int last) {             //vergleich immer die letzte und erste einheit des array
        if (last - first < 1) return;

        int pivot = arr[last];                           // fülle die pivot array mit den werten
        System.out.println("Array Sortiert");
        int index = first - 1;
            printArray();

    }

public void swap(int first, int second) {           //wertetausch
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

private void printArray() {                         //
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
