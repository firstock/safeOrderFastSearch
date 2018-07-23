package QueueInfo;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @param(queue_id,queue_itself)
 */
public class QueueMap {
    ConcurrentHashMap<String, ConcurrentLinkedQueue> conMapQue;
    ConcurrentLinkedQueue clq;
    String queueId;


    public ConcurrentLinkedQueue getQueue() {
        //todo
        ConcurrentLinkedQueue clq= new ConcurrentLinkedQueue();
        return clq;
    }

    public void setConMapQue(String queueID, ConcurrentLinkedQueue conMapQue) {
        //todo
    }
}
