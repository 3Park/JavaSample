package test.jgpark.first.Head02_OOP.Ex5;

public class AccountPay extends Payment {
    @Override
    protected void Payment() {
        Validate(0.0);
    }

    @Override
    protected void Cancel() {
        ValidateCancel(0.0);
    }


}
