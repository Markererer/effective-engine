package life_project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Marker
 */
public class Tile {
   static int width = 10;
   static int height = 10;
   
   public int x;
   public int y;
   Color color = Color.GREEN;
   boolean alive = false;
   boolean temp_alive = false;
   
   public Tile(int x, int y){
       this.x = x * width;
       this.y = y * height;
   }
   public boolean isAlive(){
        return alive;
   }
   public void setAlive(boolean Alive){
        this.alive = alive;
   }
   public boolean isTemp_alive() {
        return temp_alive; 
   }
   public void setTemp_alive(boolean temp_alive) {
        this.temp_alive = temp_alive;
    }
       public void draw(Graphics g)
    {
    Graphics2D g2d = (Graphics2D) g;
    Rectangle2D.Double tile = new Rectangle2D.Double(x, y, width, height);
    g2d.setColor(color);
    g2d.fill(tile);
    }
}
