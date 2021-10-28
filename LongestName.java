class LongestName {
  public String longestName(String[] names) {
    String longest = "";
    for (String name : names) {
      if (longest.length() < name.length()) {
        longest = name;
      }
    }
    return longest;
  }
}

public static void main(String[] args) {
  String[] names = {"Adam", "Clara", "George", "Jane"};
  longestName(names);
}
