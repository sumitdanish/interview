package action;

import main.Signal;

import java.util.Map;

public interface Action {
    public  void action(Signal signal, Map<String,String> status);
}
