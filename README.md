# <img width="60" height="60" alt="image" src="https://github.com/user-attachments/assets/bce9f021-e7c5-40c4-8077-3a525c7c0c81" />        Algoritmos de Ordenamiento en java

Este proyecto es la continuación de **"comparación de algoritmos de ordenamiento"** escrito originalmente en python. Su objetivo principal es evaluar el desempeño de distintos algoritmos de ordenamiento aplicados a listas con diferentes características.

Lo que comenzó como un simple repaso de algoritmos clásicos terminó derivando en variantes propias, como *catSort* (inspirado en el counting sort pero con varias modificaciones) y *pivotear* (similar al quicksort, con un cambio de estrategia en la elección del pivote y la partición). También desarrollé un sistema personalizado para testear el rendimiento de los algoritmos.

Ahora, el trabajo continúa en Java. Por el momento, el proyecto está en sus primeras etapas.

## 📂 Estructura del Proyecto
ordenamientos_java/
├── Bubble.java
├── Bubble.class
├── Selection.java
├── Selection.class
├── CatSort_flat.java
├── CatSort_flat.class
└── README.md


## ⚙️ Algoritmos Incluidos

- `Bubble` (burbuja)
- `Selection` (selección)
- `CatSort_flat` (ordenamiento optimizado para listas con pocas categorías, versión muy libre del counting sort, ver el README de ordenamientos catSort)

## 📈 Próximos pasos
### Análisis comparativo de resultados (desarrollo de un banco de pruebas)

### Evolución del catSort_flat y codificación del catSort_table en java

## 🧠 Observaciones
El algoritmo catSort_flat() fue creado en python mientras repasaba el algoritmo countingSort. Para el repositorio actual lo llevé a java y planeo hacerle mejoras y variantes.

Desarrollado por:
María Marta Torres
Nació como un repaso de los algoritmos de ordenamiento en hoja, luego se mudó a python y se convirtió en un proyecto más grande. Este repositorio es la etapa java, pero no va a terminar aquí, en el futuro nos esperan solidity y otros. ¡Es una gran aventura!
