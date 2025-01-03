// OnBlur: Se ejecuta cuando un elemento pierde el foco.
document.getElementById('inputField').addEventListener('blur', () => {
  console.log('El campo ha perdido el foco')
})

// OnChange: Se dispara cuando el valor de un elemento de entrada cambia.
document.getElementById('inputField').addEventListener('change', () => {
  console.log('El valor del campo ha cambiado')
})

// OnClick: Se ejecuta cuando se hace clic en un elemento.
document.getElementById('button').addEventListener('click', () => {
  console.log('El botón ha sido clickeado')
})

// OnDBLClick: Se dispara cuando se hace doble clic en un elemento.
document.getElementById('button').addEventListener('dblclick', () => {
  console.log('El botón ha sido doblemente clickeado')
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

// OnMouseMove: Se ejecuta cuando el ratón se mueve sobre un elemento.
document.getElementById('container').addEventListener('mousemove', () => {
  console.log('El ratón se está moviendo sobre el contenedor')
})

// OnMouseOut: Se dispara cuando el ratón sale de un elemento.
document.getElementById('container').addEventListener('mouseout', () => {
  console.log('El ratón ha salido del contenedor')
})

// OnMouseOver: Se ejecuta cuando el ratón pasa sobre un elemento.
document.getElementById('container').addEventListener('mouseover', () => {
  console.log('El ratón está sobre el contenedor')
})

// OnMouseUp: Se dispara cuando se libera un botón del ratón sobre un elemento.
document.getElementById('container').addEventListener('mouseup', () => {
  console.log('Botón del ratón liberado sobre el contenedor')
})

// OnResize: Se ejecuta cuando el tamaño de la ventana cambia.
window.addEventListener('resize', () => {
  console.log('La ventana ha cambiado de tamaño')
})

// OnScroll: Se dispara cuando se desplaza la ventana.
window.addEventListener('scroll', () => {
  console.log('La ventana se está desplazando')
})
