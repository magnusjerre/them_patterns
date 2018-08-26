package jerre.creational.singleton;

public class Main {
    public static void main(String... args) {
        //Følgende fungerer altså ikke
//        AppLogger logger = new AppLogger();

        AppLogger logger = AppLogger.getInstance();
        logger.log("Jeg er en singleton logger");
    }
}
