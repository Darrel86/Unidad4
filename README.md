# 🎬 Sistema de Contenido Audiovisual

## 📌 Descripción del proyecto

Este proyecto es un sistema de gestión de contenido audiovisual desarrollado en Java utilizando Programación Orientada a Objetos (POO).

Permite gestionar información de películas (y preparado para series, documentales, etc.) aplicando arquitectura MVC, principios SOLID y manejo básico de datos.

---

## 🏗️ Arquitectura del sistema

El proyecto está organizado bajo el patrón **MVC (Modelo - Vista - Controlador)**:

### 📦 Modelo (Model)
- Contiene las clases de negocio como:
  - `ContenidoAudiovisual` (clase abstracta)
  - `Pelicula`

### 🖥️ Vista (View)
- `ConsolaView`
- Maneja la interacción con el usuario mediante consola

### 🎮 Controlador (Controller)
- `ContenidoController`
- Gestiona la lógica del sistema y conecta modelo con vista

### 💾 DAO
- `ArchivoManager`
- Preparado para manejo de archivos (lectura y escritura de datos)

---

## ⚙️ Funcionalidades

- Menú interactivo en consola
- Agregar contenido audiovisual (películas)
- Mostrar contenido almacenado en memoria
- Estructura preparada para persistencia en archivos
- Uso de herencia y polimorfismo

---

## 🧠 Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- MVC (Modelo - Vista - Controlador)

---

## 📂 Estructura del proyecto
