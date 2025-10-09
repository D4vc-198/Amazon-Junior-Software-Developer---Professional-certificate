# Ejercicio de Interfaces y Clases Abstractas en Java

## Descripción
Este ejercicio se centra en la implementación de interfaces y clases abstractas en Java, utilizando un escenario práctico de una aplicación de mensajería para una startup de redes sociales. A través de este ejercicio, se exploran conceptos clave de la programación orientada a objetos, como la reutilización de código y la definición de contratos mediante interfaces.

## Contenido
- **Clases Abstractas**: Se define una clase abstracta `AbstractButtonClass` que contiene métodos concretos para establecer y obtener el título de los botones.
- **Interfaces**: Se crea una interfaz `ButtonPress` que declara un método abstracto `buttonPress()`, que debe ser implementado por las clases que representan diferentes botones.
- **Clases de Botones**: Se implementan clases concretas como `SendButtonClass` y `ForwardButtonClass`, que extienden la clase abstracta y implementan la interfaz.

## Estructura del Código
El código se organiza de la siguiente manera:

1. **Clase Abstracta**: `AbstractButtonClass`
   - Propiedad: `caption`
   - Métodos: `setCaption()`, `getCaption()`

2. **Interfaz**: `ButtonPress`
   - Método abstracto: `buttonPress()`

3. **Clases Concretas**:
   - `SendButtonClass`: Implementa `ButtonPress` y define métodos adicionales para enviar mensajes.
   - `ForwardButtonClass`: Implementa `ButtonPress` y define métodos para reenviar mensajes.

## Ejemplo de Uso
El siguiente código muestra cómo se puede utilizar la clase `SendButtonClass`:

```java
public class Main {
    public static void main(String[] args) {
        SendButtonClass sendButton = new SendButtonClass();
        sendButton.setCaption("Send");
        sendButton.setSendTo("a@b.com");
        sendButton.setMessage("Hello World");
        sendButton.buttonPress();
    }
}