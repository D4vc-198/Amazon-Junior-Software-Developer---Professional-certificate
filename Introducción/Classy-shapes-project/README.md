# Laboratorio: Clases, Objetos y Métodos en Java

Este proyecto se centra en la  construcción de formas geométricas y el cálculo de sus áreas utilizando los conceptos básicos de Programación Orientada a Objetos (POO) en Java.

### Clases del proyecto:
* `Main`
    * Contiene el método main, que es el punto de inicio del programa. Aquí se crean los objetos y se llaman los métodos de cálculo.

* `Circle`:
    * Representa el molde o plantilla de un Circulo.
    * Atributo: `radius` (radio del círculo).
    * Constructores:
        * Sin parámetros: `Circle()`
        * Con parámetros: `Circle(double radius)`

* `Rectangle`:
    * Representa el molde o plantilla de un Rectángulo.
    * Atributos: `length` (longitud), `width` (ancho)
    * Constructores:
        * Sin Rectangle: `Rectangle()`
        * Con parámetros: `Rectangle(double length, double width)`

* `ShapeMetricCalculator`:
    * Clase de utilidad para agrupar toda la lógica de calculo relacionado con las métricas de una forma (área o perímetro de una forma).
    * Métodos:
        * `calculateRectangleArea`: Calcula y retorna el área de un rectángulo.
        * `calculateCircleArea`: Calcula y retorna el área de un Circulo.

### Notas
- Cada clase tiene su propia responsabilidad.
- Los métodos en `ShapeMetricCalculator` son estáticos, lo que permite llamarlos sin necesidad de crear un objeto de esa clase.