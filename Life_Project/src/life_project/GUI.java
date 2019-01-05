/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package life_project;
import java.awt.Point;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author Marker
 */
public class GUI extends JPanel 
{
int y = 50;
int x = 50;
Point p;
boolean calculate = false;
public Tile[][] field = new Tile [x][y];

    public GUI() {
     setBackground(Color.BLACK);
     setSize( new Dimension (500, 500));
     set_tiles(x,y);
    }
@Override
protected void paintComponent(Graphics g)
{
  super.paintComponent(g);
  for(int x=0; x<this.x; x++)
     {
        for(int y=0; y<this.y; y++)
        {
            field [x][y].draw(g);
            repaint();
        }
    }   
}
public void set_tiles(int width, int height)
{
    for(int x = 0; x < width; x++)
    {
        for(int y = 0; y < height; y++)
            {
                field[x][y] = new Tile(x,y);
                repaint();
            }
        
    }
}
      public boolean isAlive(int x, int y)
      {
        int sum = 0;
        if (field[x-1][y-1].isAlive())sum++;
        if (field[x-1][y].isAlive())sum++;
        if (field[x-1][y+1].isAlive())sum++;
        if (field[x][y-1].isAlive())sum++;
        if (field[x][y+1].isAlive())sum++;
        if (field[x+1][y-1].isAlive())sum++;
        if (field[x+1][y].isAlive())sum++;
        if (field[x+1][y+1].isAlive())sum++;
        if (field[x][y].isAlive())
  {
    if((sum == 2)|| (sum == 3))
    {
        return true;
    }
        else
        {
        return false;
        }
 }else
            {
            if(sum == 3)
            {
            return true;
            }
            else
            {
            return false;
            }
 }
      }
    public void calculate(){
      for(int x=1; x<49; x++)
      {
          for(int y = 1; y < 49; y++){
          field[x][y].setTemp_alive(isAlive(x,y));
          }
      } 
    for(int x = 0; x<50; x++)
    {
        for(int y = 0; y < 50; y++)
    {
        field[x][y].setAlive(field[x][y].isTemp_alive());
        if(field[x][y].isAlive())
            {
            field[x][y].color = Color.RED;
            }
                else
                {
                field[x][y].color = Color.GREEN;
                }
    }
    }
      repaint();
          }
  {this.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                p = evt.getPoint();
                if(evt.getButton()==1)
                {
                if((p.x/Tile.width<x)&&(p.y/Tile.height<y))
                {
                    field[p.x/Tile.width][p.y/Tile.height].color = Color.RED;
                    field[p.x/Tile.width][p.y/Tile.height].setAlive(true);
                }
                }
                if(evt.getButton()==2)
                {
                if((p.x/Tile.width<x)&&(p.y/Tile.height<y))
                {
                    field[p.x/Tile.width][p.y/Tile.height].color = Color.GREEN;
                    field[p.x/Tile.width][p.y/Tile.height].setAlive(false);
                }
                }
                if(evt.getButton()==3)
                {
                  calculate();  
                }
            }
        });
     
  }

      }
      
      
      
      
      
      
    

