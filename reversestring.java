class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp; // Fixed: Changed '5' to 's'

            left++;
            right--;
        }
    }
}