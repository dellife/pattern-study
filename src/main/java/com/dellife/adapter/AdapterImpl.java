package com.dellife.adapter;

public class AdapterImpl implements Adapter {

    @Override
    public Float twiceOf(Float f) {
        return  Math.twoTime(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        return Math.half(f.doubleValue()).floatValue();
    }
}
