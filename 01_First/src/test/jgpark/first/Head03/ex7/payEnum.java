package test.jgpark.first.Head03.ex7;

public enum payEnum {
    CARD("카드"),
    ACCOUNT ("계좌"),
    CRYPTO ("가상화폐");

    private final String name;

    payEnum(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                "origin name : " + name();
    }


}
