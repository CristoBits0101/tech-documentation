// Create
localStorage.setItem('nombre', 'Rubén')

localStorage.setItem(
  'persona',
  JSON.stringify({ nombre: 'Cristo', apellido: 'Suárez' })
)

// Read
console.log(localStorage.getItem())
console.log(localStorage.getItem('nombre'))
console.log(JSON.parse(localStorage.getItem('persona')))

// Remove
localStorage.removeItem('key_name')
