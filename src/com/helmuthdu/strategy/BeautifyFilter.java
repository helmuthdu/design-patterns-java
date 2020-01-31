package com.helmuthdu.strategy;

public class BeautifyFilter implements Filter {
    @Override
    public void apply(String name) {
        System.out.println("Applying beautify filter");
    }
}
