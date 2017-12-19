public class Main {

  public static void main(String[] args) {

    AirCraft jetFighter = new F16();
    AirCraft jetFighter2 = new F35();
    AirCraft jetFighter3 = new F35();
    AirCraft jetFighter4 = new F35();
    AirCraft jetFighter5 = new F35();
    AirCraft jetFighter6 = new F35();
    AirCraft jetFighter7 = new F35();

    System.out.println(jetFighter2.getStatus());
    System.out.println(jetFighter2.fight());
    System.out.println(jetFighter2.getStatus());
    System.out.println(jetFighter2.refill(30));
    System.out.println(jetFighter2.getStatus());

    Carrier carrier1 = new Carrier(500,8000);
    carrier1.addAircraft(jetFighter);
    carrier1.addAircraft(jetFighter2);
    carrier1.addAircraft(jetFighter3);
    carrier1.addAircraft(jetFighter4);
    System.out.println(carrier1.getStatus());

  }
}
