public class arrays {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int i = numbers.length;


        for (i = 9; i <= numbers.length; i--) {

            numbers[i] = i - 1;
            for ( i = 0; i < numbers.length; i++) {
                System.out.println("Array[" + i + "] = " + numbers[i]);
            }


        }

    }
}

