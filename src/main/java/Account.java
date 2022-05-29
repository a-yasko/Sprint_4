public class Account {

  private final String name;

  public Account(String name) {
    this.name = name;
  }

  public boolean checkNameToEmboss() {
    boolean isOneSpace;

    if (name.trim().indexOf(" ") == name.trim().lastIndexOf(" ")) {
      isOneSpace = true;
    } else {
      isOneSpace = false;
    }

    if (!name.isBlank() && name.contains(" ") && name.length() >= 3 && name.length() <= 19 && isOneSpace && !name.startsWith(" ") && !name.endsWith(" ")) {
      return true;
    } else {
      return false;
    }
  }

}