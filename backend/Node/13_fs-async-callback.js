// 1) Módulo para el sistema de ficheros
const fs = require('node:fs')

// 2) Lee el fichero mientras el programa continua y al terminar se ejecuta la función.
fs.readFile('./data.txt', 'utf-8', (error, data) => {
  console.log(error, data)
})
