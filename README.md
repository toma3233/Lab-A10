# Lab-A10
This repository contains three programs: CarRental, StringUtil1, and CheckProtection

The CarRental program converts the user's licence plate number into a unique ID that can be used for various purposes.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

The StringUtil1 program contains a class that will perform several different functions on Strings that are sent to it. All of the methods will be static, and the class should work in a similar manner to the Math class. Only the two methods listed below should be public.
The program contains:
  - A method that receives a String and returns a String that is the exact reversal of the characters in the first String.
  - A method that receives a String and returns a boolean value of true if the String is a Palindrome and false if it is not. A word is a     palindrome if it reads the same forwards and backwards. For example, the word level is a palindrome.
  
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

The CheckProtection class contains:
  - Two private instance variables only
  - A constructor thattakes one int parameter that specifies the number of spaces to be used to print the check amount.
    prompts for the amount and rounds the amount to two decimal places.
  - If the amount takes more than MAX_LENGTH spaces, prints an error message, otherwise prints the amount with the appropriate number of       leading asterisks.
  - A recursive method called addCommas(String s) that inserts commas at the correct positions.
  - A recursive method called addAsterisks(String s) that inserts the leading asterisks.
  - A method called printAmount() that prints the amount with the commas and leading asterisks.
  - You must solve this problem by manipulating strings using only methods taught in class.
  - The only calculation you can do using doubles is to round the amount to two decimal places. You may use the Math.round() method in the     constructor. All other methods should manipulate strings only.
  
