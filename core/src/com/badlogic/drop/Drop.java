package com.badlogic.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Drop extends Game {
    SpriteBatch batch;

    @Override
    public void create() {
        batch = new SpriteBatch();

        Assets.load();

        this.setScreen(new MainMenuScreen(this));
    }

    @Override
    public void render() {
        super.render(); // important!
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
