// 1) Importar módulo para trabajar con las rutas en node
const path = require("node:path");

// 2) Saber que tipos de barras usa mi sistema operativo
console.log(path.sep);

// 3) Unir rutas
const filePath = path.join("content", "subfolder", "test.js");
console.log(filePath);

// 4) Obtener el nombre del fichero
const base = path.basename(filePath);
console.log(base);

// 4) Obtener el nombre del fichero sin la extención
const filename = path.basename(filePath, ".js");
console.log(filename);

// 5) Obtener la extensión del fichero
const ext = path.extname(filePath);
console.log(ext);
