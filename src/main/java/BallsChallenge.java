import processing.core.PApplet;

public class BallsChallenge extends PApplet {
    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;

    int x=0;
    int ballCount=4;


    public static void main(String[] args) {
        PApplet.main("BallsChallenge",args);
    }

    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        drawBalls();
    }

    private void drawBalls() {
        for(int i=0;i<ballCount;i++)
            ellipse(x*i,HEIGHT*i/5,DIAMETER,DIAMETER);
        x++;
    }
}
