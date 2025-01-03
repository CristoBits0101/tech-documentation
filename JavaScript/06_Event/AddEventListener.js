// OnBlur: Se ejecuta cuando un elemento pierde el foco.
document.getElementById('inputField').addEventListener('blur', () => {
  console.log('El campo ha perdido el foco')
})

// OnChange: Se dispara cuando el valor de un elemento cambia.
document.getElementById('inputField').addEventListener('change', () => {
  console.log('El valor del campo ha cambiado')
})

// AuxClick: Se dispara cuando se hace clic con el botón del medio o derecho del ratón.
document.getElementById('container').addEventListener('auxclick', function () {
  console.log('Click derecho ha sido presionado y/o liberado')
})

// OnClick: Se ejecuta cuando se hace clic en un elemento.
document.getElementById('button').addEventListener('click', () => {
  console.log('El botón ha sido clickeado')
})

// OnDBLClick: Se dispara cuando se hace doble clic en un elemento.
document.getElementById('button').addEventListener('dblclick', () => {
  console.log('El botón ha sido doblemente clickeado')
})

// ContextMenu: Se ejecuta al intentar abrir el menú contextual con clic derecho.
document
  .getElementById('container')
  .addEventListener('contextmenu', (event) => {
    event.preventDefault() // Previene que se muestre el menú contextual.
    console.log('No te dejo ver el menú con clic derecho.')
  })

// MouseEnter: Se dispara cuando el puntero entra en el área del elemento.
document.getElementById('container').addEventListener('mouseenter', () => {
  console.log('El puntero ha entrado en el área del contenedor')
})

// MouseLeave: Se dispara cuando el puntero sale completamente del área del elemento.
document.getElementById('container').addEventListener('mouseleave', () => {
  console.log('El puntero ha salido del área del contenedor')
})

// MouseOut: Se dispara cuando el puntero sale del elemento o de sus hijos.
document.getElementById('container').addEventListener('mouseout', () => {
  console.log(
    'El puntero ha salido del elemento o de sus elementos secundarios'
  )
})

// MouseOver: Se dispara cuando el puntero pasa sobre el elemento o sus hijos.
document.getElementById('container').addEventListener('mouseover', () => {
  console.log(
    'El puntero está sobre el contenedor o uno de sus elementos secundarios'
  )
})

// MouseUp: Se dispara cuando se libera un botón del ratón sobre el elemento.
document.getElementById('container').addEventListener('mouseup', () => {
  console.log('Se ha soltado el botón del ratón sobre el contenedor')
})

// Test: Ejemplo de un evento personalizado, que se dispara una sola vez.
function handleTestEvent(event) {
  console.log("Evento 'test' ha sido activado")
}
const options = { once: true } // El evento se dispara solo una vez.
window.addEventListener('test', handleTestEvent, options)

// Wheel: Se dispara cuando se utiliza la rueda del ratón.
document.getElementById('container').addEventListener('wheel', (event) => {
  console.log('El usuario ha desplazado la rueda del ratón')
})

// OnFocus: Se ejecuta cuando un elemento gana el foco.
document.getElementById('inputField').addEventListener('focus', () => {
  console.log('El campo ha recibido el foco')
})

// OnKeyDown: Se dispara cuando se presiona una tecla.
document.addEventListener('keydown', (event) => {
  console.log(`Tecla presionada: ${event.key}`)
})

// OnKeyUp: Se dispara cuando se libera una tecla.
document.addEventListener('keyup', (event) => {
  console.log(`Tecla liberada: ${event.key}`)
})

// OnLoad: Se ejecuta cuando la página ha terminado de cargarse.
window.addEventListener('load', () => {
  console.log('La página ha cargado completamente')
})

// OnMouseDown: Se dispara cuando se presiona un botón del ratón sobre un elemento.
document.getElementById('container').addEventListener('mousedown', () => {
  console.log('Botón del ratón presionado sobre el contenedor')
})

// OnMouseMove: Se dispara cuando el ratón se mueve sobre el elemento.
document.getElementById('container').addEventListener('mousemove', () => {
  console.log('El ratón se está moviendo sobre el contenedor')
})

// OnResize: Se ejecuta cuando el tamaño de la ventana cambia.
window.addEventListener('resize', () => {
  console.log('La ventana ha cambiado de tamaño')
})

// OnScroll: Se dispara cuando se desplaza la ventana.
window.addEventListener('scroll', () => {
  console.log('La ventana se está desplazando')
})
