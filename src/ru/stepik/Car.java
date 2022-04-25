package ru.stepik;

public class Car extends Vehicles implements ServiceStationInterfase {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(Vehicles car, Vehicles bicycle, Vehicles truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();

        }
    }
}
