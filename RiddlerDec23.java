
public class RiddlerDec23 
{

	public static void main(String[] args) 
	{
		String str = "HAPYOLIDSX"; 
        int n = str.length(); 
        permute(str, 0, n-1);
	}
	

 private static void permute(String str, 
                      int l, int r) 
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
