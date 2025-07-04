package String;

public class Strings {

	public static void main(java.lang.String[] args) {
		String s="Hello World";
		
		System.out.println(s.charAt(3)); //will print 3rd index character
		System.out.println(s.indexOf("W"));;   //will print index number ow W
		
		System.out.println(s.substring(2, 7));   //will print word start from 2nd index to 7 index
		
		System.out.println(s.substring(4));   //will print start from 4th char to end
		
		System.out.println(s.concat("enjoy"));  //concat this string with previous string
		
		System.out.println(s.length());  //total length of string
		
		System.out.println(s.trim());    //trim the string by spaces
		
		System.out.println(s.toUpperCase());  //convert string to upper case
		
		
		System.out.println(s.toLowerCase());  //convert to lower cases
		
		
		String arr[]=s.split("r");   //it will split string into arrays from r
		
		System.out.println(arr[0]);  // print split string at 0th index
		System.out.println(arr[1]); //print split string at 1st index
		
		System.out.println(s.replace("o","i"));
		
		
		

	}

}
