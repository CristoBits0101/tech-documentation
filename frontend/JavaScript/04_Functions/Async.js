// Await
async function fetchData() {
  try {
    const response = await fetch('https://api.example.com/data')
    if (!response.ok) throw new Error(`HTTP error! Status: ${response.status}`)
    const data = await response.json()
    console.log('Datos obtenidos:', data)
  } catch (error) {
    console.error('Error al obtener datos:', error.message)
  }
}

fetchData()

// Callback
function getData(callback) {
  setTimeout(() => {
    const data = { id: 1, name: 'Producto' }
    console.log('Datos obtenidos')
    callback(null, data)
  }, 2000)
}

getData((error, data) => {
  if (error) {
    console.error('Error:', error)
    return
  }
  console.log('Callback con datos:', data)
})

// Fetch
fetch('https://api.example.com/data')
  .then((response) => {
    if (!response.ok) throw new Error(`HTTP error! Status: ${response.status}`)
    return response.json()
  })
  .then((data) => {
    console.log('Datos obtenidos:', data)
  })
  .catch((error) => {
    console.error('Error en la solicitud:', error.message)
  })

// Promises
function myAsynchronous() {
  return new Promise((resolve, reject) => {
    const i = Math.floor(Math.random() * 2)
    if (i !== 0) resolve(i)
    else reject()
  })
}

myAsynchronous()
  .then(() => console.log('Ejecución correcta'))
  .catch(() => console.log('Error en la ejecución'))
  .finally(() => console.log('Siempre se ejecuta'))
