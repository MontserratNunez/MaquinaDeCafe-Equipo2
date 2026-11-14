# Máquina de Café — Práctica TDD

Proyecto desarrollado en Java utilizando la metodología **Test-Driven Development (TDD)** bajo el ciclo *Red - Green - Refactor*. El sistema simula el funcionamiento de una máquina dispensadora de café, gestionando el inventario de vasos, la cantidad de café disponible y las cucharadas de azúcar.

---

## Historia de Usuario y Requerimientos

> **Como:** Consumidor de café  
> **Deseo:** Tomar un vaso de café  
> **Para:** Mitigar el sueño.

### Criterios de Aceptación
1. **Selección de tamaño de vaso:** El usuario puede elegir entre tres tamaños disponibles:
   * **Vaso Pequeño:** 3 Oz de café.
   * **Vaso Mediano:** 5 Oz de café.
   * **Vaso Grande:** 7 Oz de café.
2. **Selección de azúcar:** El usuario puede indicar la cantidad de cucharadas de azúcar deseadas.
3. **Validación de insumos:** El sistema debe validar la disponibilidad de recursos antes de dispensar y mostrar mensajes de alerta si falta algún insumo:
   * `"No hay Vasos"`
   * `"No hay Cafe"`
   * `"No hay Azucar"`
4. **Confirmación:** Si todos los insumos están disponibles, se descuentan del inventario y se retorna el mensaje `"Felicitaciones"`.

---


## Tecnologías Utilizadas

* **Lenguaje:** Java
* **Gestor de Dependencias y Construcción:** Apache Maven
* **Framework de Pruebas:** JUnit 4
* **IDE:** Eclipse

---

## Cómo ejecutar el proyecto y las pruebas

### Desde Eclipse IDE
1. Ve a `File` > `Import...` > `Maven` > `Existing Maven Projects`.
2. Seleccionar la carpeta raíz del proyecto.
3. Hacer clic derecho sobre la carpeta `src/test/java` y seleccionar `Run As` > `JUnit Test`.