export const listen = (desiredPort, server) => {
  server.listen(desiredPort, () => {
    console.log(`Server is running on port: http://localhost:${desiredPort}.`)
  })
}
