// 1) Módulo para el sistema de ficheros
const { fs } = require("node:fs/promises");

// 2) Lectura de varios ficheros simultáneamente
Promise.all([
  fs("./data.txt", "utf8"),
  fs("./info.txt", "utf8"),
  fs("./text.txt", "utf8"),
]).then(([text, secondText]) => {
  console.log(text);
  console.log(secondText);
});

// Note: Ejecuta los procesos a la vez
