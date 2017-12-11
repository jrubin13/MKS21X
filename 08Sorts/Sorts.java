import java.util.Arrays;
public class Sorts{
    public static String name() {
	return "09,Rubin,Jeremy";
    }
    
    public static void selectionSort(int[] data) {
	int place;
	int store = 0;
	for (int i = 0; i < data.length; i++) {
	    store = i;
	    for (int x = i+1; x < data.length; x++) {
		if (data[x] < data[store]) {
		    store = x;
		}
	    }
	    place = data[i];
	    data[i] = data[store];
	    data[store] = place;
	}
    }

    private static void swap(int[]ary, int a, int b){
        int c =ary[a];                                                          
        ary[a] = ary[b];                                                        
        ary[b] = c;                                                             
    }
    
    public static void insertionSort(int[] data) {
	for (int i = 1; i < data.length; i++) {
	    for (int x = i; x > 0; x--) {
		if (data[x] < data[x-1]){
		    swap(data, x, x-1);
		}
	    }
	}
    }

    public static void bubbleSort(int[] data) {
	int i = 0;
	boolean swap = true;
	while (swap == true;) {
	    if (data[i] > data[i+1]) {
		swap(data, data[i], data[i+1]);
		swap = true;
	    }
	    i++;
	    if (i == data.length -1) {
		if (swap == true) {
		    i = 0;
		}
		if (swap == false) {
		    system.exit(0);
		}
		swap = false;
	    }
	}
    }
    
    public static void main(String[] args) {
        int[] randish = new int[15];                                           
        for(int i = 0 ; i < randish.length; i++){                               
            randish[i] =(int)(Math.random()*100);                               
        }                                                                       

        System.out.println(Arrays.toString(randish));                           
	bubbleSort(randish);                                              
        System.out.println(Arrays.toString(randish));
    }
}
