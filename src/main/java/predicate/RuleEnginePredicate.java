package predicate;

import main.Signal;

import java.text.ParseException;

public interface RuleEnginePredicate {
    public boolean predicate(Signal signal) throws Exception;
}
