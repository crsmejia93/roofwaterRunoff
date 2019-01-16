/*Canvas Assignment
Jennifer Lee
1/16/2019
Calculate the amount of run off water on the roof
*/
import java.util.Scanner;

public class roofWaterRunOff {
    public static void main(String[] args){

        double roofLength;
        double roofWidth;
        double rainHeight;
        double volumeInGal;

        // get the roof dimensions in length and width, in inches
        System.out.println("Enter the length of the roof in feet: ");
        Scanner keyboard = new Scanner(System.in);
        roofLength = keyboard.nextDouble();
        System.out.println("Enter the width of the roof in feet: ");
        roofWidth = keyboard.nextDouble();

        // get the rainfall height in inches
        System.out.println("Enter the height of the rainfall in inches: ");
        rainHeight = keyboard.nextDouble();

        // convert the roof dimensions to inches
        double len = roofLength * 12;
        double w = roofWidth * 12;
        // multiply the roof dimensions by rainfall height to get Volume in cubic inches
        double volume = len * w * rainHeight;
        // divide it by 231 to convert to gallons
        volumeInGal = volume/231.0;
        System.out.println("The amount of run off water from the roof is " + volumeInGal + " gallon(s).");
    }
}
