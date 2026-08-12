# Curso de Kotlin: Estructuras y POO

Este proyecto está pensado para enseñar Kotlin de forma progresiva, empezando por variables, estructuras de control, funciones, colecciones y terminando en programación orientada a objetos.

## Estructura del curso

1. Variables y tipos de datos
2. Estructuras de control
3. Funciones
4. Colecciones
5. Clases y objetos
6. Herencia
7. Encapsulamiento y polimorfismo
8. Proyecto final

## Archivos principales

- `main.kt`: presentación del curso
- `leccion_01_variables.kt`
- `leccion_02_estructuras_de_control.kt`
- `leccion_03_funciones.kt`
- `leccion_04_collecciones.kt`
- `leccion_05_clases_y_objetos.kt`
- `leccion_06_herencia.kt`
- `leccion_07_encapsulamiento_y_polimorfismo.kt`
- `leccion_08_proyecto_final.kt`

## Cómo compilar

Si tienes Kotlin instalado:

```powershell
kotlinc .\main.kt -include-runtime -d app.jar
java -jar .\app.jar
```

También puedes compilar cada archivo individualmente:

```powershell
kotlinc .\leccion_01_variables.kt -include-runtime -d leccion1.jar
java -jar .\leccion1.jar
```

## Objetivo docente

- Comprender la sintaxis básica de Kotlin
- Trabajar con estructuras condicionales y repetitivas
- Organizar lógica con funciones
- Modelar entidades con clases
- Aplicar conceptos de POO: herencia, encapsulamiento y polimorfismo
