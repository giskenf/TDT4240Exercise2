package sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

public class Heli {
    private static final int GRAVITY = -5;
    private Vector3 position;
    private Vector3 velocity;

    private Texture heli;

    public Heli(int x, int y){
        position = new Vector3(x,y,0);
        velocity = new Vector3(0,0,0);
        heli = new Texture("heli1.png");
    }

    public void update (float dt){
        velocity.add(0, GRAVITY, 0);
        velocity.scl(dt);
        position.add(5, velocity.y, 0);

        velocity.scl(1/dt);
    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return heli;
    }
}
