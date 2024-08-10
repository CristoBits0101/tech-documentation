# Guía de Contribución

Este documento detalla las mejores prácticas y procedimientos a seguir para contribuir al proyecto. Asegúrate de seguir estas directrices para mantener la calidad y coherencia del código.

## 1) Tareas pequeñas y bien definidas:

   - **No se permiten cambios masivos.**  
     Divide tus tareas en unidades pequeñas y manejables. Esto facilita la revisión del código y reduce el riesgo de errores.

## 2) Revisión de código:

   - **Los demás desarrolladores revisan tu código y aprueban los cambios.**  
     Es fundamental que el código sea revisado por otros miembros del equipo antes de ser fusionado al repositorio principal. Asegúrate de que tu código sea claro, eficiente y esté bien documentado.

## 3) Uso de pruebas automatizadas:

   - **Deben cubrir tanto las funcionalidades nuevas como las antiguas.**  
     Es necesario que todas las funciones estén respaldadas por pruebas automatizadas. Esto garantiza que nuevas implementaciones no rompan funcionalidades existentes.

## 4) Trabajo sobre el marco CI/CD:

   - **Para evitar problemas de integración a posteriori.**  
     Utiliza un marco de Integración Continua y Despliegue Continuo (CI/CD) para asegurar que los cambios se integren sin problemas en el proyecto. Esto ayuda a detectar errores en etapas tempranas del desarrollo.

## 5) Utilización de feature flags:

   - **Permiten integrar características no terminadas y ocultarlas al usuario.**  
     Las feature flags te permiten desarrollar e integrar nuevas características sin exponerlas a los usuarios finales hasta que estén completamente terminadas. Esta práctica facilita la gestión de lanzamientos y pruebas de nuevas funcionalidades.
