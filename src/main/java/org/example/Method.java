package org.example;

import java.util.List;

public class Method {
  int binarySearch(final List<Long> list, final Long targetNum) throws Exception {
    final int length = list.size();
    int head = 0;
    int tail = length - 1;
    while (head <= tail) {
      int center = (head + tail) / 2;
      if (list.get(center) == targetNum) {
        return center;
      } else if (list.get(center) < targetNum) {
        head = center + 1;
      } else {
        tail = center - 1;
      }
    }
    throw new Exception("not Found");
  }
}
