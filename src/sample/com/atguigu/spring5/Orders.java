package sample.com.atguigu.spring5;

public class Orders {
    private String oname;

    public String getOname() {
        return oname;
    }

    public String getAddress() {
        return address;
    }

    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

}
