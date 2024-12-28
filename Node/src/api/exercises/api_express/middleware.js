// 1) Dependencies
const express = require('express')
const ditto = require('./pokemon/ditto.json')

// 2) Port
const PORT = process.env.PORT ?? 1234

// 3) Instance
const app = express()

// 4) Disable
app.disable('x-powered-by')

// 5) Middleware
app.use((req, res, next) => {
  if (req.method !== 'POST') return next()
  if (req.headers['content-type'] !== 'application/json') return next()
  let body = ''
  req.on('data', (chunk) => {
    body += chunk.toString()
  })
  req.on('end', () => {
    const data = JSON.parse(body)
    data.timestamp = Date.now()
    req.body = data
    next()
  })
})

// 6) Routes
app.get('/pokemon/ditto', (req, res) => {
  res.json(ditto)
})

app.post('/pokemon', (req, res) => {
  res.status(201).json(req.body)
})

app.use((req, res) => {
  res.status(404).send('<h1>404</h1>')
})

// 7) Listen
app.listen(PORT, () => {
  console.log(`server listening on port http://localhost:${PORT}`)
})
