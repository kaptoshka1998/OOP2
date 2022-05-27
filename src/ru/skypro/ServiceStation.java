package ru.skypro;

public class ServiceStation {
    public static void TO(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            transport.check();
            }
    }
}
