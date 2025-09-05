# Calculadora de IMC (BMI - Body Mass Index)

## Agrupación de métodos en Java

Es la práctica de organizar los métodos dentro de una clase según su función o responsabilidad. En este proyecto, la clase `BMICalculator` tiene dos métodos agrupados bajo la misma temática: calcular el Índice de Masa Corporal (BMI - Body Mass Index).

Este proyecto contiene 2 clases principales:
1. `Main`
    - Método `main`: Es el punto de entrada el programa.
    - Aqui se crean los objetos y se llaman los métodos de la calculadora IMC.
2. `BMICalculator`
    - Método `calculateBmiImperial`: Calcula el Índice de Masa Corporal (BMI). en el sistema imperial
    - Método `calculateBmiMetric`: Calcula el Índice de Masa Corporal (BMI). en el sistema métrico.
    - Método `getBMICategory`: Retorna la categoria del peso en el que se encuentra.

Ambos métodos están agrupados porque hacen lo mismo (calcular BMI) pero con diferentes sistemas de medida.