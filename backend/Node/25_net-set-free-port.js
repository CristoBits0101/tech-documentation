// 1) Importamos el módulo de net
const net = require('node:net')

// 2) Función para encontrar un puerto deseado disponible
function findAvailablePort(desiredPort) {
  return new Promise((resolve, reject) => {
    // Creación de un servidor web.
    const server = net.createServer()
    // Escucha de solicitudes en el puerto deseado
    server.listen(desiredPort, () => {
      // Extrae el puerto del objeto
      const { port } = server.address()
      // Cierra el servidor y devuelve el puerto libre
      server.close(() => {
        resolve(port)
      })
    })
    // Si ocurre un evento de error durante la escucha, intenta con el siguiente puerto
    server.on('error', (err) => {
      if (err.code === 'EADDRINUSE') {
        findAvailablePort(0).then((port) => resolve(port))
      } else {
        reject(err)
      }
    })
  })
}

module.exports = { findAvailablePort }
