package _02_Java_Object_Oriented_Programming._24_Phone;

import _02_Java_Object_Oriented_Programming._24_Phone.parts.*;

public class PhoneMaker {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.hasFigurePrintUnlocked = true;
        phone.price = 2999.9;
        phone.screen = new Screen();
        phone.screen.producer = "倪彬琪";
        phone.screen.size = 6.6;
        MainBoard mainboard = new MainBoard();
        mainboard.model = "EA888";
        mainboard.year = 2020;
        mainboard.cpu = new CPU();
        mainboard.cpu.producer = "倪彬琪";
        mainboard.cpu.speed = 3.5;
        mainboard.memory = new Memory();
        mainboard.memory.producer = "三星";
        mainboard.memory.capacity = 4;
        mainboard.storage = new Storage();
        mainboard.storage.producer = "Intel";
        mainboard.storage.capacity = 256;

        //>> todo 想想我们创建了几个对象, 有创建了几个引用?
    }
}
