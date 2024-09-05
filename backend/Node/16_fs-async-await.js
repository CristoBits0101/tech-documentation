// 1) Módulo para el sistema de ficheros
const fs = require("node:fs/promises");

// 2) Módulo para convertir callbacks en promesas
const promisify = require("promisify");

// 3) Lectura de un fichero con promesas
const promise = promisify(fs.readFile);

// 4) Lectura del fichero y muestra su contenido
promise("./data.txt", "utf-8")
  .then((data) => console.log(data))
  .catch((error) => console.error(error));
