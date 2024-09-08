export const processRequest = (req, res) => {
  if (req === '/') {
    // Header
    res.setHeader('Content-Type', 'text/plain')
    res.statusCode = 200
    // Body
    res.end('Welcome to the home page!')
  }
  console.log('Received request.')
  res.end('Hello, World!')
}
