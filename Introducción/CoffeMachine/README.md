# Lab: Coffee Machine

## Herencia en Java

Este proyecto contiene **4 clases principales** que simulan a una máquina de café, utilizando la herencia para crear varios tipos de café.

Al aprovechar la herencia, se consiguio reutilizar y mantener el código. En este proyecto, la clase `Coffee` sirvió como modelo, reduciendo la redundancia cuando se crearon las subclases para tipos de café específicos.

1. `CoffeeMachine`
    - Contiene el método main, punto de inicio del programa.
    - Bucle while para ejecutarse la máquina de Café hasta que el usuario decida salir.
2. `Coffee`
    - Representa un café genérico.
    - Variables miembro: `name`, `roast`, `price`, `caffeineLevelInMg`
    - Métodos:
        - `setCaffeineLevel`: Establece el nivel de cafeína del Café en funcion del `roast` (tueste).
        - `grindBeans`: Imprime un texto indicando que se están moliendo los granos del café.
        - `brewCoffee`: Imprime un texto simulando la preparación del Café.
        - `printInfo`: Imprime la información del café.
3. `Espresso`
    - Hereda de `Coffee`.
    - Variables miembro: `numberOfShots`
    - Constructor:
        - Llama al de `Coffee`, y a su vez inicializa `numberOfShots`.
    - Métodos:
        - `printEspressoDetails`: Imprime los detalles del Café `Espresso`.
4. `Latte`
    - Hereda de `Coffee`.
    - Variables miembro: `milkType`, `syrupFlavor`
    - Constructor:
        - Llama al de `Coffee`, y a su vez inicializa `milkType` y `syrupFlavor`.
    - Métodos:
        - `printLatteDetails`: Imprime los detalles del Café `Latte`.

```text
                        Coffee
                    +----------------------------------+
                    | - name : String                  |
                    | - roast : String                 |
                    | - price : double                 |
                    | - caffeineLevelInMg: int         |
                    +----------------------------------+
                    | + Coffee(name, roast, price)     |
                    | + setCaffeineLevel()             |
                    | + grindBeans()                   |
                    | + brewCoffee()                   |
                    | + printInfo()                    |
                |-> +----------------------------------+ <-|
                |                                          |
                | super(name, roast, price)                | super(name, roast, price)
                |                                          |
                |                                          |
            Espresso                                     Latte
+---------------|------------------+     +-----------------|-----------------+
| (hereda de Coffee)               |     | (Hereda de Coffee)                |
| - name : String                  |     | - name : String                   |
| - roast : String                 |     | - roast : String                  |
| - caffeineLevelInMg : int        |     | - caffeineLevelInMg : Int         |
| - price : double                 |     | - price : double                  |
|                                  |     |                                   |
| - numberOfShots : int = 0        |     | - milkType : String               |
+----------------------------------+     | - syrupFlavor : String            |
| + printEspressoDetails()         |     +-----------------------------------+
+----------------------------------+     | + printLatteDetails()             |
                                         +-----------------------------------+       


