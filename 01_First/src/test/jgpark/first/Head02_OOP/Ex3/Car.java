package test.jgpark.first.Head02_OOP.Ex3;

public class Car {
    private String name;
    private int year;
    private String type;
    private int price;

    @Override
    public String toString() {
        return "Car{" +
                "제조사 ='" + name + '\'' +
                ", 연식 =" + year +
                ", 구동방식 ='" + type + '\'' +
                ", 가격 =" + price +
                '}';
    }

    public Car(String name, int year, String type, int price) {
        this.name = name;
        this.year = year;
        this.type = type;
        this.price = price;
    }

    public void ChangeGear(String toChange)
    {
        System.out.println(toChange + " 으로 기어변경 한다.");
    }

    public void ControlSteer(double degree)
    {
        if(degree > 960)
            degree = 960;

        if(degree < -960)
            degree = -960;

        if(degree > 0.0)
            System.out.println("스티어링을 우측으로 " + degree + " 도 꺾는다");
        else if(degree < 0.0)
            System.out.println("스티어링을 좌측으로 " + (degree * -1) + " 도 꺾는다");
        else if(degree == 0.0)
            System.out.println("스티어링을 중앙으로 둔다");
    }

    public void  ChangeVelocity(double speed)
    {
        if(speed > 100)
            speed = 100;

        if(speed < -100)
            speed = -100;

        if(speed > 0.0)
            System.out.println("자동차를 " + speed + " 만큼 가속 한다");
        else if(speed < 0.0)
            System.out.println("자동차를 " + (speed * -1) + " 만큼 감속한다.");

    }

    public void TurnSignalControl(String signal)
    {
        System.out.println("자동차의 방향지시등을  " + signal + " 로 변경한다.");
    }

    public void AutoPilotControl(boolean isTurnOn)
    {
        if(isTurnOn)
            System.out.println("자율주행을 켠다");
        else
            System.out.println("자율주행을 끈다");
    }

}
