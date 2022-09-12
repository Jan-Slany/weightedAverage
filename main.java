import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // creating new scanner object
        Scanner scan = new Scanner(System.in);

        // creating new array lists
        ArrayList<Double> listScore = new ArrayList<Double>();
        ArrayList<Double> listScale = new ArrayList<Double>();

        System.out.println("Po zadání všech známek a průměrů napiš číslo 0");

        while (true) {

            // checking for user input and assigning it to string named score
            String score = scan.nextLine();
            double dbScore = Double.parseDouble(score);

            // if score is equals to zero, user input ends
            if (dbScore == 0) {
                // simple sum function
                double totalScore = 0;
                for (double value : listScore){
                    totalScore += value;
                }

                // simple sum function
               double totalScale = 0;
                for (double value : listScale){
                    totalScale += value;
                }

                // math formula for weight average
                double avarage = totalScore / totalScale;
                System.out.printf("Vaše průměrná známka je: %.2f", avarage);
            }

            // if we want to continue typing scores and scales, this code is executed
            else {
                String scale = scan.nextLine();
                double dbScale = Double.parseDouble(scale);

                // adding scale with datatype double to scale list
                listScale.add(dbScale);

                double multipliedScore = dbScore * dbScale;

                // adding multiplied score to score list
                listScore.add(multipliedScore);
            }

        }
    }
}
