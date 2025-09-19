# Lab: Coffee Machine

## Herencia en Java
## Actualización: Diseño lógico y polimorfismo.

Este proyecto contiene **5 clases principales** que simulan a una máquina de café, utilizando la herencia para crear varios tipos de café.

Al aprovechar la herencia, se consiguio reutilizar y mantener el código. En este proyecto, la clase `Coffee` sirvió como modelo, reduciendo la redundancia cuando se crearon las subclases para tipos de café específicos.

También se creo una clase de utilidad `CoffeeMaker` para separar responsabilidades y asi tener un código más reutilizable y flexible.

1. `CoffeeMachine`
    - Contiene el método main, punto de inicio del programa.
    - Ejecuta un bucle interactivo que mantiene la máquina de café funcionando hasta que el usuario decida salir.
2. `Coffee`
    - Representa un café genérico.
    - Variables miembro: `name`, `roast`, `price`, `caffeineLevelInMg`
    - Métodos:
        - `setCaffeineLevel()`: Establece el nivel de cafeína del Café en funcion del `roast` (tueste).
        - `grindBeans()`: Imprime un texto indicando que se están moliendo los granos del café.
        - `brewCoffee()`: Imprime un texto simulando la preparación del Café.
        - `printInfo()`: Imprime la información del café.
3. `Espresso`
    - Hereda de `Coffee`.
    - Variables miembro: `numberOfShots`
    - Constructor:
        - Llama al de `Coffee`, y a su vez inicializa `numberOfShots`.
    - Métodos sobreescritos:
        - `grindBeans()`: personaliza la molienda del café para un espresso (molienda fina).
        - `brewCoffee()`: implementa la preparación del espresso a alta presión.
        - `printInfo()`: imprime los detalles específicos del espresso, incluyendo el cálculo del costo total según el número de porciones.
    - Método adicional:
        - `printEspressoDetails()`: muestra información detallada del espresso.
4. `Latte`
    - Hereda de `Coffee`.
    - Variables miembro: `milkType`, `syrupFlavor`
    - Constructor:
        - Llama al de `Coffee`, y a su vez inicializa `milkType` y `syrupFlavor`.
    - Métodos sobreescritos:
        - `grindBeans()`: personaliza la molienda para un latte (molienda media).
        - `brewCoffee()`: implementa la preparación del latte, incorporando el sirope, la leche al vapor y una capa de espuma.
        - `printInfo()`: imprime los detalles específicos del latte, incluyendo tipo de leche, sirope y precio final.
        - `printLatteDetails`: muestra información detallada del latte.

5. `CoffeeMaker`
    - Clase de utilizad que contiene la lógica común para la preparación de café.
    - Métodos:
        - `prepareCoffee()`: Recibe un objeto Coffee y llama a los metodos `grindBeans()` y `brewCoffee()` del objeto Coffee.

## Paradigmas aplicados:
- Programación Orientada a Objetos
- Herencia 
- Polimorfismo
- Separación de responsabilidades.