package jp.techinstitute.flyingdoroid;

import android.content.Context;
import android.graphics.Canvas;

/**
 * Created by ikeda on 2015/11/18.
 */
public class Enemy extends AbstractGameObject {
    public Enemy(Context context, int width, int height) {
        super(context, R.mipmap.enemy_pinkdude_jump, width, height);
    }

    public void draw(Canvas c) {
        draw(c, x, y);
        x -= 5;
        if(x < left) {
            x = right;
        }
    }

    @Override
    public void setMovingBoundary(int left, int top, int right, int bottom) {
        super.setMovingBoundary(left, top, right, bottom);
        left -= width;
        x = right;
        y = 300;
    }
}
