// Await

// Callback

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
