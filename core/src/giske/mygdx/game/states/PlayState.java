package giske.mygdx.game.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import sprites.Heli;

public class PlayState extends State {
    private Heli heli;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        heli = new Heli(50,400);
    }

    @Override
    public void handleInput() {
    }

    @Override
    public void update(float dt) {
        handleInput();
        heli.update(dt);

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(heli.getTexture(), heli.getPosition().x, heli.getPosition().y);
        sb.end();
    }

    @Override
    public void dispose() {
    }
}
