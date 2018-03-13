/**
 * Created by KEY on 2018/3/8.
 */
public class main {
    public static void main(String[] args) {
        System.out.println("开始了："+Thread.currentThread().getName());

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("这是子线程："+Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        System.out.println("结束吧："+Thread.currentThread().getName());

    }
}
