package io.jeongjaeeom.iloveyouboss.basic.ex01;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ScoreCollectionTest {

  @Test
  public void arithmeticMean() {
    // 준비
    ScoreCollection collection = new ScoreCollection();
    collection.add(() -> 5);
    collection.add(() -> 7);

    // 실행
    int actualResult = collection.arithmeticMean();

    // 단언
    assertThat(actualResult, equalTo(6));

  }
}