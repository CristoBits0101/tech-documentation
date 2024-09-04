// Módulo para sistemas operativos
const osSpecification = require("node:os");

console.log("Nombre del sistema operativo: " + osSpecification.platform);
console.log("");
console.log("Versión del sistema operativo: " + osSpecification.release);
console.log("");
console.log("Arquitectura del sistema operativo: " + osSpecification.arch);
console.log("");
console.log("CPUs del sistema operativo: " + osSpecification.cpus);
console.log("");
console.log(
  "Memoria libre del sistema operativo: " +
    osSpecification.freemem / 1024 / 1024
);
console.log("");
console.log(
  "Memoria total del sistema operativo: " +
    osSpecification.totalmem / 1024 / 1024
);
console.log("");
console.log(
  "Días con el ordenador encendido: " + osSpecification.uptime / 60 / 60
);
