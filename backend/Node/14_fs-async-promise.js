// 1) Módulo para el sistema de ficheros
const fs = require("node:fs/promises");

// 2) Lee el fichero mientras el programa continua y al terminar se ejecuta la función.
fs.readFile("./data.txt", "utf-8")
  .then((data) => console.log(data))
  .catch((error) => console.error(error));

// Note: Son más entendibles que los callbacks cuando se anidan
