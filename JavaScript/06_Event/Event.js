// DispatchEvent: Permite crear y disparar eventos manualmente.
const event = new Event('test') // Crea un evento llamado 'test'.
window.addEventListener('test', () =>
  console.log('Evento "test" ha sido activado')
) // Agrega un listener para el evento 'test'.
window.dispatchEvent(event) // Dispara el evento 'test'.

// EventTarget: Proporciona una forma de trabajar con eventos personalizados.
const myEventTarget = new EventTarget() // Crea un nuevo EventTarget.
const customEvent = new Event('custom') // Crea un evento personalizado llamado 'custom'.

// Agrega un listener para el evento 'custom'.
myEventTarget.addEventListener('custom', () =>
  console.log('Evento "custom" disparado en EventTarget')
)

// Dispara el evento 'custom'.
myEventTarget.dispatchEvent(customEvent)

// PreventDefault: Previene el comportamiento predeterminado de un evento.
document.getElementById('link').addEventListener('click', (event) => {
  event.preventDefault() // Previene que el enlace navegue a su destino.
  console.log('El evento ha sido prevenido')
})

// RemoveEventListener: Elimina un listener previamente registrado.
const myFunction = () => console.log('Listener activado')
document.getElementById('button').addEventListener('click', myFunction) // Agrega un listener al botón.
document.getElementById('button').removeEventListener('click', myFunction) // Elimina el listener del botón.

// Reset: Reinicia un formulario a su estado inicial.
document.getElementById('myForm').addEventListener('submit', (event) => {
  event.preventDefault() // Previene que el formulario se envíe.
  document.getElementById('myForm').reset() // Reinicia el formulario.
  console.log('Formulario reiniciado')
})
