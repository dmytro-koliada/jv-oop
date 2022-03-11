package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {

        Machine bulldozer = new Bulldozer();
        Machine truck = new Truck();
        Machine excavation = new Excavator();

        bulldozer.doWork();
        truck.doWork();
        excavation.doWork();

        bulldozer.stopWork();
        truck.stopWork();
        excavation.stopWork();
    }
}

