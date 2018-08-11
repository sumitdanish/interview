package signaltype;

public enum IntegerTypeEnum {

    ATL1("240"),
    ATL2("21"),
    ATL3("2"),
    ATL4("20"),
    ATL5("10"),
    ATL6("21.90"),
    ATL7("210"),
    ATL8("2"),
    ATL9("210"),
    ATL10("210");
    private String value;

    IntegerTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
