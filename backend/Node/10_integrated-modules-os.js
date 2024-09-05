// 1) Módulo para obtener información del sistema operativo
const os = require("node:os");

// 2) Imprimir información del sistema operativo
console.log(`Nombre:          ${os.platform()}`);
console.log(`Versión:         ${os.release()}`);
console.log(`Arquitectura:    ${os.arch()}`);
console.log(`CPUs:            ${os.cpus().length}`);
console.log(`Memoria libre:   ${(os.freemem() / 1024 / 1024).toFixed(2)} MB`);
console.log(`Memoria total:   ${(os.totalmem() / 1024 / 1024).toFixed(2)} MB`);
console.log(`Días encendido:  ${(os.uptime() / 60 / 60).toFixed(2)} horas`);
