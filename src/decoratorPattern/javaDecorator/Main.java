package decoratorPattern.javaDecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by KEY on 2018/3/8.
 */
public class Main {
    public static void main(String[] args) {
        int c;
        String x = "";
        byte[] b = new byte[12];
        try {
            InputStream in = new BufferedInputStream(new FileInputStream("test.txt"));
            InputStream is = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            while ((c=in.read())>=0){
                x=x+(char)c;
            }
            System.out.println(x);
            is.read(b,0,11);
            System.out.println(new String(b));
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
