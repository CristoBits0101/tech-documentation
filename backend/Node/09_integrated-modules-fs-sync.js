// Módulo para el sistema de ficheros
const fs = require("node:fs");

// Obtener información sincróna
const stats = fs.statSync("./data.txt");
console.log(stats.isFile, stats.isDirectory, stats.isSymbolicLink, stats.size);

// Leer información sincróna
const dataSync = fs.readFileSync("./data.txt", "utf-8");
