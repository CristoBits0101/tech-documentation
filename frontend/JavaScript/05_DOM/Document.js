// Create
let tabla = document.createElement('table')
let tBody = document.createElement('tbody')
let fila1 = document.createElement('tr')
let celda = document.createElement('td')
let textCell1 = document.createTextNode('TextCell')
let textCell2 = document.createTextNode('Texto')
let lineBreak = document.createElement('br')

// Child
tabla.appendChild(tBody)
tBody.appendChild(fila1)
fila1.appendChild(celda)
celda.appendChild(textCell1)

// QuerySelector
const button = document.querySelector('button')
button.addEventListener('click', () => {
  const isLiked = button.classList.toggle('liked')
  button.innerHTML = isLiked ? 'Quitar me gusta' : 'Me gusta'
})

// QuerySelectorAll
document.querySelectorAll('.item').forEach((item) => {
  item.style.color = 'blue'
})

// GetElementsByClassName
const buttons = document.getElementsByClassName('btn')
for (let btn of buttons) {
  btn.style.backgroundColor = 'lightgray'
}

// GetElementsByName
const radios = document.getElementsByName('options')
radios.forEach((radio) => {
  radio.checked = false
})

// GetElementsByTagName
const paragraphs = document.getElementsByTagName('p')
for (let p of paragraphs) {
  p.style.fontSize = '16px'
}

// GetElementById
document.getElementById('weekdays').appendChild(tabla)
document.getElementById('weekdays').appendChild(lineBreak)

// OnContextMenu
document.oncontextmenu = function () {
  return false
}

// ParentNode
controles[i].parentNode.classList.add('error')
controles[i].parentNode.classList.remove('error')

// SetAttribute
tabla.setAttribute('border', '1px')

// Write
document.write('<h1>Bienvenido</h1>')
