package com.bendas.wholesquarecount;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SolutionTest {

  private static Solution solution = new Solution();

  @Test
  public void shouldSolution() {
    int result = solution.solution(4, 17);
    assertThat(result, is(3));
  }

  @Test
  public void shouldSolution1() {
    int result = solution.solution(1, 25);
    assertThat(result, is(5));
  }

  @Test
  public void shouldSolution2() {
    int result = solution.solution(3, 100);
    assertThat(result, is(9));
  }

  @Test
  public void shouldSolution3() {
    int result = solution.solution(2, 4);
    assertThat(result, is(1));
  }

  @Test
  public void shouldSolution4() {
    int result = solution.solution(5, 6);
    assertThat(result, is(0));
  }

  @Test
  public void shouldSolution5() {
    int result = solution.solution(9, 36);
    assertThat(result, is(4));
  }

  @Test
  public void shouldSolution6() {
    int result = solution.solution(25, 36);
    assertThat(result, is(2));
  }

  @Test
  public void shouldSolution7() {
    int result = solution.solution(8, 15);
    assertThat(result, is(1));
  }

  @Test(expected = RuntimeException.class)
  public void shouldSolution8() {
    solution.solution(-10, 15);
  }
  @Test(expected = RuntimeException.class)
  public void shouldSolution9() {
    solution.solution(100, 10);
  }
}
