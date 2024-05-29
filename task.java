public class task {
    static int counter=0;
    private int id;
    private  String name;                        //task name
    private  String des;                         //description
    private  String ststus;                        //status


    public task(String name, String des, String ststus) {

        this.id = ++counter;
        this.name = name;
        this.des = des;
        this.ststus = ststus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getStstus() {
        return ststus;
    }

    public void setStstus(String ststus) {
        this.ststus = ststus;
    }

    @Override
    public String toString() {
        return "task[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", des='" + des + '\'' +
                ", ststus='" + ststus + '\'' +
                ']';
    }
}
