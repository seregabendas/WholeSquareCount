package com.bendas.wholesquarecount;

public class Solution {

  public int solution(int A, int B) {
    if (A < 0 || B < 0) {
      throw new RuntimeException("Wrong value");
    }
    if (A > B) {
      throw new RuntimeException("First value is bigger then second one");
    }
    double bSqrt = Math.sqrt(B);
    double aSqrt = Math.sqrt(A);
    int result = (int) Math.floor(bSqrt) - (int) Math.ceil(aSqrt) + 1;
    return result;
  }
}
