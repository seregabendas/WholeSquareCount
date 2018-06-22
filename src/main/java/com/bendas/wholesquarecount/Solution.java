package com.bendas.wholesquarecount;

public class Solution {

  public int solution(int val1, int val2) {
    if (val1 < 0 || val2 < 0) {
      throw new RuntimeException("Wrong value");
    }
    if (val1 > val2) {
      throw new RuntimeException("First value is bigger then second one");
    }
    double val2sqrt = Math.sqrt(val2);
    double val1sqrt = Math.sqrt(val1);
    int result = (int) Math.floor(val2sqrt) - (int) Math.ceil(val1sqrt) + 1;
    return result;
  }
}
