public class Multiples {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;
        while (num < 1000){

            // Find out if num is divisible by 3 or 5
            boolean divisibleBy3 = num % 3 == 0;
            boolean divisibleBy5 = num % 5 == 0;

            if (divisibleBy3 || divisibleBy5){
                count++;
            }

            num++;
        }
        System.out.println(count);
    }
}
