import javax.swing.JOptionPane;

public class Array2D{
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9};

        //sortArray(numbers);

        String input = JOptionPane.showInputDialog("Enter a numbers to search:");
        int num = Integer.parseInt(input);

        JOptionPane.showMessageDialog(null, binarySearch(numbers, num));
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            int minVal = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++){
                if (array[j] < minVal){
                    minVal = array[j];
                    minIndex = j;
                }
            }

            array[minIndex] = array[i];
            array[i] = minVal;
        }
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
          System.out.print(array[i] + " ");
        }
    }

    private static int binarySearch(int[] array, int num){
        int first = 0;
        int last = array.length - 1;
        int mid;
        int pos = -1;
        boolean flag = false;

        while (!flag && first <= last){
            mid = (first + last) / 2;

            if (array[mid] == num){
               pos = mid;
               flag = true;
            }
            else if (array[mid] < num){
                first = mid + 1;
            }
            else{
                last = mid - 1;
            }
        }

        return pos;
    }
}