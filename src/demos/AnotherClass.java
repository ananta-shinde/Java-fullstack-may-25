package demos;

class AnotherClass {
    private int count;
    private String uid;

    public AnotherClass() {
    }

    public AnotherClass(int count) {
        this.count = count;
    }

    public AnotherClass(int count, String uid) {
        this.count = count;
        this.uid = uid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
