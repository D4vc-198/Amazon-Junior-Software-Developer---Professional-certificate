# Calculadora de IMC (BMI - Body Mass Index)


Es la práctica de organizar los métodos dentro de una clase según su función o responsabilidad. En este proyecto, la clase `BMICalculator` tiene 3 métodos agrupados bajo la misma temática: calcular el Índice de Masa Corporal (BMI - Body Mass Index) y mostrar la categoría segun el peso.

Este proyecto contiene 3 clases principales:
1. `Main`
    - Método `main`: Es el punto de entrada el programa.
    - Aqui se crean los objetos y se llaman los métodos de la calculadora IMC.
2. `BMICalculator`
    - Método `calculateBmiImperial`: Calcula el Índice de Masa Corporal (BMI). en el sistema imperial
    - Método `calculateBmiMetric`: Calcula el Índice de Masa Corporal (BMI). en el sistema métrico.
    - Método `getBMICategory`: Retorna la categoria del peso en el que se encuentra.
3. `UserInput`
    - Método `obtainBMISystem`: Obtiene el sistema métrico ingresado por el usuario
    - Método `obtainWeight`: Obtiene el peso dependiendo del sistema métrico ingresado
    - Método `obtainHeight`: Obtiene la altura dependiendo del sistema métrico ingresado

