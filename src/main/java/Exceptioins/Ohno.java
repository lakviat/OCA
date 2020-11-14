package Exceptioins;

import java.io.IOException;

public class Ohno {
    public void ohno() throws IOException{
        System.out.println("its ok");
        throw new IllegalArgumentException();
    }
}
