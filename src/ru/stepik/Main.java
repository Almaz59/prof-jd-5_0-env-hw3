package ru.stepik;

public class Main {
    public static void main(String[] args) {
        Vehicles car1 = new Vehicles("car 1", 4);
        Vehicles car2 = new Vehicles("car 2", 4);
        Vehicles bicycle1 = new Vehicles("bicycle 1", 2);
        Vehicles bicycle2 = new Vehicles("bicycle 2", 2);
        Vehicles truck1 = new Vehicles("truck 1", 6);
        Vehicles truck2 = new Vehicles("truck 2", 8);

        ServiceStation station = new ServiceStation();
        station.check(car1, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle1, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck1);
        station.check(null, null, truck2);

    }
}

