package External;
// The tiles will based on 16x16; changing this idea may cause resolution issue


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GameWindow extends JPanel implements Runnable {

   final int originalTileSize = 16;
   final int scale = 3;
   final int tileSize = originalTileSize * scale; // 48x48

   final int maxScreenCol = 16;
   final int maxScreenRow = 12;
   final int screenWidth = tileSize * maxScreenCol; // 768 px
   final int screenHeight = tileSize * maxScreenRow; // 578 px

   Thread gameThread;


   public GameWindow(){
      this.setPreferredSize(new Dimension(screenWidth, screenHeight));
      this.setBackground(Color.black);
      this.setDoubleBuffered(true);
   }


   public void startGameThread(){
      gameThread = new Thread(this);
      gameThread.start();
   }


   // thie method will be called every thread fream, Void Update
   @Override
   public void run() {
      // To Do: create the game loop
      
   }
   
   
}