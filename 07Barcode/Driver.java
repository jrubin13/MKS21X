public class Driver{
    public static void main(String[] args){

	Barcode e = new Barcode("00000"); //Contains non-barcode characters, should throw IllegalArgumentException
	Barcode f = new Barcode("12345");
	System.out.println(e);
	System.out.println(e.getZip());
	System.out.println(e.getCode());
	System.out.println(e.compareTo(f));

	//	Barcode f = new Barcode("1234"); //Invalid length, should throw IllegalArgumentException

	//      System.out.println(Barcode.toCode("00294")); // |||:::||:::::|:||:|:::|::|:|:|:|
	//	System.out.println(Barcode.toCode("asdfd")); //Contains non-barcode characters, should throw IllegalArgumentException
	//	System.out.println(Barcode.toCode("1234")); //Invalid length, should throw IllegalArgumentException

	//	System.out.println(Barcode.toZip("|||:::||:::::|:||:|:::|::|:|:|:|")); //Should return 00294
	//	System.out.println(Barcode.toZip("|:::||:::||::|:|:|::|:|:|:::||:")); //Invalid length, should throw IllegalArgumentException
	//	System.out.println(Barcode.toZip("|:::||:::||::|:|:|::|:|:|:::||||")); //Incorrect checksum, should throw IllegalArgumentException
	//	System.out.println(Barcode.toZip("|a::||:::||::|:|:|::|:|:|:::||:|")); //Contains non-barcode characters, should throw IllegalArgumentException
	//	System.out.println(Barcode.toZip("::::||:::||::|:|:|::|:|:|:::||:|")); //First character is not '|', should throw IllegalArgumentException
	//	System.out.println(Barcode.toZip("|:::||:::||::|:|:|::|:|:|:::||::")); //Last character is not '|', should throw IllegalArgumentException
	//	System.out.println(Barcode.toZip("|::::::::||::|:|:|::|:|:|:::||:|")); //Invalid character sequence, should throw IllegalArgumentException
    }
}
