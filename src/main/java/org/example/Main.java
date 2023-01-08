package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static Method method = new Method();

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final List<Long> list = new ArrayList<>();
    while (true) {
      System.out.print("Input numbers by asc (or \"exit\") >");
      final String input = scanner.next();
      if (input.equals("exit")) {
        break;
      } else {
        list.add(Long.parseLong(input));
      }
    }
    System.out.print("Input target number >");
    final Long targetNum = scanner.nextLong();
    try {
      final int index = method.binarySearch(list, targetNum);
      System.out.println(String.format("Found! at %d", index + 1));
    } catch (final Exception e) {
      System.out.println(e.getLocalizedMessage());
    }
  }
}
