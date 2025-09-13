# Ejercicio: Online Shopping Cart

## Herencia y polimorfismo

Este proyecto implementa un carrito de compras en línea mediante Programación Orientada a Objetos.

- Se definen 5 clases principales que representan el flujo de una tienda en linea.
La clase **Product** funciona como clase base (superclase), de la cual heredan otros tipos de productos.
- A partir de **Product** se crearon subclases como **Clothing** y **Electronics**, que añaden atributos y comportamientos propios.

## Uso de la herencia
La herencia permite que **Clothing** y **Electronics** reutilicen los atributos y métodos comunes definidos en **Product** (por ejemplo, nombre y precio), y al mismo tiempo puedan extender sus características con información adicional (como Talla en **Clothing** o periodo de garantía en **Electronics**).

## Uso del polimorfismo

El polimorfismo se aplica principalmente en la sobreescritura de métodos.
- La clase **Product** define el método **displayInfo()**.
- Cada subclase (**Clothing** y **Electronics**) sobreescribe este método para mostrar información especifica según el tipo de producto.
- Cuándo el carrito (**ShoppingCart**) recibe un objeto de tipo **Product** y llama a **displayInfo()**, en tiempo de ejecución se ejecuta automáticamente la versión correspondiente al tipo real del objeto, sin necesidad de condicionales adicionales.

De esta forma, el código es más flexible, reutilizable y fácil de mantener, ya que el carrito puede trabajar con cualquier producto que herede de **Product**, sin importar cuántos tipos de productos se creen en el futuro.
