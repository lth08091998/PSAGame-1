package com.thechallengers.psagame.helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by Phung Tuan Hoang on 9/6/2017.
 */

public class AssetLoader {
    //textures - to be disposed after texture region is created
    public static Texture background_texture;
    public static Texture button_texture;
    public static Texture setting_button_texture;
    public static Texture menu_crane_texture;
    public static Texture game_background;

    //texture region
    public static TextureRegion button_up, button_down;
    public static TextureRegion background;

    //font
    public static BitmapFont arial;

    public static void loadMenuTexture() {

        background_texture = new Texture(Gdx.files.internal("textures/menubackground.png"));
        button_texture = new Texture(Gdx.files.internal("textures/button.png"));
        menu_crane_texture = new Texture(Gdx.files.internal("textures/menucrane.png"));
        setting_button_texture = new Texture(Gdx.files.internal("textures/setting_button.png"));
        game_background = new Texture(Gdx.files.internal("textures/gamebackground.png"));

        background = new TextureRegion(background_texture, 0, 0, 1080, 1920);
        button_up = new TextureRegion(button_texture, 0, 0, 200, 100);
        button_down = new TextureRegion(button_texture, 200, 0, 200, 100);

        arial = new BitmapFont(Gdx.files.internal("font/arial.fnt"));
    }

    public static void disposeMenuTexture() {
        background_texture.dispose();
        button_texture.dispose();
        arial.dispose();
        setting_button_texture.dispose();
    }
}
