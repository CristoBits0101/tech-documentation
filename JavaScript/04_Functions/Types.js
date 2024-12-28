// Anonymous
const funcionFlecha6 = () => {
  console.log('a')
}

// Arrow
const funcionFlecha0 = (a) => console.log(a)
const funcionFlecha2 = (a) => {console.log(a)}
const funcionFlecha3 = (a, b) => console.log(a, b)
const funcionFlecha4 = (a, b) => {
  console.log(a, b)
}

// Generator
function* generateID() {
  let id = 0
  while (id < 10) yield ++id
}

const gen = generateID()
console.log(gen.next().value)

// Named
function sum(a, b) {
  return a + b
}
