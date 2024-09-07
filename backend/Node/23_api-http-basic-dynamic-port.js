// 1) Importar el módulo para manejar solicitudes y crear servidores web.
const http = require('node:http')

// 2) Crear un servidor web que maneja solicitudes
const server = http.createServer((request, response) => {
  console.log('request received')

  // Cierra la conexión y envía la respuesta con texto plano
  response.end('Hola mundo')
})

// 3) Devuelve un puerto libre aleatorio
server.listen(0, () => {
  const address = server.address()
  console.log(`server listening on port http://localhost:${address.port}`)
})
