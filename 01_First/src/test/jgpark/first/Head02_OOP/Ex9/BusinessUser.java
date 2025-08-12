package test.jgpark.first.Head02_OOP.Ex9;

public class BusinessUser extends User{
    private String comName;

    public BusinessUser(String userId, String userName, String comName) {
        super(userId, userName);
        this.comName = comName;
    }

    @Override
    public void print() {
        super.print();

        System.out.printf(" %s  ",comName);
    }
}
