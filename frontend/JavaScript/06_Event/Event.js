// DispatchEvent
const event = new Event('test')
window.addEventListener('test', () =>
  console.log('Evento "test" ha sido activado')
)
window.dispatchEvent(event)

// EventTarget
const myEventTarget = new EventTarget()
const customEvent = new Event('custom')
myEventTarget.addEventListener('custom', () =>
  console.log('Evento "custom" disparado en EventTarget')
)
myEventTarget.dispatchEvent(customEvent)

// PreventDefault
document.getElementById('link').addEventListener('click', (event) => {
  event.preventDefault()
  console.log('El evento ha sido prevenido')
})

// RemoveEventListener
const myFunction = () => console.log('Listener activado')
document.getElementById('button').addEventListener('click', myFunction)
document.getElementById('button').removeEventListener('click', myFunction)

// Reset
document.getElementById('myForm').addEventListener('submit', (event) => {
  event.preventDefault()
  document.getElementById('myForm').reset()
  console.log('Formulario reiniciado')
})
