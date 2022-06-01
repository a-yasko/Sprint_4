public class Account {

  private final String name;

  public Account(String name) {
    this.name = name;
  }

  private boolean checkOneSpace() {
    boolean isOneSpace;

    if (name.trim().indexOf(" ") == name.trim().lastIndexOf(" ")) {
      isOneSpace = true;
    } else {
      isOneSpace = false;
    }

    return isOneSpace;
  }

  public boolean checkNameToEmboss() {
    if ((name != null) &&  !name.isBlank() && name.contains(" ") && name.length() >= 3 && name.length() <= 19 && checkOneSpace() && !name.startsWith(" ") && !name.endsWith(" ")) {
      return true;
    } else {
      return false;
    }
  }

}