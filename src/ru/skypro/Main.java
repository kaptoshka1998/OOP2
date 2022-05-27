package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Transport[] transports = new Transport[] {
        new Bicycle("bicycle1", 2),
        new Bicycle("bicycle2", 2),
        new Car("car1", 4),
        new Car("car2", 4),
        new Truck("truck1", 6),
        new Truck("truck2", 8),
        };

        ServiceStation.TO(transports[1]);
        ServiceStation.TO(transports[3]);
        ServiceStation.TO(transports[5]);
    }

}
