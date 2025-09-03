# LibrarySimulator

## Clases y Objetos en Java

Este proyecto contiene 2 clases principales:
1. `Main`
    - Contiene el método main, que es el punto de inicio del programa.
    - Aqui se crean objetos de la clase `Book` y se guardan en una colección.
2. `Book`
    - Representa el molde o plantilla para crear un libro.
    - Contiene atributos (propiedades) y un método `getBookDetails()` para mostrar sus detalles.

## Clase
Una `clase` es una plantilla que define cómo serán los objetos.
```Java
public class Book {
    String title;
    String author;
    String category;
    int publishYear;

    public String getBookDetails() {
        return "Title: " + title + "\nAuthor: " + author + "\nCategory: " + category + "\nPublis Year: " + publishYear;
    }

}

```

## Objeto
Un `Objeto` es una instancia de la clase: Un libro de una biblioteca creado a partir de una plantilla.
```Java
Book book1 = new Book();
book1.title = "Cien años de soledad";
book1.author = "Gabriela Garcia Marquez";
book1.category = "Novela";
book1.publishYear = 1967;
```

## Colección de Objetos
Una `Colección de Objetos` es un conjunto de elementos que comparten una o más características en común. En este caso, en lugar de tener un solo carro, puedes tener muchos. Para eso, se una un `arreglo de objetos`:
```Java
Book[] listBooks = new Book[5];
```


