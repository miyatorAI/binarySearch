package org.example;

import static java.lang.System.exit;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class MethodTest {
  private Method sut = new Method();

  @Test
  void test() throws Exception {
    final List<Long> list = Arrays.asList(1L, 2L, 4L, 6L, 34L, 74L, 856L, 966L);
    final int index = sut.binarySearch(list, 4L);
    assert index == 2;
  }

  @Test
  void test_targetNotFound() {
    final List<Long> list = Arrays.asList(1L, 2L, 4L, 6L, 34L, 74L, 856L, 966L);
    try {
      final int index = sut.binarySearch(list, 3L);
      exit(-1);
    } catch (final Exception e) {
      // OK
    }
  }
}
