/**
 * La clase { Car } representa a un carro con atributos básicos
 * como: Marca (make), Modelo (model), Color (color) y año (year) 
 * 
 * Método principal
 * getCarDetails() - Retorna un string con los detalles del coche.
 */
public class Car {
    String make;
    String model;
    String color;
    int year;
    
    public String getCarDetails() {
        return "Make: " + make + "\nModel: " + model + "\nColor: " + color + "\nYear: " + year;
    }
}