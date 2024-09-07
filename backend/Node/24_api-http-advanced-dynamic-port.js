// 1) Importar el módulo para manejar solicitudes y crear servidores web.
const http = require('node:http')

// 2) Importar función para encontrar un puerto libre
const { findAvailablePort } = require('./25_set-free-port-advanced-dynamic-port.js')

// 3)
console.log(process.env)

// 4)
const desiredPort = process.env.PORT ?? 3000

// 5) Crear un servidor web que maneja solicitudes
const server = http.createServer((req, res) => {
  console.log('request received')
  res.end('Hola mundo')
})

// 6) Establecer a través de que puerto se escuchan las solicitudes
findAvailablePort(desiredPort).then((port) => {
  server.listen(port, () => {
    console.log(`server listening on port http://localhost:${port}`)
  })
})
