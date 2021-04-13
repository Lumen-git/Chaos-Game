import java.io.File;
import java.io.IOException;
import java.lang.Math; 

public class VicsekFractal {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setTitle("My Picture");
        pic.setBackgroundColor("white");

        // Draw my picture
        int[] pointA = new int[] {0 ,0};
        int[] pointB = new int[] {0, 800};
        int[] pointC = new int[] {800,800};
        int[] pointD = new int[] {800, 0};
        int[] pointE = new int[] {400, 400};
        
        int i = -1;
        int rand = 0;
        int[] marker = new int[] {566, 380};
        int movement = 0;
        
        while (i != 0){
            movement = (int)(Math.random() * 5);
            if (movement == 0){
                marker[0] = (int)((marker[0] + pointA[0]) * .333);
                marker[1] = (int)((marker[1] + pointA[1]) * .333);
            }
            if (movement == 1){
                marker[0] = (int)((marker[0] + pointB[0]) * .333);
                marker[1] = (int)((marker[1] + pointB[1]) * .333);
            }
            if (movement == 2){
                marker[0] = (int)((marker[0] + pointC[0]) * .333);
                marker[1] = (int)((marker[1] + pointC[1]) * .333);
            }
            if (movement == 3){
                marker[0] = (int)((marker[0] + pointD[0]) * .333);
                marker[1] = (int)((marker[1] + pointD[1]) * .333);
            }
            if (movement == 4){
                marker[0] = (int)((marker[0] + pointE[0]) * .333);
                marker[1] = (int)((marker[1] + pointE[1]) * .333);
            }
            new Rect(marker[0], marker[1]);
            i--;
        }
    }
}
