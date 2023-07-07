package hm.edu.software.architecture.design.patterns.constructionbuilder;

public class Car {

    private final String color;
    private final String brand;
    private final int horsePower;

    public Car(CarBuilder carBuilder) {
        this.color = carBuilder.getColor();
        this.horsePower = carBuilder.getHorsePower();
        this.brand = carBuilder.getBrand();
    }

    public static class CarBuilder {

        private String color;
        private String brand;
        private int horsePower;

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setHorsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public String getColor() {
            return color;
        }

        public String getBrand() {
            return brand;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}