public class Reduce {
    public static void main(String[] args) {
        int num = 100;
        int count = 0;
        while (num > 0){


            // Find out if num is even or odd
            boolean isEven = num % 2 == 0;

            if (isEven){
                num = num / 2;
                count++;

            }
            else{
                num--;
                count++;
            }
        }
        System.out.println(count);
    }
}
