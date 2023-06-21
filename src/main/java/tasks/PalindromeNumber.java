package tasks;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String numberStr = String.valueOf(x);
        char[] numArray = numberStr.toCharArray();
        int lengthArray = numArray.length;
        for (int i = 0; i < lengthArray / 2; i++){
            if (numArray[i] != numArray[lengthArray - i - 1]){
                return false;
            }
        }
        return true;
    }

}
