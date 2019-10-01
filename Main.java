package sk.itsovy.studnicka.vehicle;

import sk.itsovy.studnicka.other.FreeClass;

public class Main {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person();
        Person person2 = new Person();

        Mobile mobile1 = new Mobile("Huawei","Honor 9","0918116112");
        Mobile mobile2 = new Mobile("Xiomy","MI9","0947774634");

        Vehicle car1 = new Vehicle("Skoda","Fabia");
        Vehicle car2 = new Vehicle("Honda","Civic");

        Calculator calculator = new Calculator("Casio");

        FreeClass freeClass1 = new FreeClass();

        //---------------------------------------------------------------
        person1.setMobile(mobile1);
        person1.setAge(33);
        person1.setName("Vladimir");
        person1.setGander(true);
        person1.setCalculator(calculator);

        person2.setAge(67);
        person2.setCalculator(calculator);
        person2.setName("Martina");
        person2.setGander(false);


        System.out.println(person1);

        car1.setOwner(person1);
        car1.setKw(78);
        car1.calclulate();

        car2.setOwner(person2);
        car2.setHp(78);
        car2.calclulate();


//        System.out.println("Hp to Kw : " + car1.calculateKw());
//        System.out.println("Kw to Hp: " + car1.calculateHp());
        System.out.println("Birth Year: " + person1.getBirthYear());
        System.out.println("Fee for vehicle: " +car1.getFeeForVehicle());
        System.out.println("KW for vehicle: " +car1.getKw());
        System.out.println("HP for vehicle: " +car1.getHp());
        System.out.println("Name: " + person1.getName());
        System.out.println("Gander: " + person1.getMaleGander());

        System.out.println("Birth Year: " + person2.getBirthYear());
        System.out.println("Fee for vehicle: " +car2.getFeeForVehicle());
        System.out.println("KW for vehicle: " +car2.getKw());
        System.out.println("HP for vehicle: " +car2.getHp());
        System.out.println("Name: " + car2.getOwner().getName());
        System.out.println("Gander: " + person2.getFemaleGander());

        System.out.println();
        if (person1.hasMobile())
            System.out.println("Phone number: " +person1.getMobile().getPhoneNumber());
        else
            System.out.println("Person has no mobile.");
        person1.print();
        if (person1.hasCalculator()) {
            calculator.turnOn();
            System.out.println(person1.getCalculator().add(2,5));
            calculator.turnOn();
            System.out.println(person1.getCalculator().convertCmtoInch(15));
            System.out.println(person1.getCalculator().calculateCircleArea(5));
            System.out.println("------------------------------");
            System.out.println(person1.getCalculator().calculateRectangleArea(2, 7));
            System.out.println(person1.getCalculator().calculateRectangleRadiusOfCircle(2,3,7));
            System.out.println(person1.getCalculator().calculateConeVolume(3,7));

        }

        freeClass1.sayHello();
        freeClass1.sayNHello(7);

        System.out.println("free class get round number: " + freeClass1.getEvenNumber(13.3));
        System.out.println("calculator get round number: " + person1.getCalculator().calculateGetRoundNumber(11.3));

        System.out.println(person1.getCalculator().getArithmeticallyAverage(2,13,23));
        System.out.println(person1.getCalculator().calculateRectangularSurface(3,13,31));
        System.out.println(person1.getCalculator().calculateCircleVolume(5));
        System.out.println(person1.getCalculator().calcMonthInterestRate(5,8,1000));
        System.out.println("Quad surface: " + person1.getCalculator().calcQuadSurface(45,87,37));
        System.out.println("Quad volume: " + person1.getCalculator().calcQuadVolume(45,87,37));
        freeClass1.test();


    }
}
