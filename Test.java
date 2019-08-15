public class Test{
    public static void main(String[] args){
    int[] numArray1 = { 1, 2, 3, 4, 5};
    int[] numArray2 = { 6, 7, 8, 9,10};
    int[] numArray3 = {11,12,13,14,15};

    displayNumbers(numArray1, numArray2, numArray3);
    }

    private static void displayNumbers(int[]... vararg){
        for (int i = 0; i < vararg.length; i++){
            for (int j = 0; j < vararg[i].length; j++){
                System.out.printf("%3d", vararg[i][j]);
            }
            System.out.println();
        }
    }
}