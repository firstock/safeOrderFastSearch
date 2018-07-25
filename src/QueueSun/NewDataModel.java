package QueueSun;

class NewDataModel{
    //todo _1_key 저장할 큐 만들기
    String key;
    String newData;

    public NewDataModel() {
    }

    public NewDataModel(String key, String newData) {
        key = key;
        this.newData = newData;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        key = key;
    }

    public String getNewData() {
        return this.newData;
    }

    public void setNewData(String newData) {
        this.newData = newData;
    }
}