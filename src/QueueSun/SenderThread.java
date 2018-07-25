package QueueSun;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * key받아서 찾은 queue를 장비eqThread에 보낸다
 */
class SenderThread implements Runnable {

    String name;
    int i;

    ConcurrentHashMap<String, ConcurrentLinkedQueue<NewDataModel>> concurrentHashMap;

    public SenderThread(String name, ConcurrentHashMap<String, ConcurrentLinkedQueue<NewDataModel>> tempConcurrentHashMap) {

        System.out.println("Sender" + name + " 스레드가 생성되었습니다.");

        this.name = name;
        this.concurrentHashMap = tempConcurrentHashMap;
    }

    public void run() {

        if (concurrentHashMap != null && concurrentHashMap.mappingCount() > 0) {
            if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                //todo _1_올바른 key 전달받아야
                String key = name + Integer.toString(i);

                if (concurrentHashMap.containsKey(key) == true) {
                    System.out.println("Thread Name : " + "Key : " + key + ", Value : " + concurrentHashMap.get(key));
                } else {
                    System.out.println("Thread Name : " + "Not Exists Key : " + key);
                }
                //todo _2_찾은 큐를 sender Thread로 직접 날리기
            }

        }
    }
}