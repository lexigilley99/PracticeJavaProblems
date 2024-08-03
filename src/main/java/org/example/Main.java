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

// Warmup-1 Practice Problems

1. public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation) { // The method checks the conditions !weekday and vacation.
        // !weekday evaluates to true if weekday is false (i.e., it is not a weekday).
        // vacation evaluates to true if you are on vacation.
        return true;
    }

    return false;

}
