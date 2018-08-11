package signaltype;

public enum DateTypeEnum {
  ATL1("after", false),
  ATL2("after", false),
  ATL3("before", true),
  ATL4("before", false),
  ATL5("before", true),
  ATL6("before", true),
  ATL7("before", true),
  ATL8("before", false),
  ATL9("before", true),
  ATL10("before", true),;
  private String value;
  private boolean flag;

  DateTypeEnum(String value, boolean flag) {
    this.value = value;
    this.flag = flag;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public boolean isFlag() {
    return flag;
  }

  public void setFlag(boolean flag) {
    this.flag = flag;
  }
}
