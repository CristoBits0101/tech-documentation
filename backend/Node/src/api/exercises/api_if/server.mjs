// 1) Modules
import { createServer } from 'node:http'
import { processRequest } from './url.mjs'
import { listen } from './listen.mjs'

// 2) Port
const desiredPort = process.env.PORT ?? 3000

// 3) Server
const server = createServer(processRequest)

// 4) Listen
listen(desiredPort, server)
