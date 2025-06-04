// Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structures ?
// (Assume input is all lowercase)

// Example 1:
  // Input: str = "naruto"
  // Output: true
  
// Example 2:
  // Input: str = "sasuke"
  // Output: false


private static boolean isUnique(String str) {

    boolean[] boolSet = new boolean[26];

    for (int i = 0; i < str.length(); i++) {
        int val = str.charAt(i) - 'a';
      
        if (boolSet[val]) return false;
        else boolSet[val] = true;
    }

    return true;
}
