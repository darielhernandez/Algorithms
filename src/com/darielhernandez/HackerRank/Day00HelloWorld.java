package com.darielhernandez.HackerRank;

import java.util.Scanner;

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