// 1) Importar el módulo de node
const http = require('node:http')

// 2) Importa la función que busca un puerto libre
const { findAvailablePort } = require('./23._free-port.js')

// 3) Inprime la variable para el port
console.log(process.env)

// 4) Puerto desde el que escucha las peticiones
const desiredPort = process.env.PORT ?? 3000

/**
 * 5) Creación de un servidor web
 * Gestiona las peticiones y las respuestas
 * El método recibe un callback
 */
const server = http.createServer((request, response) => {
    console.log('request received')
    response.end('Hola mundo')
})

// Encuentra un puerto libre
findAvailablePort(desiredPort).then(port => {
    server.listen(port, () => {
        console.log(`server listening on port http://localhost:${port}`)
    })
})