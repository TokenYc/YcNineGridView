package net.archeryc.ycninegridview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 24706 on 2016/7/18.
 */
public class YcNineGridView extends ViewGroup {
    private static final int COLUM_COUNT = 3;// 三列
    private static final int ROW_COUNT = 3;//三行
    private static final int GRID_SPACING = 3;

    private int columCount;
    private int rawCount;
    private int gridWidth;
    private int gridHeight;

    private List<AttachesEntity> mAttachList;
    private List<YcImageview> imageviewList;

    public YcNineGridView(Context context) {
        this(context,null);
    }

    public YcNineGridView(Context context, AttributeSet attrs) {
        this(context,attrs,0);
    }

    public YcNineGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        imageviewList = new ArrayList<>();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height=0;
        int totalWidth=width-getPaddingLeft()-getPaddingRight();
        if (mAttachList.size()==1){ //处理一张图片的情况

        }else{
            gridHeight=gridWidth=(totalWidth-2*GRID_SPACING)/COLUM_COUNT;
        }
        width=gridWidth*columCount+GRID_SPACING*(columCount-1)+getPaddingLeft()+getPaddingRight();
        height=gridHeight*rawCount+GRID_SPACING*(rawCount-1)+getPaddingLeft()+getPaddingRight();
        setMeasuredDimension(width,height);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        if (mAttachList==null) return;
        int size=mAttachList.size();
        for (int i=0;i<size;i++){
            YcImageview imageview = (YcImageview) getChildAt(i);
            int rowNum=i/columCount;
            int columNum=i%columCount;
            int left=columNum*(gridWidth+GRID_SPACING)+getPaddingLeft();
            int top=rowNum*(gridHeight+GRID_SPACING)+getPaddingTop();
            int right=left+gridWidth;
            int bottom=top+gridHeight;
            imageview.layout(left,top,right,bottom);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setData(List<AttachesEntity> list){
        List<AttachesEntity> attachList=list;
        if (mAttachList==null||mAttachList.isEmpty()){
            setVisibility(GONE);
        }else{
            setVisibility(VISIBLE);
        }
        //添加图片
        int imageCount=attachList.size();
        if (imageCount>COLUM_COUNT*ROW_COUNT){
            attachList = attachList.subList(0, COLUM_COUNT * ROW_COUNT);
            imageCount=attachList.size();
        }
        if (mAttachList==null){
            for (int i=0;i<mAttachList.size();i++){
                addView(getImageView(i),generateDefaultLayoutParams());
            }
        }else{
            int oldCount=mAttachList.size();
            int newCount=imageCount;
            if (oldCount>newCount){
                removeViews(newCount,oldCount-newCount);
            }else if (oldCount<newCount){
                for (int i=oldCount;i<newCount;i++){
                    addView(getImageView(i),generateDefaultLayoutParams());
                }
            }
        }
        mAttachList=attachList;
        requestLayout();
    }

    private YcImageview getImageView(int position){
        if (position<imageviewList.size()){
            return imageviewList.get(position);
        }else{
            YcImageview imageview = new YcImageview(getContext());
            imageviewList.add(imageview);
            return imageview;
        }
    }


}
