package _02_Java_Object_Oriented_Programming._25_Supermarket_System.supermarket;

public class LittleSuperMarket {
    public String address;
    public String supermarketName;
    public int parkingCount;
    public Merchandise[] merchandise;
    public double incomingSum;
    public int[] merchandiseSold;

    public void init(String supermarketName, String address, int parkingCount,
                     int merchandiseCount, int count) {
        this.address = address;
        this.supermarketName = supermarketName;
        this.parkingCount = parkingCount;
        merchandise = new Merchandise[merchandiseCount];
        for (int i = 0; i < merchandise.length; i++) {
            Merchandise m = new Merchandise();
            m.name = "商品" + i;
            m.count = count;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = m.purchasePrice * (1 + Math.random());
            m.id = "ID" + i;
            merchandise[i] = m;
        }
        merchandiseSold = new int[merchandise.length];
    }

    public Merchandise getBiggestProfit() {  //获取最大利润的商品
        System.out.println("LittleSuperMarket的getBiggestProfit方法使用的对象是: " + this);
        Merchandise cur = null;
        for (Merchandise m : merchandise) {
            if (cur == null) {
                cur = m;
            } else {
                if (cur.calculateProfit() < m.calculateProfit()) {
                    cur = m;
                }
            }
        }
        return cur;
    }
}
