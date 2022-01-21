import processing.core.PApplet;


class BallDimensions {

    public int diameter;
    public int xCoordinate;
    public int yCoordinate;


    public BallDimensions(int diameter, int xCoordinate, int yCoordinate) {
        this.diameter = diameter;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
}

class CreatingFourBalls extends PApplet{

    BallDimensions[] balls=new BallDimensions[4];
    public static final int WIDTH = 640;
    public static final int HEIGHT = 380;

    public CreatingFourBalls() {

        for (int iterator = 0; iterator < 4; iterator++) {
            
            balls[iterator]=new BallDimensions(15,10,(iterator+1)*HEIGHT/5);
        }
    }
}

public class FourBallsOOP extends CreatingFourBalls {


    public static void main(String[] args) {
        PApplet.main("FourBallsOOP",args);
    }


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {

        for (int iterator = 0; iterator < 4; iterator++) {

            drawCircle(balls[iterator].xCoordinate,balls[iterator].yCoordinate,balls[iterator].diameter);
            balls[iterator].xCoordinate+= iterator+1;
        }

    }

    private void drawCircle(int xCoordinate, int yCoordinate,int diameter) {

        ellipse(xCoordinate,yCoordinate, diameter,diameter);
    }

}

