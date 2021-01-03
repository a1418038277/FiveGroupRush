package firsttest.test.fivegroupproject.wyl.goods;

public class GoodsBean {
    private String goodsName;
    private int price;
    private int priceOld;
    private int praise;
    private int curriculum;
    private int number;

    public GoodsBean(String goodsName, int price, int priceOld, int praise, int curriculum, int number) {
        this.goodsName = goodsName;
        this.price = price;
        this.priceOld = priceOld;
        this.praise = praise;
        this.curriculum = curriculum;
        this.number = number;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(int priceOld) {
        this.priceOld = priceOld;
    }

    public int getPraise() {
        return praise;
    }

    public void setPraise(int praise) {
        this.praise = praise;
    }

    public int getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(int curriculum) {
        this.curriculum = curriculum;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
