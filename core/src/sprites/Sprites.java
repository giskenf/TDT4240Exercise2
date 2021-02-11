package sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector3;

public abstract class Sprites {
    protected Vector3 position;
    protected static final int SPEED = 200;
    protected boolean UP = true;
    protected boolean RIGHT = false;

    protected Sprites(int x, int y){
        position = new Vector3(x,y,0);
    }


}
