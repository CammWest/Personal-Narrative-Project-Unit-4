import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

  // Instance Variables
  private ImageFilter[][] variable1;
  private ImageFilter[][] variable2;
  private ImageFilter[][] variable3;
  private ImageFilter[][] variable4;
  private String[][] variable5;
  private ImageFilter[][] variable6;


  
  // Constructor
  public MyStory(ImageFilter[][] variable1, ImageFilter[][] variable2, ImageFilter[][] variable3, ImageFilter[][] variable4, String[][] variable5, ImageFilter[][] variable6) {
    this.variable1 = variable1;
    this.variable2 = variable2;
    this.variable3 = variable3;
    this.variable4 = variable4;
    this.variable5 = variable5;
    this.variable6 = variable6;

  }

  // Calls all the parts of my animation, in order
  public void drawScene() {
    playSound("manchester-united-glory-glory-man-united-made-with-Voicemod.wav");
    
    drawFirstScene();
    drawSecondScene();
    drawThirdScene();
    drawFourthScene();
    drawFifthScene();
    drawSixthScene();

  }
  }

  //draws trophy info
  public void drawFirstScene() {
    clear("white");
    
    drawImage(variable1[0][0], 0, 0, 200);
    pause(0.5);
    variable1[0][1].makeNegative();
    drawImage(variable1[0][1], 200, 0, 200);
    pause(0.5);
    variable1[1][0].makeNegative();
    drawImage(variable1[1][0], 0, 200, 200);
    pause(0.5);
    drawImage(variable1[1][1], 200, 200, 200);

    pause(1.5);
  }

  //draws club legends
  public void drawSecondScene() {
    clear("white");
    variable2[0][0].motionBlur(20, "horizontal");
    drawImage(variable2[0][0], 0, 0, 200);
    pause(0.5);
    variable2[0][1].motionBlur(20, "horizontal");
    drawImage(variable2[0][1], 200, 0, 200);
    pause(0.5);
    variable2[1][0].motionBlur(20, "horizontal");
    drawImage(variable2[1][0], 0, 200, 200);
    pause(0.5);
    variable2[1][1].motionBlur(20, "horizontal");
    drawImage(variable2[1][1], 200, 200, 200);

    pause(1.5);
  }

  //draws the club stadium
  public void drawThirdScene() {
    clear("white");
    variable3[0][0].threshold(100);
    drawImage(variable3[0][0], 0, 0, 200);
    pause(0.5);
    variable3[0][1].threshold(100);
    drawImage(variable3[0][1], 200, 0, 200);
    pause(0.5);
    variable3[1][0].threshold(100);
    drawImage(variable3[1][0], 0, 200, 200);
    pause(0.5);
    variable3[1][1].threshold(100);
    drawImage(variable3[1][1], 200, 200, 200);

    pause(1.5);
  }

  //draws the club manager
  public void drawFourthScene() {
    clear("white");
    variable4[0][0].swapper();
    drawImage(variable4[0][0], 0, 0, 200);
    pause(0.5);
    variable4[0][1].swapper();
    drawImage(variable4[0][1], 200, 0, 200);
    pause(0.5);
    variable4[1][0].swapper();
    drawImage(variable4[1][0], 0, 200, 200);
    pause(0.5);
    variable4[1][1].swapper();
    drawImage(variable4[1][1], 200, 200, 200);

    pause(1.5);
  }

  //prints text about other club facts/info
  public void drawFifthScene() {
    clear("white");

    drawText(variable5[0][0], 50, 100);
    pause(0.5);
    drawText(variable5[0][1], 250, 100);
    pause(0.5);
    drawText(variable5[1][0], 50, 300);
    pause(0.5);
    drawText(variable5[1][1], 250, 300);

    pause(2.0);
  }

  //draws the club badge to finish it off
  public void drawSixthScene() {
    clear("white");
    variable6[0][0].swapper();
    drawImage(variable6[0][0], 0, 0, 200);
    pause(0.5);
    variable6[0][1].swapper();
    drawImage(variable6[0][1], 200, 0, 200);
    pause(0.5);
    variable6[1][0].swapper();
    drawImage(variable6[1][0], 0, 200, 200);
    pause(0.5);
    variable6[1][1].swapper();
    drawImage(variable6[1][1], 200, 200, 200);

    pause(1.0);
  }
}