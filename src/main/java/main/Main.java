package main;

import predicate.RuleEnginePredicate;
import bootstrap.RuleEngineBootStrap;

import java.util.Map;

public class Main {
  private static RuleEngineBootStrap INSTANCES = RuleEngineBootStrap.getRuleEngineInstance();

  public static void main(String[] args) throws Exception {
    Map<String, RuleEnginePredicate> ruleEnginePredicate = INSTANCES.predicateMap();
    for (Signal signal : INSTANCES.readSignals()) {
      String signalType = signal.getSignalValueType().trim().toUpperCase();
      RuleEnginePredicate enginePredicate = ruleEnginePredicate.get(signalType);
      if(!enginePredicate.predicate(signal)){
        System.out.println("signal = " + signal);
      }
    }
  }
}
