package exday6;

import java.util.*;

public class SampleEx602 {
  public static void main(String[] args) {
    HashSet<String> hs = new HashSet<String>();
    hs.add("山田");
    hs.add("山田");
    hs.add("大田");
    hs.add("齋藤");
    hs.add("齋藤");
    for (String s: hs) {
      System.out.println(s);
    }
  }
}
