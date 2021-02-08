package sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector3;

import giske.mygdx.game.MyGdxGame;

public class Heli extends Sprites{
    public Sprite heliSprite;
    public Texture heli;

    public Heli(int x, int y){
        super(x,y);
        heli = new Texture("heli1.png");
        heliSprite = new Sprite(heli);
    }

    public void update (float dt){
        moveX(SPEED * dt);
        moveY(SPEED * dt);
    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return heli;
    }

    public void moveX(float movement){
        if (RIGHT) {
            position.x += movement;
        } else {
            position.x -= movement;

        }
        if (RIGHT && position.x > MyGdxGame.WIDTH - heli.getWidth()) {
            RIGHT = false;
            heliSprite.flip(true, false);

        }
        if (!RIGHT && position.x < 0) {
            RIGHT = true;
            heliSprite.flip(true, false);
        }
    }

    public void moveY(float movement){
        if(UP){
            position.y += movement;
        } else {
            position.y -= movement;
        }
        if (UP && position.y > MyGdxGame.HEIGHT - heli.getHeight()){
            UP = false;
        }
        if (!UP && position.y <= 0){
            UP = true;
        }
    }

}
