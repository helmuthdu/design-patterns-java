package com.helmuthdu.strategy;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String name) {
        compressor.compress(name);
        filter.apply(name);
    }
}
