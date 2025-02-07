import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  public ImageFilter(String fileName) {
    super(fileName);
  }

  // All Filter Methods

  /*
  * makeNegative() image filter which makes the colors the negative
  */
   public void makeNegative() {
    Pixel[][] pixels = getImagePixels();
    for(int row=0; row < pixels.length; row++){
      for(int col=0; col < pixels[0].length; col++){
        Pixel currentPixel = pixels[row][col];

        int red = 255 - currentPixel.getRed();
        int blue = 255 - currentPixel.getBlue();
        int green = 255 - currentPixel.getGreen();

        currentPixel.setColor(new Color(red,green,blue));

    
  }
  
}
  }

  /*
  *motionBlur image filter which makes the blur the image by moving the pixels
  */
  public void motionBlur(int length, String direction) {
    Pixel[][] pixels = getImagePixels();
    int imageHeight = getHeight();
    int imageWidth = getWidth();

    for (int y = 0; y < imageHeight; y++) {
        for (int x = 0; x < imageWidth; x++) {
            Pixel currentPixel = pixels[y][x];
            int red = 0;
            int green = 0;
            int blue = 0;
            int count = 0;


            for (int i = 0; i < length; i++) {
                int newX = x;  
                int newY = y;  

    
                if (direction.equals("horizontal")) {
                    newX = x + i;
                } else if (direction.equals("vertical")) {
                    newY = y + i;
                } else if (direction.equals("diagonal")) {
                    newX = x + i;
                    newY = y + i;
                }


                if (newX >= 0 && newX < imageWidth && newY >= 0 && newY < imageHeight) {
                    Pixel p = pixels[newY][newX];
                    red += p.getRed();
                    green += p.getGreen();
                    blue += p.getBlue();
                    count++;
                }
            }
          
            if (count > 0) {
                int avgRed = red / count;
                int avgGreen = green / count;
                int avgBlue = blue / count;

                currentPixel.setRed(avgRed);
                currentPixel.setGreen(avgGreen);
                currentPixel.setBlue(avgBlue);
            }
        }
    }
  }

  /*
  *threshold image filter which makes the color white or black depending on its value
  */
    public void threshold(int value) {
  Pixel[][] pixels = getImagePixels();
      for(int row=0; row < pixels.length; row++){
        for(int col=0; col < pixels[0].length; col++){
          Pixel currentPixel = pixels[row][col];
          int total = 0;
          int average = 0;
          int red = currentPixel.getRed();
          int green = currentPixel.getGreen();
          int blue = currentPixel.getBlue();
          total = red + green + blue;
          average = total/3;
            if(average < value){
            currentPixel.setColor(new Color (0,0,0));
            } else {
            currentPixel.setColor(new Color (255,255,255));
            }
        }
        }
    }

  /*
  * Swaps red with green, blue with red, green with blue
  */
   public void swapper() {
    Pixel[][] pixels = getImagePixels();
    for(int row=0; row < pixels.length; row++){
      for(int col=0; col < pixels[0].length; col++){
        Pixel currentPixel = pixels[row][col];

        int red = currentPixel.getBlue();
        int blue = currentPixel.getGreen();
        int green = currentPixel.getRed();

        currentPixel.setColor(new Color(red,green,blue));
  }
  
}
  }
}