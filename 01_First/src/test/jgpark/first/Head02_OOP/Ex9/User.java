package test.jgpark.first.Head02_OOP.Ex9;

public class User {
    protected String userId;
    protected String userName;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public void print()
    {
        System.out.printf("%s , %s",userId,userName);
    }
}
