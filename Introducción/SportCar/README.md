# SportCar

## Herencia y la superClase en Java

Este proyecto contiene **4 clases principales** que muestran cómo funciona la herencia en Java:

1. `Main`
    - Contiene el método main, punto de inicio del programa.
    - Crea un objeto de la clase `SportCar`
    ```Java
        SportCar gt = new SportCar("Mustang", "Ford Mustang GT", "Black");
    ```
    - LLama métodos heredados y propios.
        - `accelerate()` - heredado de `Vehicle`.
        - `activateTurboBoost()` - propio de `SportCar`.
        
2. `Vehicle`
    - Representa un Vehiculo genérico.
    - Variables miembro: `make`, `model`, `color`, `speed`.
    - Constructor parametrizado: inicializa `make`, `model`, `color` y establece `speed = 0`.
    - Métodos:
        - `accelerate`: Incrementa la velocidad en +5.
        - `brake`: Imprime que el vehículo está frenando.
        - `getSpeed`: Retorna la velocidad actual.
3. `Car`
    - Hereda de `Vehicle`.
    - Constructor: Llama al de `Vehicle` e inicializa `seatPosition = 0`.
    - Método:
        - `adjustSeat`: Ajusta la posición del asiento hacia adelante, atrás o sin cambios.
4. `SportCar`
    - Hereda de `Car`, y `Car` a su vez hereda de `Vehicle`.
    - Constructor: Llama al de `Car` e inicializa `turboBoost = 0`.
    - Método:
        - `activateTurboBoost`:
            - LLama a `accelerate()` de `Vehicle`.
            - Incrementa `turboBoost` en +50 (acumulativo).
            - Suma el valor de `turboBoost` a la velocidad (`speed`).

## Diagrama de Clases (ASCII)

```text
                        Vehicle
     +-----------------------------------+
     | - make : String                   |
     | - model : String                  |
     | - color : String                  |
     | - speed : int = 0                 |
     +-----------------------------------+
     | + Vehicle(make, model, color)     |
     | + accelerate()                    |
     | + brake()                         |
     | + getSpeed() : int                |
     +-----------------------------------+
                     ^
                     |
                     | super(make, model, color)
                     |
                     |
                        Car
     +-----------------------------------+
     | (hereda de Vehicle)               |
     | - make : String                   |
     | - model : String                  |
     | - color : String                  |
     | - speed : int                     |
     |                                   |
     | - seatPosition : int = 0          |
     +-----------------------------------+
     | + Car(make, model, color)         |
     |   → llama a Vehicle(...)          |
     | + adjustSeat(adjustment : int)    |
     +-----------------------------------+
                     ^
                     |
                     | super(make, model, color)
                     |
                     |
                     SportCar
     +-----------------------------------+
     | (hereda de Car y Vehicle)         |
     | - make : String                   |
     | - model : String                  |
     | - color : String                  |
     | - speed : int                     |
     | - seatPosition : int              |
     |                                   |
     | - turboBoost : int = 0            |
     +-----------------------------------+
     | + SportCar(make, model, color)    |
     |   → llama a Car(...)              |
     |   → Car llama a Vehicle(...)      |
     | + activateTurboBoost()            |
     +-----------------------------------+



