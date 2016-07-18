package net.archeryc.ycninegridview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by 24706 on 2016/7/18.
 */
public class YcNineGridView extends ViewGroup {
    private static final int COLUM_NUM = 3;// 三列
    private static final int ROW_NUM = 3;//三行
    private static final int GRID_SPACING = 3;

    private int imageWidth;
    private int imageHeight;

    private List<AttachesEntity> entityList;

    public YcNineGridView(Context context) {
        super(context);
    }

    public YcNineGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public YcNineGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
