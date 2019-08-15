import java.util.ArrayList;
//0,2 1,1 2,0
public class LoShuMagicSquare{
    public static void main(String[] args){
        int[][] square = {{6,7,2},
                          {1,5,9},
                          {8,3,4}};

        System.out.println("Is the square a Lo Shu Magic Square? " + testSquare(square));
    }

    private static boolean testSquare(int[][] array){
        int[] digits = new int[9];

        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[row].length; col++){
                int num = array[row][col];
                switch(num){
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        digits[num - 1]++;
                        if (digits[num - 1] > 1){
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }

        for (int row = 0; row < array.length; row++){
            int rowSum = 0;

            for (int col = 0; col < array[row].length; col++){
                rowSum += array[row][col];
            }

            if (rowSum != 15){
                return false;
            }
        }

        for (int col = 0; col < array[0].length; col++){
            int colSum = 0;

            for (int row = 0; row < array.length; row++){
                colSum += array[row][col];
            }

            if (colSum != 15){
                return false;
            }
        }

        int diag1Sum = 0;

        for (int row = 0, col = 0; col < array[0].length && row < array.length; row++, col++){
            diag1Sum += array[row][col];
        }

        if (diag1Sum != 15){
            return false;
        }

        int diag2Sum = 0;

        for (int row = 0, col = array[0].length - 1; row < array.length && col >= 0; row++, col--){
            diag2Sum += array[row][col];
        }

        return diag2Sum == 15;
    }
}