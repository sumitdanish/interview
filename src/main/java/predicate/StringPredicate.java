package predicate;

import main.Signal;
import signaltype.StringEnumType;

public class StringPredicate implements RuleEnginePredicate {
  public boolean predicate(Signal signal) {
    StringEnumType stringEnumType = StringEnumType.valueOf(signal.getSignalType());
    String signalValue = signal.getSignalValue();
    String definedSignalValue = stringEnumType.getValue();
    return compareSignalValue(signalValue, definedSignalValue);
  }

  private boolean compareSignalValue(String signalValue, String definedSignalValue) {
    return signalValue.equalsIgnoreCase(definedSignalValue);
  }
}
