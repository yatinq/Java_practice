package dataTypes;

public class ByteOverflow {

	public static void main(String[] args) {
		byte b=127;
		b++;
		System.out.println("After overflow: "+b);   // output :-128

	}

}
