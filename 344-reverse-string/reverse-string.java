class Solution {
    public void reverseString(char[] s) {

        int first = 0;
        int last =s.length - 1;

        while (first < last) {
            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;

            first++;
            last--;
        }

        
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}