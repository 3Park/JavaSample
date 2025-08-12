package test.jgpark.first.Head02_OOP.Ex9;

public class PersonalUser extends User{
    private String email;

    public PersonalUser(String userId, String userName, String email) {
        super(userId, userName);
        this.email = email;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf(" %s  ",email);
    }
}
