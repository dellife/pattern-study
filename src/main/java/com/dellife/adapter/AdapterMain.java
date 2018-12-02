package com.dellife.adapter;

public class AdapterMain {

    public static void main(String[] args) {

        /*
        * Adapter pattern
        * 알고리즘을 요구사항에 맞춰 사용할 수 있다.
        * (연관성 없는 두 객체 묶어 사용하기)
        *
        * 필요한 요구사항에 대한 interface 를 만들고
        * 구현체에서 원래있는 알고리즘을 이용하여 구현.
        * 요구사항이 변경될 때마다 구현체만 변경하면 됨.
        *
        * */
        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(100f));
    }
}
