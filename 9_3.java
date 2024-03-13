public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        double celsiusTemperature = 25;
        double fahrenheitTemperature = celsiusToFahrenheit(celsiusTemperature);
        System.out.println("Temperature in Fahrenheit: " + fahrenheitTemperature);
    }
}

class Hindex {
    String professor;
    int hindex;

    public Hindex(String professor, int hindex) {
        this.professor = professor;
        this.hindex = hindex;
    }

    public static void main(String[] args) {
        Hindex professor1 = new Hindex("Zhukabayeva", 5);
        System.out.println("Professor: " + professor1.professor);
        System.out.println("H-Index: " + professor1.hindex);
    }
}

class Movie {
    String title;
    String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public static void main(String[] args) {
        Movie inception = new Movie("Inception", "Sci-Fi");
        System.out.println("Title: " + inception.title);
        System.out.println("Genre: " + inception.genre);
    }
}

class Recipe {
    String name;
    String ingredients;

    public Recipe(String name, String ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public static void main(String[] args) {
        Recipe pastaCarbonara = new Recipe("Pasta Carbonara", "spaghetti, eggs, bacon, Parmesan");
        System.out.println("Recipe: " + pastaCarbonara.name);
        System.out.println("Ingredients: " + pastaCarbonara.ingredients);
    }
}

class Car {
    String make;
    String model;
    int year;
    String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020, "Blue");
        Car car2 = new Car("Honda", "Civic", 2018, "Red");
        Car car3 = new Car("Ford", "Focus", 2019, "Black");

        System.out.println("Car 1: " + car1.make + " " + car1.model + ", Year: " + car1.year + ", Color: " + car1.color);
        System.out.println("Car 2: " + car2.make + " " + car2.model + ", Year: " + car2.year + ", Color: " + car2.color);
        System.out.println("Car 3: " + car3.make + " " + car3.model + ", Year: " + car3.year + ", Color: " + car3.color);
    }
}

class Fruit {
    String name;
    double weight;
    double pricePerKg;

    public Fruit(String name, double weight, double pricePerKg) {
        this.name = name;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 0.5, 2.99);
        System.out.println("Name: " + apple.name);
        System.out.println("Weight: " + apple.weight + " kg");
        System.out.println("Price per kg: $" + apple.pricePerKg);
    }
}

class Triangle {
    public Triangle() {
        int side1 = 3, side2 = 4, side3 = 5;
        double perimeter = side1 + side2 + side3;
        double semiPerimeter = perimeter / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        new Triangle();
    }
}
