class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("\n................Welcome to palindrome checker...................\n");

        int numArr[] = ArrayUtility.inputArray();

        boolean palindrome = isPalindrome(numArr);
        if(palindrome){
            System.out.println("Your Array is palindrome");
        }else{
            System.out.println("Your array is not palindrome");
        }

    }
    public static boolean isPalindrome(int numArr[]){
        int i = 0;
        while(i < numArr.length/2){
            if(numArr[i] != numArr[numArr.length -1 - i ]){
                return false;
            }
            i++;
        }
        return true;

    }
}
