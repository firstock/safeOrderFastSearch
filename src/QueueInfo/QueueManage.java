//package QueueInfo;
//
//import java.util.concurrent.ConcurrentHashMap;
//
//public class QueueManage {
//    ConcurrentHashMap<String, WaitQueue> traceQueueInfoMap;
//    WaitQueue waitQueue;
//    String keyThreadId;
//
//    public QueueManage() {
//        this.traceQueueInfoMap = new ConcurrentHashMap<String, WaitQueue>();
//    }
//
//    public QueueManage(String keyThreadId, String valueQueueId) {
//        this.traceQueueInfoMap = new ConcurrentHashMap<String, WaitQueue>();
//        this.keyThreadId = keyThreadId;
//    }
//
//    public void setKeyThreadId(String keyThreadId, WaitQueue waitQueue) {
//        this.keyThreadId = keyThreadId;
//        traceQueueInfoMap.put(keyThreadId, null);
//    }
//
//    public WaitQueue getValueQueueId(String keyThreadId) {
//        if(traceQueueInfoMap.containsKey(keyThreadId)){
//            return traceQueueInfoMap.get(keyThreadId);
//        }
//        else{
//            return null;
//        }
//    }
//}
