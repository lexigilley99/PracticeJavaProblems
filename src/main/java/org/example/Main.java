package org.example;

// Warmup-2 Practice Problems

1. public String stringTimes(String str, int n) {
    String result = ""; // initializes to an empty string
    for (int i=0; i<n; i++) { // starts a for loop incremented by 1 each time
        result = result + str; // Loop ends as 'i' reaches 3 (since i < n is no longer true)
    }
    return result; // method returns "HiHiHi"
}

2. public String frontTimes(String str, int n) {
    int frontLen = 3;
    if (frontLen > str.length()) {
        frontLen = str.length();
    }
    String front = str.substring(0, frontLen);

    String result = "";
    for (int i=0; i<n; i++) {
        result = result + front;
    }
    return result;
}

// Since frontLen (3) is not greater than the length of str (9), frontLen remains 3.
// str.substring(0, 3), which is "Cho".
//Initialize result to an empty String: result = "".
//Start the loop with i = 0
//result becomes result + "Cho" which is "" + "Cho" -> "Cho"
//Increment i to 1
//result becomes result + "Cho" which is "Cho" + "Cho" -> "ChoCho"
//Increment i to 2
//result becomes result + "Cho" which is "ChoCho" + "Cho" -> "ChoChoCho"
//Loop ends as i reaches 3 (since i < n is no longer true)
//The method returns "ChoChoCho"

3. int countXX(String str) {
    int count = 0; // Initializes an integer count to 0. This variable will keep track of the number of occurrences of "xx" in the string str.
    for (int i = 0; i < str.length()-1; i++) { // The loop continues as long as i is less than str.length() - 1. This ensures that there is at least one more character to check for "xx" without going out of bounds.
        if (str.substring(i, i+2).equals("xx")) count++; // For each iteration of the loop, a substring of str is extracted starting at index i and ending at index i + 2.
    }
    return count; // method returns the value of count, which represents the number of times "xx" appears in the string str.
}

4. boolean doubleX(String str) {
    int i = str.indexOf("x"); // searches for the first occurrence of the character 'x' in the string str.
    if (i == -1) return false; // no "x" at all and returns false
    // this if statement checks i+1 is greater than or equal to the length of the string str
    if (i+1 >= str.length()) return false; // returns false if out of bounds
    return str.substring(i+1, i+2).equals("x"); // line extracts a substring starting at index i+1 and ending at i+2.
    // This essentially gets the character immediately following the first 'x'.
}

// Warmup-1 Practice Problems

1. public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation) { // The method checks the conditions !weekday and vacation.
        // !weekday evaluates to true if weekday is false (i.e., it is not a weekday).
        // vacation evaluates to true if you are on vacation.
        return true; // either condition is true (i.e., it is not a weekday or you are on vacation)
        // the method returns true, meaning you can sleep in.
    }

    return false; // If neither of the conditions in the if statement are met (i.e., it is a weekday and you are not on vacation)
    // the method returns false, meaning you cannot sleep in.

}

2. public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if (aSmile && bSmile) { // expression checks if both monkeys are smiling.
        // If both aSmile and bSmile are true, the method returns true, meaning the monkeys are in trouble.
        return true;
    }
    if (!aSmile && !bSmile) { // checks if neither monkey is smiling.
        // If both aSmile and bSmile are false, the method returns true, meaning the monkeys are in trouble.
        return true;
    }
    return false; // if one monkey is smiling and the other is not
}

3. public int sumDouble(int a, int b) {
    int sum = a + b; // Store the sum in a local variable
    if (a == b) { // checks if a and b are equal, double it if they are
        sum = sum * 2; // sum is doubled by multiplying it by 2
    }

    return sum; // returns the value of sum, which is either the original sum or the doubled sum
    // depending on whether a and b were the same.
}

4. public int diff21(int n) {
    if (n <= 21) { // checks if the value of n is less than or equal to 21
        return 21 - n; // If n is less than or equal to 21, it returns the difference
    } else {
        return (n - 21) * 2; // If n is greater than 21, it returns double the difference
    }
}
