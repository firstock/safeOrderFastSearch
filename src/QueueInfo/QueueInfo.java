package QueueInfo;

import java.util.concurrent.ConcurrentHashMap;

public class QueueInfo extends QueueMap{
    ConcurrentHashMap<String, String> traceQueueInfoMap;
    String keyThreadId;
    String valueQueueId;

    public QueueInfo() {
        this.traceQueueInfoMap = new ConcurrentHashMap<String, String>();
    }

    public QueueInfo(String keyThreadId, String valueQueueId) {
        this.traceQueueInfoMap = new ConcurrentHashMap<String, String>();
        this.keyThreadId = keyThreadId;
        this.valueQueueId = valueQueueId;
    }

    public void setKeyThreadId(String keyThreadId, String valueQueueId) {
        this.keyThreadId = keyThreadId;
        this.valueQueueId = valueQueueId;
        traceQueueInfoMap.put(keyThreadId, valueQueueId);
    }

    public String getValueQueueId(String keyThreadId) {
        if(traceQueueInfoMap.containsKey(keyThreadId)){
            return traceQueueInfoMap.get(keyThreadId);
        }
        else{
            return "noKey";
        }
    }
}
