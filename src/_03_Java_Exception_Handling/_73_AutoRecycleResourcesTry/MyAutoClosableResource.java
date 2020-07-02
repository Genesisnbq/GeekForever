package _03_Java_Exception_Handling._73_AutoRecycleResourcesTry;

import java.io.IOException;

public class MyAutoClosableResource implements AutoCloseable {

    private final String resName;
    private int counter;

    public MyAutoClosableResource(String resName) {
        this.resName = resName;
    }

    public String read() throws IOException {
        counter++;
        if (Math.random() > 0.1) {
            return "You got lucky to read from " + resName + " for " + counter + " times...";
        } else {
            throw new IOException("resource不存在哦");
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("资源释放了:" + resName);
    }
}
