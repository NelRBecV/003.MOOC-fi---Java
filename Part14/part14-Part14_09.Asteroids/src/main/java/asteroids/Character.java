/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;


import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

/**
 *
 * @author yo
 */
public class Character {
    private Polygon character;
    private Point2D movement;
    private boolean alive;
    
    public Character(Polygon polygon,int x, int y){
        this.character = polygon;
        this.character.setTranslateX(x);
        this.character.setTranslateY(y);
        
        this.movement = new Point2D(0,0);
        
        this.alive = true;
    }
    
    public Polygon getCharacter(){        
        return this.character;
    }
    
    public void turnLeft(){
        this.character.setRotate(this.character.getRotate() - 5);
    }
    
    public void turnRight(){
        this.character.setRotate(this.character.getRotate() + 5);
    }
    
    public void move(){
        this.character.setTranslateX(this.character.getTranslateX() + movement.getX());
        this.character.setTranslateY(this.character.getTranslateY() + movement.getY());
        
        if (this.character.getTranslateX() > AsteroidsApplication.WIDTH){
            this.character.setTranslateX(this.character.getTranslateX() % AsteroidsApplication.WIDTH);            
        } else if (this.character.getTranslateX() < -5){        
            this.character.setTranslateX(-5);
        }
        
        if (this.character.getTranslateY() > AsteroidsApplication.HEIGHT){
            this.character.setTranslateY(this.character.getTranslateY() % AsteroidsApplication.HEIGHT);            
        } else if (this.character.getTranslateY() < -5){
            this.character.setTranslateY(-5);
        }
    }
    
    public void accelerate(){
        double changeX = Math.cos(Math.toRadians(this.character.getRotate()));
        double changeY = Math.sin(Math.toRadians(this.character.getRotate()));
        
        changeX *= 0.05;
        changeY *= 0.05;
        
        this.movement = this.movement.add(changeX, changeY);
    }
    
    public boolean collide(Character other){
        Shape collisionArea = Shape.intersect(this.character, other.getCharacter());
        return collisionArea.getBoundsInLocal().getWidth() != -1;
    }
    
    public void setMovement(Point2D newMovement){
        this.movement = newMovement;
    }
    
    public Point2D getMoement(){
        return this.movement;
    }
    
    public boolean isAlive(){
        return this.alive;
    }
    
    public void setAlive(boolean alive){
        this.alive = alive;
    }
            
}
