# Clases y Objetos en Java

Este proyecto contiene 2 clases principales:
1. `Main`
    - Contiene el método main, que es el punto de inicio del programa.
    - Aqui se crean objetos de la clase `Car` y se guardan en una colección.
2. `Car`
    - Representa el molde o plantilla para crear carros.
    - Contiene atributos (propiedades) y un método `getCarDetails()` para mostrar sus detalles.
## Clase
Una `clase` es una plantilla que define cómo serán los objetos.
```Java
public class Car {
    String make;
    String model;
    String color;
    int year;

    public String getCarDetails() {
        return "Make: " + make + "\nModel:" + model + "\nColor:" + color + "\nYear: " + year;
    }
}
```

## Objeto
Un `Objeto` es una instancia de la clase: un carro real creado a partir de una plantilla.
```Java
Car my firstCar = new Car();
myFirstCar.make = "Toyota";
myFirstCar.model = "Corolla";
myFirstCar.color = "Blue";
myFirstCar.make = "2020";
```

## Colección de Objetos
Una `Colección de Objetos` es un conjunto de elementos que comparten una o más características en común. En este caso, en lugar de tener un solo carro, puedes tener muchos. Para eso, se una un `arreglo de objetos`:
```Java
Car[] cars = new Car[5];
```


