package sk.itsovy.studnicka.vehicle;

public class Person {

    private String name;
    private int age;
    private boolean gander; //T...male;F...Female
    private double hight;
    private int weight;
    private char status;
    private Mobile mobile;
    private Vehicle vehicle;
    private Calculator calculator;

    public Person() {
    }

    public Person(String name, int age, boolean gander, double hight, int weight, char status) {
        this.name = name;
        this.age = age;
        this.gander = gander;
        this.hight = hight;
        this.weight = weight;
        this.status = status;
    }

    public boolean hasMobile() {
        if(mobile==null)
            return false;
        else
            return true;
    }

    public boolean hasVehicle() {
        if(vehicle==null)
            return false;
        else
            return true;
    }

    public boolean hasCalculator() {
        if(calculator==null)
            return false;
        else
            return true;
    }

    public double calculateBmi() {
        double bmi;
        bmi = weight/(hight*hight);
        return bmi;
    }

    public String getBmiStatus() {
        if (calculateBmi()<20)
            return "underweight";
        if (calculateBmi()<25)
            return "optimal weight";
        if (calculateBmi()<30)
            return "over weight";
        else
            return "obesity";
    }

    public void print() {
        System.out.println("---------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hight/Weight" + hight+"/"+weight);
        System.out.println("Bmi: " + calculateBmi()+" ("+getBmiStatus()+")");
        if (gander) //gender==true pri porovnavani cez if
            System.out.println("Gender: male");
        else
            System.out.println("Gender: female");
        System.out.println("Status : " +status);
        if (hasMobile())
            System.out.println("Mobile: " + mobile.getBrand()+" "+mobile.getModel());
        if (hasVehicle())
            System.out.println("Car: " +vehicle.getCar_brand()+" "+vehicle.getModel()+" "+vehicle.getLPN()+" "+vehicle.calculateHp()+" Hp" );
        if (hasCalculator())
            System.out.println("Calculator: "+calculator.getName());

    }

    public String getName() {
        return name;
    }

    public String getMaleGander() {
        if (true) ;
        return "Male";
    }

    public String getFemaleGander() {
        if (false) ;
        return "Female";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGander() {
        return gander;
    }

    public void setGander(boolean gander) {
        this.gander = gander;
    }
    int getBirthYear() {
        int actual_year = 2019;
        int birth_year = actual_year - age;
        return birth_year;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}
