package sk.itsovy.studnicka.vehicle;

public class Vehicle {

    private double kw;
    private double hp;
    private String LPN; //license plate number
    private String model;
    private String car_brand;
    private Person owner;

    public Vehicle() {
    }

    public Vehicle(String car_brand, String model) {
        this.car_brand = car_brand;
        this.model = model;
    }

    double calculateKw() { return hp*0.735499; }; //metric kilowatt HP to KW

    double calculateHp() { return kw*1.359621; } //metric horsepower (electrical hp is 1.340482) KW to HP

    void calclulate(){
        if(hp > 0 && kw == 0) {
            kw = calculateKw();
        }

        if(kw > 0 && hp == 0){
            hp = calculateHp();
        }

    }
    String getFeeForVehicle() {

        if (kw < 80  ) {
            return "Fee is 33€";
        }

        if (kw <=86 && kw >80 ) {
            return "Fee is 167€";
        }
        if (kw <=92 && kw >86 ) {
            return "Fee is 217€";
        }
        if (kw <=98 && kw >92 ) {
            return "Fee is 267€";
        }
        if (kw <=104 && kw >98 ) {
            return "Fee is 327€";
        }
        if (kw <=110 && kw >104 ) {
            return "Fee is 397€";
        }
        if (kw <=121 && kw >110 ) {
            return "Fee is 477€";
        }
        if (kw <=132 && kw >121 ) {
            return "Fee is 657€";
        }
        if (kw <=143 && kw >132 ) {
            return "Fee is 787€";
        }
        if (kw <=154 && kw> 143 ) {
            return "Fee is 957€";
        }
        if (kw <=165 && kw >154 ) {
            return "Fee is 1157€";
        }
        if (kw <=176 && kw >165 ) {
            return "Fee is 1397€";
        }
        if (kw <=202 && kw >176 ) {
            return "Fee is 1697€";
        }
        if (kw <=228 && kw >202 ) {
            return "Fee is 2047€";
        }
        if (kw <=254 && kw > 228 ) {
            return "Fee is 2467€";
        }
        if (kw >254 ) {
            return "Fee is 2997€";
        }

        return "Fee is 2997";

    }

    public double getKw() {
        return kw;
    }

    public double getHp() {
        return hp;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public void setKw(double kw) {
        this.kw = kw;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public String getLPN() {
        return LPN;
    }

    public void setLPN(String LPN) {
        this.LPN = LPN;
    }
}
