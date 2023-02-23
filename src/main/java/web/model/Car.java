package web.model;

public class Car {
    private String nameCar;
    private String model;
    private int yearOfModelCar;
    public Car(String nameCar, String model, int yearOfModelCar) {
        this.nameCar = nameCar;
        this.model = model;
        this.yearOfModelCar = yearOfModelCar;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfModelCar() {
        return yearOfModelCar;
    }

    public void setYearOfModelCar(int yearOfModelCar) {
        this.yearOfModelCar = yearOfModelCar;
    }


    @Override
    public String toString() {
        return "Car{" +
                "nameCar='" + nameCar + '\'' +
                ", model='" + model + '\'' +
                ", yearOfModelCar=" + yearOfModelCar +
                '}';
    }
}
