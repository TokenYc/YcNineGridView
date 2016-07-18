package net.archeryc.ycninegridview;

import java.io.Serializable;

/**
 * Created by wangjing on 2015/10/18.
 */
public  class AttachesEntity implements Serializable{
    /**
     * width : 945
     * height : 1337
     * type : 0
     * url : http://7xilx2.com1.z0.glb.clouddn.com/20150925_2175304_1443149567407.jpg?imageView2/1/w/420/h/594/interlace/1
     * big_url : http://7xilx2.com1.z0.glb.clouddn.com/20150925_2175304_1443149567407.jpg?imageView2/1/w/640/h/905/interlace/1
     */

    private int width;
    private int height;
    private int type;
    private String url;
    private String big_url;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBig_url(String big_url) {
        this.big_url = big_url;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public String getBig_url() {
        return big_url;
    }
}
