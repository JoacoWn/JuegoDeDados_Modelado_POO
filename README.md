# Juego de Dados - Modelado y Programación Orientada a Objetos

Este repositorio presenta la solución al caso "Juego de Dados", enfocado en el **modelado UML** y la **implementación de conceptos de Programación Orientada a Objetos (POO)** en Java, particularmente las relaciones entre clases y el ocultamiento de datos.

## 🎯 Objetivo de la Actividad

El objetivo principal de esta actividad fue:
* Modelar un caso de uso práctico utilizando diagramas de clases UML y la herramienta Visual Paradigm.
* Identificar y definir las clases, sus atributos, métodos y, crucialmente, las relaciones entre ellas.
* Implementar la solución en Java, aplicando los principios de POO y buenas prácticas de programación.
* Desarrollar pruebas unitarias para validar el funcionamiento del sistema.

## 🎲 Descripción del Caso "Juego de Dados"

El problema consiste en simular un juego de dados simple con las siguientes consideraciones:

* **Dados:** Se modela un dado con la característica de su "cara superior" (valor entre 1 y 6). Debe ser capaz de simular un lanzamiento aleatorio.
* **Juego:** Se utilizan dos dados. Al lanzarlos, se suman los valores de sus caras superiores. Si la suma es **7**, el jugador **gana**. Cualquier otra suma, el jugador **pierde**.
* **Calculadora:** Los dados no tienen la responsabilidad de sumar. Para ello, se introduce una clase `Calculadora` que se encarga de retornar la suma de dos números enteros.
* **Pruebas:** Se requiere una prueba unitaria para validar la lógica del juego.

##  UML y Modelo de Clases

Para el modelado de la solución, se identificaron las siguientes clases y relaciones:

* **`Dado`**: Representa un dado individual.
    * Atributos: `valorCaraSuperior` (int).
    * Métodos: `lanzar()` (simula el lanzamiento, retorna el valor), `getValorCaraSuperior()`.
* **`CalculadoraDados`**: Encargada de realizar operaciones aritméticas simples.
    * Métodos: `sumar(int a, int b)`.
* **`JuegoDados`**: Orquesta el juego, lanzando los dados y determinando el resultado.
    * Atributos: `dado1`, `dado2` (objetos de tipo `Dado`), `calculadora` (objeto de tipo `Calculadora`).
    * Métodos: `jugar()` (ejecuta la lógica del juego, devuelve el resultado).

### Relaciones entre Clases:

* **Asociación/Agregación**: `JuegoDeDados` **contiene** dos instancias de `Dado` (Agregación: un juego puede existir sin los dados y los dados pueden existir sin el juego).
* **Asociación**: `JuegoDeDados` **usa** una instancia de `Calculadora` (Asociación simple: el juego interactúa con la calculadora para obtener la suma).

---

[Incluir aquí una **imagen del Diagrama de Clases UML** (.png o .jpeg)]
*(Ejemplo: `![Diagrama de Clases](docs/diagrama_clases.png)`)*

---

## 🚀 Inicio Rápido (Compilación y Ejecución)

Para poner en marcha este proyecto en tu entorno local:

1.  **Clonar el Repositorio:**
    ```bash
    git clone [https://github.com/JoacoWn/JuegoDeDados_Modelado_POO.git](https://github.com/JoacoWn/JuegoDeDados_Modelado_POO.git)
    cd JuegoDeDados_Modelado_POO
    ```
2.  **Abrir en IDE y Compilar:**
    Importa el proyecto en tu IDE (IntelliJ IDEA recomendado). El IDE se encargará de la compilación.
3.  **Ejecutar el Juego:**
    Ejecuta la clase `JuegoDeDados` o una clase `Main` si la creaste, para ver el resultado de un lanzamiento.
4.  **Ejecutar Pruebas Unitarias:**
    Ejecuta la(s) clase(s) de prueba unitaria (ej. `JuegoDeDadosTest`) desde tu IDE para validar la lógica.

## 📂 Contenido del Repositorio

* **`src/`**: Contiene el código fuente de las clases Java (`Dado.java`, `CalculadoraDados.java`, `JuegoDados.java`, `JuegoDadosTest.java`).
* **`docs/`**: Carpeta para la documentación
* **`README.md`**: Este archivo.

---

## 🛠 Tecnologías Utilizadas

* **Lenguaje:** Java
* **Modelado UML:** Visual Paradigm
* **IDE:** IntelliJ IDEA
* **Control de Versiones:** Git / GitHub
* **Pruebas Unitarias:** JUnit

## 🤝 Contribuciones

Para contribuir al desarrollo de este proyecto, por favor, sigue las siguientes pautas:
1.  Haz un `fork` del repositorio.
2.  Crea una nueva rama para tu característica 
3.  Realiza tus cambios y haz `commit` 
4.  Sube tus cambios a tu `fork` 
5.  Abre un `Pull Request` a la rama `develop` de este repositorio.

---
**Desarrollado por:**

* Cristobal Ramos
* Jonathan Chavez
* Esteban Aguilera
* Joaquín Arriagada

**Universidad de La Frontera**
**Departamento de Computación e Informática**
