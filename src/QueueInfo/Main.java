package QueueInfo;

public class Main {

    public static void main(String[] args) {
        QueueInfo qi= new QueueInfo("th001","eq001");
        qi.setKeyThreadId("th001","que001");
        System.out.println(qi.getValueQueueId("th001"));

    }
}
