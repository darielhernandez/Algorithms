package com.darielhernandez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        public class Day00HelloWorld {
            public static void main(String[] args) {
                // Create a Scanner object to read input from stdin.
                Scanner scan = new Scanner(System.in);

                // Read a full line of input from stdin and save it to our variable, inputString.
                String inputString = scan.nextLine();

                // Close the scanner object, because we've finished reading
                // all of the input from stdin needed for this challenge.
                scan.close();

                // Print a string literal saying "Hello, World." to stdout.
                System.out.println("Hello, World.");

                // TO DO: Write a line of code here that prints the contents of inputString to stdout.
                System.out.println(inputString);
            }
        }

        public class Day05ForLoops{
            public static void main(String[] args) throws IOException {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

                int n = Integer.parseInt(bufferedReader.readLine().trim());
                for (int i=1; i<=10; i++){
                    System.out.println(n+" x "+i+" = "+n*i);
                }

                bufferedReader.close();
            }
        }

        public class warmupChallengeApril12 {
            public static int triArea(int base, int height) {
                int area= base*height/2;
                return area;
            }
        }

        public class ExistsANumberHigher {
            public static boolean existsHigher(int[] arr, int n) {
                for(int i=0;i<arr.length;i++){
                    if(arr[i]>=n)
                        return true;
                }
                return false;
            }
        }

        public static boolean doubleLetters(String word) {
            for (int i=0; i<word.length()-1; i++){
                if(word.charAt(i)==word.charAt(i+1))
                    return true;
            }
            return false;
        }
    }

    public static String reverse(final String str) {
        Stringbuilder reverse= new Stringbuilder(str);
        reverse.reverse();
        return reverse.tostring()
    }
    public static String getWord(String left, String right) {
        return left.substring(0,1).toUpperCase() + left.substring(1) + right;
    }
    public static int programmers(int one, int two, int three) {
        int min = Math.min(one, Math.min(two, three));
        int max = Math.max(one, Math.max(two, three));
        return max - min;
    }
    public static int[] calculateScores(String str) {
        int countA = 0;
        int countB = 0;
        int countC = 0;

        for(int i=0; i< str.length(); i++){
            if(str.charAt(i)=='A'){
                countA++;
            }else if(str.charAt(i)== 'B'){
                countB++;
            }else if(str.charAt(i)== 'C'){
                countC++;
            }
        }
        int[] scores={countA, countB, countC};
        return scores;
    }
    public static boolean isAvgWhole(int[] arr) {
        int avg=0;
        for(int i= 0; i<arr.length; i++){
            avg+=arr[i];
        }if(avg % arr.length == 0){
            return true;
        }else if (avg % arr.length !=0){
        }
        return false;
    }
    public static boolean getXO (String str) {
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'X' || str.charAt(i) == 'x') {
                countX++;
            }
            if (str.charAt(i) == 'O' || str.charAt(i) == 'o') {
                countO++;
            }
        }

        if (countX == countO) {
            return true;
        }
        return false;
    }
    public static String spaceMeOut(String str) {
        return str.replaceAll("", " ").trim();
    }

}

    public static int countUnique(String s1, String s2) {

        String combined= s1+ s2;
        HashSet<Character> set = new HashSet<Character>();
        for (int i=0; i < combined.length(); i++){
            set.add(combined.charAt(i));
        }
        return set.size(  );
    }

    public static int firstVowel(String str) {
        for(int i=0; i< str.length(); i++){
            char vow= str.charAt(i);
            if(vow =='a'||vow =='e'||vow =='i'||vow =='o'||vow=='u'){
                return str.indexOf(vow);
            }else if(vow =='A'||vow =='E'||vow =='I'||vow =='O'||vow =='U'){
                return str.indexOf(vow);
            }
        }
        return -1;
    }
    public static String repeat(String str, int n) {
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            char caracter = str.charAt(i);
            for(int j = 0; j < n ; j++){
                newStr = newStr + caracter;
            }
        }
        return newStr;
    }
}
public static int[] reverse(int[] arr) {
        int[] rev= new int[arr.length];
        for(int i=arr.length -1; i>=0; i--){
        rev[i]=arr[arr.length-1-i];
        }
        return rev;
        }


