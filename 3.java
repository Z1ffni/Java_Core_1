public class ArrayMinMax {
    public static void main(String[] args) {
        int[] array = { 23, 45, 12, 67, 9, 34, 56, 87, 3, 98 };

        int min = array[0]; 
        int max = array[0]; 

       
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

       
        System.out.println("Мінімальне значення в масиві: " + min);
        System.out.println("Максимальне значення в масиві: " + max);
    }
}