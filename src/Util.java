class Util {
  public static String concat(String[] strs) {
    StringBuilder builder = new StringBuilder();
    for(String str : strs) {
      builder.append(str);
    }
    return builder.toString();
  }
}
