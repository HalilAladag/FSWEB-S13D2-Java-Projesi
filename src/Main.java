public class Main {
    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println(isPerfectNumber(496));
        System.out.println(isPerfectNumber(0));

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int number) {
        int inputNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return inputNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int num){
        if (num <= 0){
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= num/2; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        return num == sum;
    }
    public static String numberToWords(int num){
        if (num < 0){
            return "Invalid Value";
        }
        char[] numArr = String.valueOf(num).toCharArray();
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] wordArr = new String[numArr.length];
        for (int i = 0; i<numArr.length; i++){
            wordArr[i] = words[Integer.parseInt(String.valueOf(numArr[i]))];
        }
        return String.join(" ", wordArr);
    }
}