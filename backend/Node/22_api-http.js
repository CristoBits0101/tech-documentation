// Protocolo HTTP
const http = require('node:http')

// Importa la función que busca un puerto libre
const { findAvailablePort } = require('./23._free-port.js')

// Inprime la variable para el port
console.log(process.env)

// Puerto desde el que escucha las peticiones
const desiredPort = process.env.PORT ?? 3000

// Callback que gestiona las request and response
const server = http.createServer((req, res) => {
    console.log('request received')
    res.end('Hola mundo')
})

// Encuentra un puerto libre
findAvailablePort(desiredPort).then(port => {
    server.listen(port, () => {
        console.log(`server listening on port http://localhost:${port}`)
    })
})