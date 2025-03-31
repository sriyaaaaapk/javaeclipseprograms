package javasem;
public class numbertostring {
	
	static void numeric(String S) {
		String output="";
		int sum=0;
		for (char ch : S.toCharArray()) {
			if (ch>= '0' && ch<='9') {
				/* adding numbers in string
				String charr= String.valueOf(ch);
				int d= Integer.parseInt(charr);
				sum=sum+d;*/
				/* concatenates 
				 * String charr= String.valueOf(ch);
				 
				output=output + charr;*/
			}
		}
		System.out.println(output);
	}
	static void replace(String S) {
		String output="";
		for (char ch : S.toCharArray()) {
			if (ch>= '0' && ch<='9') {
				output=output + "*";
			}
				else {
				String charr= String.valueOf(ch);
				output=output + charr;
			}
		}
		System.out.println(output);
	}
	
	static void longest(String S) {
		int max=0;
		String[] words=S.split(" ");
		for(String w: words) {
			int l=w.length();
			if(l>max) {
				max=l;
			}
		}
		System.out.println(max);
		for(String w: words) {
			if(w.length()==max) System.out.println(w);
		}
	}
	
	static void reversesentence(String S) {
		String[] words= S.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
		
		System.out.println(result);
	}
	
	static String reverseboth(String S) {
		 StringBuilder reversed = new StringBuilder();
	        for (int i = S.length() - 1; i >= 0; i--) {
	            reversed.append(S.charAt(i));
	        }
	        return reversed.toString();
	}
	static void checkStartEnd(String S) {
	    if (S.charAt(0) == S.charAt(S.length() - 1))
	    	System.out.println(true);
	    else System.out.println(false);
	}
	static String reversevowel(String S) {
	char[] arr = S.toCharArray();
    int i = 0, j = S.length() - 1;
    String vowels = "aeiouAEIOU";

    while (i < j) {
        while (i < j && vowels.indexOf(arr[i]) == -1) i++;
        while (i < j && vowels.indexOf(arr[j]) == -1) j--;

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        i++;
        j--;
    }
    return new String(arr);
}
	
	static void swap(String S) {
		String[] words = S.split(" ");
	    if (words.length < 2) System.out.println(S);

	    String temp = words[0];
	    words[0] = words[words.length - 1];
	    words[words.length - 1] = temp;

	    System.out.print(String.join(" ", words));
	}
	
	static String removeConsecutiveDuplicates(String S) {
	StringBuilder result = new StringBuilder();
    for (int i = 0; i < S.length(); i++) {
        if (i == 0 || S.charAt(i) != S.charAt(i - 1)) {
            result.append(S.charAt(i));
        }
    }
    return result.toString();
	}

	public static void main(String[] args)
	{ String S="I am sriya born on 1/10/2005";
	numeric(S);
	/*  String S="aabbbcccc";
		System.out.println(removeConsecutiveDuplicates(S));
		checkStartEnd(S.toLowerCase());
		("Original Sentence: " + S);
        System.out.println("Reversed Sentence: " + reverseboth(S));
		reverseboth(S);
		

	reversesentence(S);
	longest(S); */
		
	/*String Int = "234"; // A string that represents an integer 
	//If Int ="234.21" gives Error, Wrong format!
	try {
	    int i = Integer.parseInt(Int); // Converts "234" to an integer
	    System.out.println(i + 6); // Output: 240
	} catch (NumberFormatException e) {
	    System.out.println("Wrong Format"); //f Int contains non-numeric characters (e.g., "abc"), NumberFormatException is thrown, and "Wrong Format" is printed.
	}
	String Dbl = "3";  // A string that represents a floating-point number
	//
	try {
	    double d = Double.parseDouble(Dbl); // Converts "3.1416" to a double
	    System.out.println(d + 0.8584); // Output: 4.0000
	} catch (NumberFormatException e1) {
	    System.out.println("Wrong Format");
	}*/
}
}
/*import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        String input = scanner.nextLine(); // Read input as a string
        
        try {
            int number = Integer.parseInt(input); // Convert string to integer
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format! Please enter a valid integer.");
        }

        scanner.close();
    }
}
*/
