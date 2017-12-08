import java.util.Arrays;
public class Sorts{
    public static String name() {
	return "09.Rubin.Jeremy";
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
    public static void main(String[] args) {
        int[] randish = new int[15];                                           
        for(int i = 0 ; i < randish.length; i++){                               
            randish[i] =(int)(Math.random()*100);                               
        }                                                                       

        System.out.println(Arrays.toString(randish));                           
	insertionSort(randish);                                              
        System.out.println(Arrays.toString(randish));
    }
}
