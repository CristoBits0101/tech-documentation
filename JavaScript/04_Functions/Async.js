// Await
// Await con datos
async function fetchData() {
  const dataToSend = {
    name: 'John Doe',
    email: 'johndoe@example.com',
    age: 30,
  };

  try {
    const response = await fetch('https://api.example.com/data', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
        Authorization: 'dfg634_123',
        'Custom-Header': 'YourCustomValue',
      },
      body: JSON.stringify(dataToSend), // Convertir los datos a JSON
    });

    if (!response.ok) {
      throw new Error(`HTTP error! Status: ${response.status}`);
    }

    const data = await response.json(); // Convertir la respuesta a JSON
    console.log('Data received: ', data);
  } catch (error) {
    console.error('Error: ', error.message);
  }
}

fetchData()

// Callback
function getData(callback) {
  setTimeout(() => {
    const data = { id: 1, name: 'Product' }
    console.log('Data')
    callback(null, data)
  }, 2000)
}

getData((error, data) => {
  if (error) {
    console.error('Error: ', error)
    return
  }
  console.log('Callback with data: ', data)
})

// Fetch con cabeceras personalizadas
fetch('https://api.example.com/data', {
  method: 'POST',
  headers: {
    'Content-Type': 'application/json',
    Authorization: 'dfg634_123',
    'Custom-Header': 'YourCustomValue',
  },
  body: JSON.stringify(dataToSend),
})
  .then((response) => {
    if (!response.ok) throw new Error(`HTTP error! Status: ${response.status}`)
    return response.json()
  })
  .then((data) => {
    console.log('Data: ', data)
  })
  .catch((error) => {
    console.error('Error: ', error.message)
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
