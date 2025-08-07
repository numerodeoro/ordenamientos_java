# <img width="60" height="60" alt="image" src="https://github.com/user-attachments/assets/bce9f021-e7c5-40c4-8077-3a525c7c0c81" />        Algoritmos de Ordenamiento en java

Este proyecto es la continuación de **"comparación de algoritmos de ordenamiento"** escrito en python. Entre otros objetivos, pretende evaluar el desempeño de distintos algoritmos de ordenamiento sobre listas de diferentes características.
Aquél nació con la idea de repasar algoritmos de ordenamientos ya existentes y terminó desembocando en algunas variantes propias de los ordenamientos (*catSort*, inspirando en el counting aunque con varios cambios y *pivotear*, casi calcado del quick sort, pero con cambio de pivote y ligeramente distinta metodología en la partición) y en el desarrollo de un tester personalizado de los algoritmos. 
Éste continuará la tarea en java, por ahora estoy comenzando

## 📂 Estructura del Proyecto
├── ordenamientos_java/

│   ├── Bubble.class

│   ├── bubble.java

│   ├── CatSort_flat.class

│   ├── CatSort_flat.java

│   ├── Selection.class

│   ├── Selection.java

│   └── README.md

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
