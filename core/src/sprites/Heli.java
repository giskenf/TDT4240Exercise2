package sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector3;

public class Heli {
    private static final int GRAVITY = -15;
    private static final int UP = 5;
    private static final int LEFT = -10;
    private Vector3 position;
    private Vector3 velocity;
    private Sprite heliSprite;

    private Texture heli;

    public Heli(int x, int y){
        position = new Vector3(x,y,0);
        velocity = new Vector3(0,0,0);
        heli = new Texture("heli1.png");
        //heliSprite = new Sprite(heli);
    }

    public void update (float dt){
        if(position.y > 0) {
            velocity.add(0, GRAVITY, 0);
            velocity.scl(dt);
            position.add(0, velocity.y, 0);
        }

        if(position.y < 0){
            position.y = 0;
        }

        velocity.scl(1/dt);

        /*if(position.y <= 130){
            velocity.add(0, UP, 0);
        }

        if(position.y >= 800){
            velocity.add(0, GRAVITY, 0);
        }

        if (position.x >= 300){
            velocity.add(LEFT, GRAVITY, 0);
        }*/


        //heliSprite.flip(true,false);

    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return heli;
    }

    public void jump(){
        velocity.y = 250;
    }
}
