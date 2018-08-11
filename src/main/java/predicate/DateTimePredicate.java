package predicate;

import signaltype.DateTypeEnum;
import main.Signal;
import bootstrap.RuleEngineBootStrap;

import java.text.ParseException;
import java.util.Date;

public class DateTimePredicate implements RuleEnginePredicate {
  private Date currentDate = new Date();
  RuleEngineBootStrap ruleEngineBootStrap = RuleEngineBootStrap.getRuleEngineInstance();

  public boolean predicate(Signal signal) throws ParseException {
    Date signalArrivingDate = ruleEngineBootStrap.getDate(signal.getSignalValue());
    DateTypeEnum dateTypeEnum = DateTypeEnum.valueOf(signal.getSignalType());

    return dateTypeEnum.isFlag() == compareSignalDateFromCurrentDate(signalArrivingDate);
  }

  private boolean compareSignalDateFromCurrentDate(Date signalDate) {
    return signalDate.before(currentDate) || signalDate.compareTo(currentDate) == 0;
  }
}
