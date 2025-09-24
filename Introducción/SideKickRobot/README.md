
# Ejercicio: Robot sidekick

## Encapsulación y ocultación de datos

El objetivo de este proyecto, es proteger las propiedades y los métodos de la clase `SideKick` mediante la encapsulación, esto garantizará operaciones y valores seguros y validados.

- Se definen 2 clases principales
    - `Main`: Es el punto de partida de nuestro programa.
    - `SideKick`: Representa a un robot
        - Propiedades
            - `modeOfOperation`: Modo de operación
            - `batteryCharge`: Porcentaje de carga
        - getter
            - `getModeOfOperation`: retorna el modo de operación
            - `getBatteryCharge`: retorna el valor de batteryCharge
        - setter
            - `setModeOfOperation`: Establece el valor de `modeOfOperation`
            - `setBatteryCharge`: Establece el valor de `batteryCharge`

## Uso de la encapsulación
Se definen los métodos `getter` y `setter` para proporcionar acceso controlado a las propiedades privadas

## Uso de la ocultación de datos
Se hace uso del especificador de acceso privado `private`, esto con el fin de proteger los datos y métodos, permitiendo ocultar o mostrar propiedades y métodos específicos según sea necesario.
