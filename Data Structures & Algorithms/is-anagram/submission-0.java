//first we need to check the length of the string if it doesn't match by default we can return false; when it comes to bruteforce we need to find that whether it is a valid anagram or not to do that we can make something like we can iterate the each character of the string and store them as a count if we can take a hash map with where we assign key as string and count of the character as value and we iterate through the complete string and compare that with the other string, and return true else false.

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int remaining = counts.getOrDefault(c, 0);

            if (remaining == 0) {
                return false;
            }

            counts.put(c, remaining - 1);
        }

        return true;
    }
}