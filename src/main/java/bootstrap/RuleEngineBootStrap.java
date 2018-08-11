package bootstrap;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.Signal;
import predicate.DateTimePredicate;
import predicate.IntegerPredicate;
import predicate.RuleEnginePredicate;
import predicate.StringPredicate;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RuleEngineBootStrap {

    private static ClassLoader loader = Thread.currentThread().getContextClassLoader();
    private static ObjectMapper objectMapper;
    private static SimpleDateFormat simpleDateFormat;
    private static Map<String, RuleEnginePredicate> predicateMap;
    public RuleEngineBootStrap() {
        try {
            init();
        } catch (IOException io) {
            System.out.println("Error while initialing the bootstrap engine " + io);
        }
    }

    private void init() throws IOException {
        objectMapper = new ObjectMapper();
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        predicateMap = new HashMap<>();
        predicateMap.put("INTEGER",new IntegerPredicate());
        predicateMap.put("DATETIME",new DateTimePredicate());
        predicateMap.put("STRING",new StringPredicate());
    }

    private static class RuleProperties {
        private static final RuleEngineBootStrap INSTANCES = new RuleEngineBootStrap();
    }

    public static ObjectMapper objectMapper() {
        return objectMapper;
    }

    public static RuleEngineBootStrap getRuleEngineInstance() {
        return RuleProperties.INSTANCES;
    }

    public static Date getDate(String value) throws ParseException {
        return simpleDateFormat.parse(value);
    }

    public static Map<String,RuleEnginePredicate> predicateMap(){
        return predicateMap;
    }

    public static List<Signal> readSignals() throws IOException {
        InputStream inputStream = loader.getResourceAsStream("raw_data.json");
        List<Signal> signalList = objectMapper.readValue(inputStream,new TypeReference<List<Signal>>(){});
        return signalList;
    }
}
