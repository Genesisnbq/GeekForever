package _02_Java_Object_Oriented_Programming._23_supermarket;

public class HuaweiPhone extends phoneMerchandiseV2 {
    public HuaweiPhone(String name, String id, int count, double soldPrice,
                       double purchasePrice, double screenSize, double cpuHZ,
                       int memoryG, int storageG, String brand, String os) {
        super(name, id, count, soldPrice, purchasePrice, screenSize, cpuHZ, memoryG, storageG, brand, os);
    }
}
