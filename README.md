# Proyecto D&D

Trabajo de la UD5 – Uso de Git y ramas

## Descripción del proyecto

Este proyecto es una práctica de Java donde creamos varios tipos de personajes (Personaje, Guerrero y Mago) y una clase App para probarlos.  
El objetivo principal era aprender a usar Git correctamente: crear ramas, hacer commits pequeños y trabajar con GitHub.

El repositorio se creó primero en GitHub y luego lo clonamos al ordenador usando `git clone`.  
Durante todo el desarrollo usamos la consola para hacer los commits.

## Estructura del proyecto

La estructura es la misma que usamos en todos los poryectos (net-salesianos-personajes).

## Clases del proyecto

### Personaje

Clase base del proyecto.  
Tiene nombre, nivel y energía.  
Permite entrenar, descansar, gastar energía y mostrar información.  
Incluye un contador estático para saber cuántos personajes se han creado.

### Guerrero

Hereda de Personaje.  
Añade un atributo arma y un ataque especial `ataquePesado()` que reduce energía.  
Sobrescribe `mostrarInfo()` para mostrar los datos del guerrero.

### Mago

Hereda de Personaje.  
Tiene un elemento mágico y un ataque especial `ataqueElemental()` que consume más energía.  
Redefine `mostrarInfo()` para mostrar la información del mago.

### App

Clase principal donde se crean varios personajes, se entrenan, atacan y se muestran por pantalla.  
Al final se recorren todos en un array para imprimirlos uno por uno.

## Uso de Git durante el desarrollo

- Creamos el repositorio en GitHub y lo clonamos con `git clone`.
- Hicimos la estructura inicial y el primer commit.
- Creamos ramas como feature, personaje, guerrero, mago y app.
- Cada vez que terminábamos una parte del código, hacíamos un commit pequeño y claro.
- Cuando una clase estaba lista, se unía su rama a feature.
- Al final, cuando todo funcionaba, unimos feature a la rama principal.

## Resultado final

Un proyecto sencillo pero útil para practicar:

- Programación orientada a objetos
- Herencia
- Sobrescritura de métodos
- Uso real de Git y GitHub con ramas y commits
