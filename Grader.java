public class Grader{
    private double[] scores;

    public Grader(double[] scoresArray){
        scores = scoresArray;
    }

    private double getSum(){
        double acc = 0.0;

        for (double val : scores){
            acc += val;
        }

        return acc;
    }

    public double getLowest(){
        double lowest;

        switch (scores.length) {
            case 0:
                return 0.0;
            case 1:
                System.out.println("No score is dropped.");
                return scores[0];
            default:
                lowest = scores[0];
                for (int i = 0; i < scores.length; i++) {
                    if (scores[i] < lowest) {
                        lowest = scores[i];
                    }
                }
                return lowest;
        }
    }

    public double getAverage(){
        double average;

        switch (scores.length){
            case 0:
                System.out.println("Cannot find average of an empty array of scores.");
                return 0.0;
            case 1:
                return scores[0];
            default:
                average = (getSum() - getLowest()) / (scores.length - 1);
                return average;
        }
    }
}