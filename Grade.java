import java.util.Scanner;

public class Grade{
    public static void main(String[] args){
        int numScores;
        double[] scoresArray;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of scores: ");
        numScores = keyboard.nextInt();
        scoresArray = new double[numScores];

        for (int i = 0; i < scoresArray.length; i++){
            System.out.printf("Enter score #%d: ", i + 1);
            scoresArray[i] = keyboard.nextDouble();
        }

        Grader gradeScores = new Grader(scoresArray);

        System.out.printf("The adjusted average is %,.2f.\n", gradeScores.getAverage());
        System.out.printf("The lowest score dropped is %,.2f.\n", gradeScores.getLowest());
    }
}