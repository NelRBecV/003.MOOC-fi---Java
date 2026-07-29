package asteroids;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import java.util.stream.Collectors;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AsteroidsApplication extends Application {
    
    public static int WIDTH = 300;
    public static int HEIGHT = 200;
    
    @Override
    public void start(Stage stage) throws Exception{
        Pane pane = new Pane();
        pane.setPrefSize(WIDTH, HEIGHT);
        Text score = new Text(10,20,"Points: 0");
        score.setFont(Font.font("Arial",FontWeight.BOLD,20.0));
       
                      
        Ship ship = new Ship(WIDTH/2,HEIGHT/2);
        
        AtomicInteger points = new AtomicInteger();        
        
        List<Asteroid> asteroids = new ArrayList();
        List<Projectile>projectiles = new ArrayList();
        
        for(int i = 0; i<5; i++){
            Random random = new Random();            
            asteroids.add(new Asteroid(random.nextInt(WIDTH/3), random.nextInt(HEIGHT)));
        }
        
        Map<KeyCode,Boolean> pressedKeys = new HashMap<>();
        
        pane.getChildren().addAll(ship.getCharacter(),score);
        asteroids.forEach((asteroid) -> pane.getChildren().add(asteroid.getCharacter()));
        
        Scene scene = new Scene(pane);
        
        scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
            
            @Override
            public void handle(KeyEvent event){
                pressedKeys.put(event.getCode(), true);
            }
        });
        
        scene.setOnKeyReleased(new EventHandler<KeyEvent>(){
            
            @Override
            public void handle(KeyEvent event){
                pressedKeys.put(event.getCode(), false);
            }
        });
        
        new AnimationTimer(){
            
            @Override
            public void handle(long now){
                if(pressedKeys.getOrDefault(KeyCode.LEFT, false)){
                    ship.turnLeft();
                }
                
                if(pressedKeys.getOrDefault(KeyCode.RIGHT, false)){
                    ship.turnRight();
                }

                if(pressedKeys.getOrDefault(KeyCode.UP, false)){
                    ship.accelerate();
                }
                
                if(pressedKeys.getOrDefault(KeyCode.SPACE, false)){
                    Projectile projectile = new Projectile((int) ship.getCharacter().getTranslateX(),(int) ship.getCharacter().getTranslateY());
                    projectile.getCharacter().setRotate(ship.getCharacter().getRotate());
                    projectiles.add(projectile);
                    
                    projectile.accelerate();
                    projectile.setMovement(projectile.getMoement().normalize().multiply(3));
                    
                    pane.getChildren().add(projectile.getCharacter());
                }
                
                ship.move();                
                
                asteroids.forEach((asteroid)-> {                    
                    asteroid.move();
                    
                    if(ship.collide(asteroid)){
                        stop();
                    }                    
                });
                
                if(Math.random() < 0.005){
                    Asteroid asteroid = new Asteroid(WIDTH,HEIGHT);
                    if(!asteroid.collide(ship)){
                        asteroids.add(asteroid);
                        pane.getChildren().add(asteroid.getCharacter());
                    }
                }
                                
                projectiles.forEach((projectile)-> {
                    projectile.move();
                            
                    asteroids.forEach((asteroid)-> {
                        if(projectile.collide(asteroid)){
                            projectile.setAlive(false);
                            asteroid.setAlive(false);
                            score.setText("Points: " + points.addAndGet(1000));
                        }
                    });
                            
                });
                
                
                projectiles.stream()
                        .filter((projectile)-> !projectile.isAlive())
                        .forEach(projectile -> pane.getChildren().remove(projectile.getCharacter()));
                
                projectiles.removeAll(projectiles.stream().filter(bullet -> !bullet.isAlive())
                        .collect(Collectors.toList()));
                
                
                asteroids.stream()
                        .filter(asteroid -> !asteroid.isAlive())
                        .forEach(asteroid -> pane.getChildren().remove(asteroid.getCharacter()));
                asteroids.removeAll(asteroids.stream().filter(asteroid-> !asteroid.isAlive())
                                                      .collect(Collectors.toList()));
                
            }
            
        }.start();
       
        stage.setTitle("Asteroids!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        launch(args);
    }

    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        return 4;
    }

}
