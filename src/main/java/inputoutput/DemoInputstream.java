package inputoutput;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DemoInputstream {
    public int sumOfStream(InputStream inputStream) throws IOException {
        int result = 0;
        int size = inputStream.available();
       for (int i = 0; i < size; i++) {
           result  += inputStream.read();
       }
        return result;
    }

    public static void main(String[] args) throws IOException {
        byte[] b = new byte[]{3, 13, 4, 23};
        InputStream inputStream = new ByteArrayInputStream(b);
        System.out.println(new DemoInputstream().sumOfStream(inputStream));


    }
}


