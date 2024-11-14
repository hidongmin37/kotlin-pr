package com.lannstark.lec12;

public class Lec12Main {

  public static void main(String[] args) {
    // 이름을 명명하지 않는다면 companion으로 사용가능
    // Person.Companion.newBaby("ABC")
    //     Person.Factory.newBaby("ABC");
    Person.newBaby("ABC"); // @JvmStatic 어노테이션 사용함으로서 가능

  }

}
