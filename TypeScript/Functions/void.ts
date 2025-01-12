/**
 * Función que recibe otra función cuyo retorno no importa.
 * fn: Nombre del parámetro.
 * fn: (name: string) => void
 *             (name) => { console.log(`Hola ${name}`)
 */
const sayHiFromFunction = (fn: (name: string) => void) => {
  fn('Cristo')
}

sayHiFromFunction((name) => {
  console.log(`Hola ${name}`)
})
