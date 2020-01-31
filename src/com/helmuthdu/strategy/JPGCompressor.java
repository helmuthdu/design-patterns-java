package com.helmuthdu.strategy;

public class JPGCompressor implements Compressor{
    @Override
    public void compress(String name) {
        System.out.println("Compressing using JPG");
    }
}
