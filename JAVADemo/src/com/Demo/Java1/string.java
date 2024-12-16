package com.Demo.Java1;

public class string {
	public static String removeTwoCharacters(String str, int index1, int index2) {
        if (str == null || str.length() <= Math.max(index1, index2)) {
            throw new IllegalArgumentException("Invalid indexes or string too short.");
        }
 
        // Sort the indexes to ensure order
        int start = Math.min(index1, index2);
        int end = Math.max(index1, index2);
 
        // Use substring to skip the characters at the indexes
        return str.substring(0, start) + str.substring(start + 1, end) + str.substring(end + 1,str.length()-1);
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World!";
		System.out.println(str);
		String str2 = str.replace('r','R');
		System.out.println(str2);
		System.out.println(removeTwoCharacters(str, 7, 5)); // Output: "GeForGeeks"
	}

}
