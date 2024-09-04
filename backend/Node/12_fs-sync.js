// 1) Módulo para el sistema de ficheros
const fs = require("node:fs");

// 2) Lee el fichero bloqueando el programa hasta completar la lectura.
const dataSync = fs.readFileSync("./data.txt", "utf-8");
