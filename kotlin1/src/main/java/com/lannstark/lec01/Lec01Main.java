package com.lannstark.lec01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lec01Main {

  public static void main(String[] args) {
    long number1 = 10L; // (1)
    final long number2 = 10L; // (2)

    Long number3 = 1_000L; // (3)
    Person person = new Person("장동민"); // (4)

    final List<Integer> list = Arrays.asList(1, 2);
    list.add(3); // 안에 값은 바뀌는 거 가능
    // list = new ArrayList<>(); // final이라서 불가능

    Long test = 1_000L;
    long test1 = 1_000L;
  }

}
