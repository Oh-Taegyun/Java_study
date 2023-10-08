
class ECarStation {
    private int battery;
    private String name;
    public static int totalCharged;

    ECarStation(int battery, String name) {
        this.battery = battery;
        this.name = name;
    }

    public void show_battery() {
        System.out.println(name + " 의 배터리 : " + battery + "%, 충전할 에너지 : " + (100 - battery));
    }

    public void charge_battery() {
        totalCharged = 100 - battery;
    }

    public static void show_total_charge() {
        System.out.println("충전소에서 충전한 총 에너지 : " + totalCharged);
    }

}

public class ECar {
    public static void main(String args[]) {
        ECarStation ECar = new ECarStation(30, "ECar");
        ECarStation Ionic6 = new ECarStation(50, "Ionic6");
        ECar.show_battery();
        ECar.charge_battery();
        ECarStation.show_total_charge();
        Ionic6.show_battery();
        Ionic6.charge_battery();
        ECarStation.show_total_charge();
    }
}