export const processRequest = (req, res) => {
  // Test
  console.log('Received request.')

  // Request
  if (req.url === '/') {
    // Header
    res.setHeader('Content-Type', 'text/html; charset=utf8')
    res.statusCode = 200
    // Body
    res.end('<h1>¡Bienvenido a mí página principal!</h1>')
  } else {
    // Header
    res.setHeader('Content-Type', 'text/plain; charset=utf8')
    res.statusCode = 404
    // Body
    res.end(' 404 | Page Not Found')
  }
}
