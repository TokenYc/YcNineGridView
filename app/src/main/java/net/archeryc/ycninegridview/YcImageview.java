package net.archeryc.ycninegridview;

import android.content.Context;
import android.graphics.Canvas;
import android.media.Image;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by 24706 on 2016/7/18.
 */
public class YcImageview extends ImageView{
    public YcImageview(Context context) {
        super(context);
    }

    public YcImageview(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public YcImageview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
