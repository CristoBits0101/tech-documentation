// Módulo para el sistema de ficheros
const fs = require("node:fs/promises");

// Leer información asincróna con callback
fs.readFile("./data.txt", "utf-8", (error, data) => {
  console.log(error, data);
});

// Leer información asincróna con promesas
fs
  .readFile("./data.txt", "utf-8")
  .then((data) => console.log(data))
  .catch((error) => console.error(error));
