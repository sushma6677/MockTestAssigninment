package Test1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class UniqueChar {
	public static int firstUniqChar(String s) {
	    Map<Character, Integer> charCount = new HashMap<>();

	    // Count the frequencies of each character
	    for (char c : s.toCharArray()) {
	        charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	    }

	    // Find the first non-repeating character
	    for (int i = 0; i < s.length(); i++) {
	        if (charCount.get(s.charAt(i)) == 1) {
	            return i;
	        }
	    }

	    return -1; // No non-repeating character found
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s=sc.next();
		
		System.out.println(firstUniqChar(s));

	}

}