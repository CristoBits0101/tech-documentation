// Un objeto que representa a una persona con una propiedad `name`
const person = { name: 'Ana' };

// Función que recibe un saludo y muestra un mensaje usando `this.name`
function greet(greeting) {
   console.log(`${greeting}, ${this.name}`); // Usa `this.name` para obtener el nombre del contexto
}

// **Usando Apply**
// Llama a la función `greet` inmediatamente, vinculando el contexto a `person`
// Los argumentos se pasan como un array
greet.apply(person, ['Hi']); // Muestra: "Hi, Ana"

// **Usando Bind**
// Crea una nueva función `greetAna` donde el contexto siempre será `person`
// También establece un argumento fijo para el saludo: 'Hey'
const greetAna = greet.bind(person, 'Hey');
// Llama a la función vinculada
greetAna(); // Muestra: "Hey, Ana"

// **Usando Call**
// Llama a la función `greet` inmediatamente, vinculando el contexto a `person`
// Los argumentos se pasan directamente, no como un array
greet.call(person, 'Hello'); // Muestra: "Hello, Ana"
