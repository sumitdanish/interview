package predicate;

import signaltype.IntegerTypeEnum;
import main.Signal;

public class IntegerPredicate implements RuleEnginePredicate {
  public boolean predicate(Signal signal) {
    IntegerTypeEnum integerTypeEnum = IntegerTypeEnum.valueOf(signal.getSignalType());
    double definedSignalValue = Double.parseDouble(integerTypeEnum.getValue().trim());
    return compareSignalValue(signal.getSignalValue(), (int)definedSignalValue);
  }

  private boolean compareSignalValue(String signalValue, Integer definedSignalValue) {
    double d = Double.parseDouble(signalValue);
    Integer modifiedValueOfSignal = (int) d;
    return modifiedValueOfSignal < definedSignalValue;
  }
}
