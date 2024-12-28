// AuxClick
document.getElementById('container').addEventListener('auxclick', function () {
  console.log('Click derecho ha sido presionado y/o liberado')
})

// Click
document.getElementById('container').addEventListener('click', () => {
  alert('¡Hola!')
})

// ContextMenu
document
  .getElementById('container')
  .addEventListener('contextmenu', (event) => {
    event.preventDefault()
    console.log('No te dejo ver el menu con click derecho.')
  })

// MouseEnter
document.getElementById('container').addEventListener('mouseenter', () => {
  console.log('El puntero ha entrado en el área del contenedor')
})

// MouseLeave
document.getElementById('container').addEventListener('mouseleave', () => {
  console.log('El puntero ha salido del área del contenedor')
})

// MouseOut
document.getElementById('container').addEventListener('mouseout', () => {
  console.log(
    'El puntero ha salido del elemento o de sus elementos secundarios'
  )
})

// MouseOver
document.getElementById('container').addEventListener('mouseover', () => {
  console.log(
    'El puntero está sobre el contenedor o uno de sus elementos secundarios'
  )
})

// MouseUp
document.getElementById('container').addEventListener('mouseup', () => {
  console.log('Se ha soltado el botón del ratón sobre el contenedor')
})

// Test
function handleTestEvent(event) {
  console.log("Evento 'test' ha sido activado")
}
const options = { once: true }
window.addEventListener('test', handleTestEvent, options)

// Wheel
document.getElementById('container').addEventListener('wheel', (event) => {
  console.log('El usuario ha desplazado la rueda del ratón')
})
