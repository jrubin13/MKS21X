import java.util.*; //random, scanner, arraylist
import java.io.*; //file, filenotfoundexception

public class WordSearch{
    private char[][]data;
    private ArrayList<String> wordsToAdd = new ArrayList<String>();
    private ArrayList<String> wordsAdded = new ArrayList<String>();
    private Random randgen;
    private int row = 0;
    private int col = 0;

    public WordSearch(int rows, int cols, String fileName) {
	row = rows;
	col = cols;
	data = new char[row][col];
	clear();                          //makes it all "_"
	//System.out.println(data);
	int seed = (int)(Math.random()*100000);
	System.out.println("Seed: " + seed);
	randgen = new Random(seed);      //random
	try{
	    File f = new File(fileName);//can combine
	    Scanner in = new Scanner(f);//into one line
	    while(in.hasNext()){
		String word = in.next();
	        word = word.toUpperCase();
		wordsToAdd.add(word);      //put all the words in the array list
	    }
	    
	}catch(FileNotFoundException e){
	    System.out.println("File not found: " + fileName);
	    System.out.println("Please input correct file name");
	    //e.printStackTrace();
	    System.exit(1);
	}
	addAllWords();
	System.out.println("These are in the puzzle: " + wordsAdded); //print words that worked
	//for (int i = 0; i < data.length; i++) {
	//  System.out.println(data[i]);
	//}
	addRandLetters(); //fill in "_" with random letters
    }
    public WordSearch(int rows, int cols, String fileName, int randSeed) {
	row = rows;     //same as ^^ except with a given randomseed
	col = cols;
	data = new char[row][col];
        clear();
	int seed = randSeed;
	System.out.println("Seed: " + seed);
	randgen = new Random(seed);
	try{
	    File f = new File(fileName);//can combine
	    Scanner in = new Scanner(f);//into one line
	    while(in.hasNext()){
		String word = in.next();
		word = word.toUpperCase();
		wordsToAdd.add(word);
	    }
	    
	}catch(FileNotFoundException e){
	    System.out.println("File not found: " + fileName);
	    System.out.println("Please input correct file name");
	    //e.printStackTrace();
	    System.exit(1);
	}
	addAllWords();
	System.out.println("These are in the puzzle: "+ wordsAdded);
	addRandLetters();
    }
    public WordSearch(int rows, int cols, String fileName, int randSeed, String solution){
	row = rows;
	col = cols;
	data = new char[row][col];
        clear();
	int seed = randSeed;
	System.out.println("Seed: " + seed);
	randgen = new Random(seed);
	try{
	    File f = new File(fileName);//can combine
	    Scanner in = new Scanner(f);//into one line
	    while(in.hasNext()){
		String word = in.next();
		word = word.toUpperCase();
		wordsToAdd.add(word);
	    }
	    
	}catch(FileNotFoundException e){
	    System.out.println("File not found: " + fileName);
	    System.out.println("Please input correct file name");
	    //e.printStackTrace();
	    System.exit(1);
	}
	addAllWords();                   //only difference is don't call addRandLetters()
    }

    private boolean addRandLetters() {
	for (int i = 0; i < row; i++) {
	    for (int x = 0; x < col; x++) {
		if (data[i][x] == '_') { 
		    data[i][x] = (char)((randgen.nextInt(13))+13+65);  //use ascii values
		}
	    }
	}
	return true;
    }
    
    private boolean addWord(int r, int c, String word, int rowIncrement, int colIncrement) {
	if (rowIncrement == 0 && colIncrement == 0) {
	    return false;
	}
        if (col < c+(colIncrement*word.length()) ||     //goes off the grid
	    0 > c+(colIncrement*word.length()) ||
	    row < r+(rowIncrement*word.length()) ||
	    0 > r+(rowIncrement*word.length())) {
	    return false;
	}
	int x = 0;
	int y = 0;
	for (int i = word.length(); i > 0; i--) {
	    if (data[r+x][c+y] != '_' && data[r+x][c+y] != word.charAt(i-1)) {
		return false;
	    }
	    x += rowIncrement;
	    y += colIncrement;
	}
	x = 0;
	y = 0;
	for (int i = word.length(); i > 0; i--) {  //if it's still good, add it in
	    data[r+x][c+y] = word.charAt(i-1);
	    x += rowIncrement;
	    y += colIncrement;
	}
        return true;
    }
    private boolean addAllWords() {
	int rowInc = 0;
	int colInc = 0;
	int tries = 0;
	int horizontal = 0;
	int vertical = 0;
        for (int i = 0; i < wordsToAdd.size(); i++) {
	    tries = 0;
	    while (tries < 1000) {
	        rowInc = randgen.nextInt(3)-1;   //randomize everything
		colInc = randgen.nextInt(3)-1;
		horizontal = randgen.nextInt(col);
		if (horizontal < 0) {
		    horizontal = horizontal * -1;  //if this is negative, make it a positive place
		}
		vertical = randgen.nextInt(row);
		if (vertical < 0) {
		    vertical = vertical * -1;
		}
		if (addWord(vertical, horizontal, wordsToAdd.get(i),rowInc,colInc)) {
		    wordsAdded.add(wordsToAdd.get(i)); //add it to wordsAdded
		    tries = 1000;                      //if it adds, end the loop
		}
		tries += 1;
	    }
	}
	return true;
    }
    private void clear(){
	for (int i = 0; i < data.length; i++) {            //reset all to "_"
	    for (int x = 0; x < data[i].length; x++) {
		data[i][x] = '_';
	    }
	}
    }

    public String toString(){             
	String ans = "";
	for (int i = 0; i <= row; i++) {
	    for (int x = 0; x <= col; x++) {
		ans += data[i][x] + " ";
	    }
	    ans += "\n";
	}
	return ans;
    }




    
    public boolean addWordHorizontal(String word,int row, int col){
	int len = word.length();
	if (col + len > data[0].length || row > data.length) {
	    return false;
	}
	for (int i = col; i < col+len; i++) {
	    if (data[row][i] != '_' && data[row][i] != word.charAt(i-row)) {
		return false;
	    }
	}
	int place = 0;
	for (int i = col; i < len+col; i++) {
	    data[row][i] = word.charAt(place);
	    place += 1;
	}
	return true;
    }

    public boolean addWordVertical(String word,int row, int col){
	int len = word.length();
	if (row + len > data.length || col > data[0].length) {
	    return false;
	}
	for (int i = row; i < row+len; i++) {
	    if (data[i][col] != '_' && data[i][col] != word.charAt(i-row)) {
		return false;
	    }
	}
	int place = 0;
	for (int i = row; i < row+len; i++) {
	    data[i][col] = word.charAt(place);
	    place += 1;
	}
	return true;
    }
    public boolean addWordDiagonal(String word,int row, int col){
	int len = word.length();
	if (row + len > data.length || col > data[0].length) {
	    return false;
	}
	if (col + len > data.length || row > data[0].length) {
	    return false;
	}
	int x = 0;
	for (int i = row; i < row+len; i++) {
	    if (data[i][col+x] != '_' && data[i][col+x] != word.charAt(i-row)) {
		return false;
	    }
	    x++;
	}
	x = 0;
	for (int i = col; i < col+len; i++) {
	    if (data[row+x][i] != '_' && data[row+x][i] != word.charAt(i-row)) {
		return false;
	    }
	    x++;
	}
	int place = 0;
	for (int i = row; i < row+len; i++) {
	    data[i][i] = word.charAt(place);
	    place += 1;
	}
	return true;
    }
    

    
    public static void main(String[] args) {
	String bad = "Please enter the info as follows: java WordSearch [rows cols filename [Seed [answers]]]. The brackets mean that piece of information is optional. Rows and cols are the size parameters for the grid and filename is the text file that contains the words you would like to put into the puzzle. Seed is the number that will return the same puzzle, and by typing in 'key' for answers, a solution puzzle will show instead.";
	int a = 0;
	int b = 0;
	int seed = 0;
        if (args.length < 3) {
	    System.out.println(bad);
	    System.exit(0);
	}
	else if (args.length == 3) {
	    try{
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
	    } catch (IllegalArgumentException error) {
		System.out.println(bad);
		System.exit(1);
	    }catch (NegativeArraySizeException error) {
		System.out.println(bad);
		System.exit(1);
	    }
	    String file = args[2];
	    if (a <= 0 || b <= 0) {
		System.out.println(bad);
		System.exit(1);
	    }
	    System.out.println("\n");
	    WordSearch test = new WordSearch(a, b, file);
	    System.out.println("\n");
	    for (int i = 0; i < test.data.length; i++) {
		System.out.println(test.data[i]);
	    }
	    System.out.println("\n");
	}
	else if (args.length == 4) {
	    try{
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		seed = Integer.parseInt(args[3]);
	    } catch (IllegalArgumentException error) {
		System.out.println(bad);
		System.exit(1);
	    } catch (NegativeArraySizeException error) {
		System.out.println(bad);
		System.exit(1);
	    }
	    String file = args[2];
	    if (a <= 0 || b <= 0) {
		System.out.println(bad);
		System.exit(1);
	    }
	    System.out.println("\n");
	    WordSearch test = new WordSearch(a, b, file, seed);
	    System.out.println("\n");
	    for (int i = 0; i < test.data.length; i++) {
		System.out.println(test.data[i]);
	    }
	    System.out.println("\n");
	}
	else {
	    try{
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		seed = Integer.parseInt(args[3]);
	    } catch (IllegalArgumentException error) {
		System.out.println(bad);
		System.exit(1);
	    }catch (NegativeArraySizeException error) {
		System.out.println(bad);
		System.exit(1);
	    }
	    String file = args[2];
	    String solution = args[4];
	    if (a <= 0 || b <= 0) {
		System.out.println(bad);
		System.exit(1);
	    }
	    if (solution.equals("key")) {
		System.out.println("\n");
		WordSearch test = new WordSearch(a, b, file, seed, solution);
		System.out.println("\n");
		for (int i = 0; i < test.data.length; i++) {
		    System.out.println(test.data[i]);
		}
		System.out.println("\n");
	    }
	    else {
		System.out.println("\n");
		WordSearch test = new WordSearch(a, b, file, seed);
		System.out.println("\n");
	        for (int i = 0; i < test.data.length; i++) {
		    System.out.println(test.data[i]);
		}
		System.out.println("\n");
	    }
	}
    }
}
