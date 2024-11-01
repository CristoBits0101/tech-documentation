// Checked
document.querySelectorAll('input[type="checkbox"]').forEach((checkbox) => {
  checkbox.checked = true
})

// ClassList
controles[i].parentNode.classList.add('error')
controles[i].parentNode.classList.remove('error')

// Disabled
document.getElementById('submitButton').disabled = true

// Id
const elementId = document.getElementById('elementId')
elementId.style.color = 'red'

// InnerHTML
let table = "<table class='table table-dark table-striped'>"
table += '<tr><td>' + paises[index] + '</td></tr>'
table += '</table>'
document.getElementById('pintarPaises').innerHTML = table

// Length
const itemCount = document.querySelectorAll('.items').length

// Name
const namedElement = document.getElementsByName('username')[0]
namedElement.placeholder = 'Enter your username'

// SetAttribute
tabla.setAttribute('border', '1px')

// Style
document.getElementById(id_objeto).style.background = '#FFF200'

// Value
document.getElementById('inputField').value = 'Nuevo valor'
