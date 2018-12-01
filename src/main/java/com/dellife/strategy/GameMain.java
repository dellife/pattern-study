package com.dellife.strategy;

public class GameMain {

    public static void main(String[] args) {

       /*
        스트레티지 패턴
        여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근점에서
        서로 교환 가능하도록 하는 패턴

        게임 캐릭터는 무엇을 드는지 무기에게 공격을 맡김.
        */

        GameCharacter character = new GameCharacter();

        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

    }
}
