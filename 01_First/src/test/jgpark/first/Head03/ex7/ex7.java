package test.jgpark.first.Head03.ex7;

public class ex7 {
    public static void main(String[] args) {
        for (payEnum e : payEnum.values()) {
            System.out.println(e.toString());
        }

        payEnum ee = payEnum.CRYPTO;
        String aa = "";
        switch(ee)
            {
                case CRYPTO:
                case CARD:
                case ACCOUNT:
                    aa = ee.toString();
                    break;
                default:
                    aa = "fail";
            }
    }
}
