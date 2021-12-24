/* 
Found all permutations of the letters of HAPPY HOLIDAYS (HAPYOLIDSX)
and since there are only nine letters, I added an X for the 10th. 
For each permutation, I assigned the position of each letter starting at 0
to the letter, converted it to an integer, and did the computation.
If the resulting HAPPY + HOLIDAYS = HOHOHOHO, print the result.

Result 1:
H -> 8
A -> 4
P -> 6
Y -> 1
O -> 0
L -> 7
I -> 2
D -> 3
S -> 9

84661 + 80723419 = 80808080

Result 2:
H -> 6
A -> 8
P -> 3
Y -> 2
O -> 1
L -> 5
I -> 4
D -> 7
S -> 9

68332 + 61547829 = 61616161

*/

public class RiddlerDec23 
{

	public static void main(String[] args) 
	{
		String str = "HAPYOLIDSX"; 
        int n = str.length(); 
        permute(str, 0, n-1);
	}
	

//permutation framework by Mihir Joshi at https://www.geeksforgeeks.org/java-program-to-print-all-permutations-of-a-given-string/
 private static void permute(String str, int l, int r) 
 { 
     if (l == r) 
     {
    	String x = str;
    	int H = x.indexOf("H");
 		int A = x.indexOf("A");
 		int P = x.indexOf("P");
 		int Y = x.indexOf("Y");
 		int O = x.indexOf("O");
 		int L = x.indexOf("L");
 		int I = x.indexOf("I");
 		int D = x.indexOf("D");
 		int S = x.indexOf("S");
 		int X = x.indexOf("X");
 		
 		int happy = Integer.parseInt(""+H+A+P+P+Y);
 		int holidays = Integer.parseInt(""+H+O+L+I+D+A+Y+S);
 		int hohohoho = Integer.parseInt(""+H+O+H+O+H+O+H+O);
 		if(happy + holidays == hohohoho)
 			System.out.println(str);

     }
        
     else
     { 
         for (int i = l; i <= r; i++) 
         { 
             str = swap(str,l,i); 
             permute(str, l+1, r); 
             str = swap(str,l,i); 
         } 
     } 
 } 


 public static String swap(String a, int i, int j) 
 { 
     char temp; 
     char[] charArray = a.toCharArray(); 
     temp = charArray[i] ; 
     charArray[i] = charArray[j]; 
     charArray[j] = temp; 
     return String.valueOf(charArray); 
 } 
 

}
