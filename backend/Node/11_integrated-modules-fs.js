// 1) Módulo para el sistema de ficheros
const fs = require("node:fs");

// 2) Obtiene el fichero de manera sincrónica
const stats = fs.statSync("./data.txt");

// 3) Muestra el tipo de fichero
console.log(stats.isFile, stats.isDirectory, stats.isSymbolicLink, stats.size);

// 4) Leer el directorio actual y mostrar los ficheros
fs.readdir(".", (error, files) => {
  if (error) {
    console.error(error);
    return;
  }
  files.forEach((file) => console.log(file));
});

// 5) Comprobación asíncrona de si el fichero existe con stats
fs.access("./data.txt", fs.constants.F_OK, (error) => {
  if (error) {
    console.error("File does not exist:", error);
  } else {
    console.log("File exists");
  }
});

// 6) Comprobación síncrona de si el fichero existe con stats
if (fs.existsSync("./data.txt")) {
  console.log("File exists");
} else {
  console.log("File does not exist");
}

// 7)
