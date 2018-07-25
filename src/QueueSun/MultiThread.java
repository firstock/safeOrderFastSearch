package QueueSun;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

class MultiThread implements Runnable {

    String ip, num;
    ConcurrentLinkedQueue<NewDataModel> tempQueue;
    ConcurrentHashMap<String, ConcurrentLinkedQueue<NewDataModel>> eqpQueueList;
    NewDataModel newDataModel;


    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    public MultiThread(String tempIp, ConcurrentHashMap<String, ConcurrentLinkedQueue<NewDataModel>> tempEqpQueueList, String tempNum) {

        System.out.println(tempIp + " 스레드가 생성되었습니다.");

        this.ip = tempIp;
        this.eqpQueueList = tempEqpQueueList;
        this.num = tempNum;
    }

    public void run() {

        String threadId = Long.toString(Thread.currentThread().getId());

        // 0.0x 단위로 새 메모리에 할당
        newDataModel= new NewDataModel();
        newDataModel.setKey(threadId + "_" + System.nanoTime());
        //todo _1_key를 SenderThread도 공유할 수 있는 어딘가(큐??)에 저장해야
        //todo _1_싱글톤+key를 저장하는 자료구조

        if (false == this.eqpQueueList.containsKey(ip)) {

            tempQueue = new ConcurrentLinkedQueue<NewDataModel>();
            tempQueue.add(newDataModel);

            this.eqpQueueList.put(ip, tempQueue);
        } else {
            tempQueue = eqpQueueList.get(ip);
            tempQueue.add(newDataModel);
        }

//        System.out.println("Before      IP : " + ip + "     Key : " + newDataModel.getKey() + "     NewData : " + newDataModel.NewData + "     QueueCount : " + tempQueue.size() + "     Num : " + num);

        try { Thread.sleep(10); } catch (InterruptedException ie) { }

//        newDataModel.NewData = dateFormat.format(new Date());

//        System.out.println("After       IP : " + ip + "     Key : " + newDataModel.getKey() + "     NewData : " + newDataModel.NewData);
    }
}