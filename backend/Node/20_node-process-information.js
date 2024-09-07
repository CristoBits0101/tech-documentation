// 1) Argumentos de entrada que ha recibido el proceso
console.log(process.argv)

// 2) Carpeta en la que se está ejecutando el proceso
console.log(process.cmd())

// 3) Salir de un proceso exitoso
process.exit(0)

// 4) Salir de un proceso erróneo
process.exit(1)

// 5) Obtener el PID del proceso
console.log('PID:', process.pid)

// 6) Acciones después de finalizr el proceso
process.on('exit', () => {
  console.log('Proceso finalizado')
})

// 7) Se puede pasar variables de entorno como último parámetro
console.log(process.env.NODE_ENV)
