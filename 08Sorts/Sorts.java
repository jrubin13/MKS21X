import java.util.Arrays;
public class Sorts{
    public static String name() {
	return "09.Rubin.Jeremy";
    }
    
    public static void selectionSort(int[] data) {
	int small = data[0];
	int store = 0;
	int place = 0;
	for (int i = 0; i < data.length; i++) {
	    for (int x = i+1; x < data.length; x++) {
		if (data[x] <= small) {
		    small = data[x];
		    place = x;
		}
	    }
	    store = data[i];
	    data[i] = small;
	    data[place] = store;
	}
    }
    public static void main(String[] args) {
        int[] randish = new int[15];                                           
        for(int i = 0 ; i < randish.length; i++){                               
            randish[i] =(int)(Math.random()*100);                               
        }                                                                       

        System.out.println(Arrays.toString(randish));                           
	selectionSort(randish);                                              
        System.out.println(Arrays.toString(randish));
    }
}
