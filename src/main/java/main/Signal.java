package main;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Signal {
  @JsonProperty("signal")
  private String signalType;

  @JsonProperty("value")
  private String signalValue;

  @JsonProperty("value_type")
  private String signalValueType;

  public Signal() {}

  public Signal(String signalType, String signalValue, String signalValueType) {
    this.signalType = signalType;
    this.signalValue = signalValue;
    this.signalValueType = signalValueType;
  }

  public String getSignalType() {
    return signalType;
  }

  public void setSignalType(String signalType) {
    this.signalType = signalType;
  }

  public String getSignalValue() {
    return signalValue;
  }

  public void setSignalValue(String signalValue) {
    this.signalValue = signalValue;
  }

  public String getSignalValueType() {
    return signalValueType;
  }

  public void setSignalValueType(String signalValueType) {
    this.signalValueType = signalValueType;
  }

  @Override
  public String toString() {
    return "Signal{"
        + "signalType='"
        + signalType
        + '\''
        + ", signalValue='"
        + signalValue
        + '\''
        + ", signalValueType='"
        + signalValueType
        + '\''
        + '}';
  }
}
