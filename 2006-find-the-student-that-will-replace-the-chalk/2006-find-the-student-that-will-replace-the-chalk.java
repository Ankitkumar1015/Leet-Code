class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long totalChalk = 0;
        
        // Calculate the total amount of chalk needed for one complete round
        for (int c : chalk) {
            totalChalk += c;
        }
        
        // Reduce k to the effective chalk remaining after full rounds
        k %= totalChalk;

        // Find the student who will replace the chalk
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i; // Return the index of the student who needs more chalk
            }
            k -= chalk[i]; // Reduce k by the amount of chalk used by the current student
        }

        return -1; // This line should theoretically never be reached
    }
}