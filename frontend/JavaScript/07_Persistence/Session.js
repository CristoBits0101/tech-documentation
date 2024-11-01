// Create
sessionStorage.setItem('nombre', 'Cristo')
sessionStorage.setItem(
  'persona',
  JSON.stringify({ nombre: 'Cristo', apellido: Suárez })
)

// Update
sessionStorage.setItem('nombre', 'Rubén')

// Read
sessionlStorage.getItem()
console.log(JSON.parse(sessionStorage.getItem('persona')))

// Remove
sessionStorage.removeItem('key_name')
