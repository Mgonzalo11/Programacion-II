# 🔢 Aproximación Recursiva de Pi con el Método de Montecarlo  

Este proyecto implementa una **aproximación del número Pi** utilizando el **método de Montecarlo** con **recursividad** en Java.  
El método de Montecarlo es una técnica probabilística que emplea números aleatorios para estimar valores numéricos con un alto grado de precisión.  

--- 

## ⚙ Requisitos  

Antes de ejecutar este proyecto, asegúrate de tener instalado lo siguiente:  

- **Java Development Kit (JDK) 8 o superior**  
- **Make** (opcional, pero recomendado para simplificar la compilación y ejecución)  

---

## 📝 Estructura del Proyecto  

El código se organiza en los siguientes archivos:  

- 📂 **`Principal.java`** → Contiene el método `main` que ejecuta la simulación y muestra el resultado en consola.  
- 📂 **`Matematicas.java`** → Implementa el cálculo de Pi mediante una función recursiva que genera puntos y cuenta los que caen dentro del círculo.  

---

## 🚀 Compilación y Ejecución 

Para compilar y ejecutar el programa, puedes utilizar los siguientes comandos en la terminal:  

```sh
javac -d bin mates/Matematicas.java aplicacion/Principal.java  
java -cp bin aplicacion.Principal  




## 🛠️ Requisitos

Para compilar y ejecutar este proyecto, necesitas:

- **Java Development Kit (JDK) 8 o superior**.
- **Make**.

---
## 🧩 Descripción del Código

El proyecto consta de dos archivos principales:

- **`Principal.java`**: Contiene el método `main` que inicia la simulación de Montecarlo. Recibe como argumento el número de puntos aleatorios a generar y muestra la aproximación de Pi.
- **`Matematicas.java`**: Implementa la lógica para generar puntos aleatorios y calcular la aproximación de Pi utilizando el método de Montecarlo.

---

## 📄 Licencia

Este proyecto está bajo la licencia **Apache 2.0**. Para más detalles, consulta el archivo [LICENSE](LICENSE).

---

## 👨‍💻 Autor

- **Miguel** - [https://github.com/Mgonzalo11]