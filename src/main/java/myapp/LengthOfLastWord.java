package myapp;  
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
} 


// class Solution {
//     public int lengthOfLastWord(String s) {
//         String[] strArray=s.split(" ");
//         if(strArray.length == 0){
//             return 0;
//         }
        
//         String word=strArray[strArray.length-1];
        
//         return word.length();
//     }
// }

