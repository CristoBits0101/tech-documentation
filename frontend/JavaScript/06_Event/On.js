// OnBlur
document.getElementById('inputField').addEventListener('blur', () => {
  console.log('El campo ha perdido el foco')
})

// OnChange
document.getElementById('inputField').addEventListener('change', () => {
  console.log('El valor del campo ha cambiado')
})

// OnClick
document.getElementById('button').addEventListener('click', () => {
  console.log('El botón ha sido clickeado')
})

// OnDBLClick
document.getElementById('button').addEventListener('dblclick', () => {
  console.log('El botón ha sido doblemente clickeado')
})

// OnFocus
document.getElementById('inputField').addEventListener('focus', () => {
  console.log('El campo ha recibido el foco')
})

// OnKeyDown
document.addEventListener('keydown', (event) => {
  console.log(`Tecla presionada: ${event.key}`)
})

// OnKeyUp
document.addEventListener('keyup', (event) => {
  console.log(`Tecla liberada: ${event.key}`)
})

// OnLoad
window.addEventListener('load', () => {
  console.log('La página ha cargado completamente')
})

// OnMouseDown
document.getElementById('container').addEventListener('mousedown', () => {
  console.log('Botón del ratón presionado sobre el contenedor')
})

// OnMouseMove
document.getElementById('container').addEventListener('mousemove', () => {
  console.log('El ratón se está moviendo sobre el contenedor')
})

// OnMouseOut
document.getElementById('container').addEventListener('mouseout', () => {
  console.log('El ratón ha salido del contenedor')
})

// OnMouseOver
document.getElementById('container').addEventListener('mouseover', () => {
  console.log('El ratón está sobre el contenedor')
})

// OnMouseUp
document.getElementById('container').addEventListener('mouseup', () => {
  console.log('Botón del ratón liberado sobre el contenedor')
})

// OnResize
window.addEventListener('resize', () => {
  console.log('La ventana ha cambiado de tamaño')
})

// OnScroll
window.addEventListener('scroll', () => {
  console.log('La ventana se está desplazando')
})
