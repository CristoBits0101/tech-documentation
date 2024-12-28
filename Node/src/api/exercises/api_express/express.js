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
app.use(express.json())

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
