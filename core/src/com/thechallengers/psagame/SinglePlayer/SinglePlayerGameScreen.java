package com.thechallengers.psagame.SinglePlayer;

import com.badlogic.gdx.Screen;
import com.thechallengers.psagame.game.PSAGame;
import com.thechallengers.psagame.helpers.AssetLoader;

/**
 * Created by Phung Tuan Hoang on 9/9/2017.
 */

public class SinglePlayerGameScreen implements Screen {
    private PSAGame game;
    private SinglePlayerGameWorld world;
    private SinglePlayerGameRenderer renderer;
    private PhysicsInputHandler physicsInputHandler;
    private float runTime = 0;

    public SinglePlayerGameScreen(PSAGame game) {
        this.game = game;
        world = new SinglePlayerGameWorld();
        renderer = new SinglePlayerGameRenderer(world);
        physicsInputHandler = new PhysicsInputHandler(world);
        AssetLoader.loadGameTexture();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        runTime += delta;
        world.update(delta);
        renderer.render(runTime);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}