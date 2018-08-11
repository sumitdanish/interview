package signaltype;

public enum StringEnumType {
  ATL1("LOW"),
  ATL2("HIGH"),
  ATL3("LOW"),
  ATL4("HIGH"),
  ATL5("LOW"),
  ATL6("HIGH"),
  ATL7("LOW"),
  ATL8("LOW"),
  ATL9("LOW"),
  ATL10("LOW");
  private String value;

  StringEnumType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
