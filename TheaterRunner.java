import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // club amount of trophies
    ImageFilter[][] trophiesArr = {
      {new ImageFilter("Screenshot-2025-02-03-122340.png"), new ImageFilter("FA-Cup-Code.jpg") },
      {new ImageFilter("EPL-Trophy-code.jpg"), new ImageFilter("Screenshot-2025-02-03-122428.png") }
    };

    // club legends
    ImageFilter[][] bestPlayersArr = {
      { new ImageFilter("Cantona-code.jpg"), new ImageFilter("rooney-code.jpg") },
      { new ImageFilter("beckham-code.jpg"), new ImageFilter("Ronaldo-code.jpg") },
    };

    // club stadium
    ImageFilter[][] stadiumArr = {
      { new ImageFilter("Old-Trafford-Code.jpg"), new ImageFilter("old-Trafford-v2.jpg") },
      { new ImageFilter("old-Trafford-v3.jpeg"), new ImageFilter("old-traffford-v4.jpg") },
    };

    // club manager
    ImageFilter[][] rubenArr = {
      { new ImageFilter("Ruben-Amorim-Code.jpg"), new ImageFilter("Ruben-amorim-v2.jpeg") },
      { new ImageFilter("Ruben-amorim-v5.jpg"), new ImageFilter("Ruben-amorim-v4.jpeg") },
    };

    String[][] infoArr = {
      {"Founded in 1878", "Owned by the Glazer Family"},
      {"Nickname: The Red Devils", "First English Club to win a Treble"}
    };

     // club badge
    ImageFilter[][] badgeArr = {
      { new ImageFilter("Man-U-1.png"), new ImageFilter("Man-U-2.png") },
      { new ImageFilter("Man-U-3.png"), new ImageFilter("Manchester_United_FC_crest.svg.png") },
    };
    // MyStory object
    MyStory scene = new MyStory(trophiesArr, bestPlayersArr, stadiumArr, rubenArr, infoArr, badgeArr);
    
    // Call drawScene
    scene.drawScene();
    
    // Play scene in Theater
    Theater.playScenes(scene);
    
  }
}