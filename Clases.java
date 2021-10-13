package org.itstep;

public class Clases {

    public static void main(String[] args) throws IncorrectNominalException {
        Pen penRed = new Pen(Colors.RED);
        System.out.println(penRed.getColor());

        Car car = new Car(Colors.GREEN);
        System.out.println("Car's color is " + car.getColor());
        car.setColor(Colors.RED);
        System.out.println("Car's color is " + car.getColor());

        CoinBY coin = new CoinBY(5);
        System.out.printf("Nominal: %d, weight: %f%n", coin.getNominal(), coin.getWeight());

        Mixer mixer = new Mixer(18, 60);
        mixer.regulate(70, 30);
        System.out.println("Temp:" + mixer.calcTemp());

        Switch swich = new Switch();
        swich.setState(true);
        System.out.println(swich.isState());

        Account account = new Account();
        account.addMoney(100);
        System.out.println("Сумма: " + account.getAmount());
        System.out.println("Сумма: " + account.getAmount());

        Book book = new Book("name", "author", 100, Genres.Fantasy);
        System.out.println(book.getName());

        Compass compass = new Compass();
        compass.setAzimuth(0);
        System.out.println(compass.getDirect());


    }
}











