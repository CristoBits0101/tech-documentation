import { fs } from 'node:fs'

export const processRequest = (req, res) => {
  // 1) Test
  console.log('Received request.')
  // 2) Request
  if (req.url === '/') {
    // Header
    res.setHeader('Content-Type', 'text/html; charset=utf8')
    res.statusCode = 200
    // Body
    res.end('<h1>¡Bienvenido a mí página principal!</h1>')
  } else if (req.url === '/image') {
    fs.readFile('./image.jpg', (err, data) => {
      if (err) {
        console.error(err)
        // Header
        res.setHeader('Content-Type', 'text/html; charset=utf8')
        res.statusCode = 500
        // Body
        res.end('<h1>Internal Server Error</h1>')
      }
      // Header
      res.setHeader('Content-Type', 'image/jpeg')
      res.statusCode = 200
      // Body
      res.end(data)
    })
  } else {
    // Header
    res.setHeader('Content-Type', 'text/plain; charset=utf8')
    res.statusCode = 404
    // Body
    res.end(' 404 | Page Not Found')
  }
}
