package cn.edu.jxufe.entity;

/**
 * Created by 29079 on 2018/8/10.
 */
public class GouWuPing implements java.io.Serializable  {
    private Goodsinfo goodsinfo;
    private int count;
    public GouWuPing() {
    }

    public GouWuPing(Goodsinfo goodsinfo, int count) {
        this.goodsinfo = goodsinfo;
        this.count = count;
    }



    public Goodsinfo getGoodsinfo() {
        return goodsinfo;
    }

    public void setGoodsinfo(Goodsinfo goodsinfo) {
        this.goodsinfo = goodsinfo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
