// 1) Importar el módulo para manejar solicitudes y crear servidores web.
const http = require('node:http')

// 2) Crear un servidor web que maneja solicitudes
const server = http.createServer((request, response) => {
  console.log('request received')

  /**
   * Cierra la conexión
   * Envía la respuesta en texto plano
   */
  response.end('Hola mundo')
})

// 3) Establecer a través de que puerto se escuchan las solicitudes
server.listen(3000, () => {
  console.log('Server running on port 3000')
})
