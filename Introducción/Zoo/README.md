# Proyecto final - Creación de un ZOO

Este proyecto tiene como objetivo aplicar los conceptos aprendidos en el curso *Introducción al Desarrollo de Software* mediante la creación de un programa que simula un zoológico.

## Objetivos del Proyecto:
- Implementar una jerarquía de clases que incluya una clase base `Animal` y subclases como `Tiger`, `Dolphin` y `Penguin`.
- Utilizar interfaces para definir comportamientos específicos, como `Eat`, `Walk` y `Swim`.
- Crear un sistema de menú interactivo que permita a los usuarios seleccionar y visualizar las características y comportamientos de los animales.

## Componentes Clave:
- **Clase** `Animal`: Clase base que define propiedades comunes y métodos abstractos que deben ser implementados por las subclases.
- **Subclases**:
    - `Tiger`: Hereda de `Animal` e implementa el comportamiento de comer y caminar.
    - `Dolphin`: Hereda de `Animal` e implementa el comportamiento de comer y nadar.
    - `Penguin`: Hereda de `Animal` e implementa tanto la interfaz `Walk` como `Swim`, mostrando su capacidad para caminar y nadar.
- **Interfaces**:
    - `Eat`: Define métodos relacionados con la alimentación de los animales.
    - `Walk` y `Swim`: Definen los métodos específicos para el movimiento de los animales.