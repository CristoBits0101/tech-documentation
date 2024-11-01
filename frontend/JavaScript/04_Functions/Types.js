// Anonymous
const funcionFlecha6 = () => {
  console.log('a')
}

// Arrow
const funcionFlecha0 = (a) => console.log(a)
const funcionFlecha2 = (a) => {
  console.log(a)
}
const funcionFlecha3 = (a, b) => console.log(a, b)
const funcionFlecha4 = (a, b) => {
  console.log(a, b)
}

// Named
function sum(a, b) {
  return a + b
}


// Incremento automático -> pruebas -> nombres -> id -> etc...

// 1. Declaramos la función `generateID()` como una función generadora.
function* generateID() {
  // 2. Declaramos la variable `id` y la inicializamos a 0.
  let id = 0

  // 3. Declaramos un bucle `while(true)` que nunca se detiene.
  while (true) {
    // 4. Incrementamos el valor de `id`.
    id++

    // 5. Si el valor de `id` es igual a 10, salimos del bucle.
    if (id === 10) {
      return
    }

    // 6. Generamos un nuevo número entero y lo devolvemos.
    yield id
  }
}

// 7. Guardamos la función generadora en una constante llamada `gen`.
const gen = generateID()

// 8. Llamamos a la función generadora y obtenemos el primer valor generado.
console.log(gen.next().value())
