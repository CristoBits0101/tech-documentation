// 1) Módulo para el sistema de ficheros
const fs = require("node:fs");

// 2) Obtiene el fichero de manera sincrónica
const stats = fs.statSync("./data.txt");

// 3) Muestra el tipo de fichero
console.log(stats.isFile, stats.isDirectory, stats.isSymbolicLink, stats.size);
