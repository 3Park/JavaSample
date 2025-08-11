package test.jgpark.first.Head02_OOP.Ex3;

public class Ex3 {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 2023, "AWD", 6000);

        car.AutoPilotControl(true);
        car.ChangeGear("D");
        car.ChangeVelocity(30);
        car.ControlSteer(10);
        car.TurnSignalControl("오른쪽");

        System.out.println(car.toString());
    }
}
