const person = { name: 'Ana' }

function greet(greeting) {
// console.log(`${'hi', 'Hey', 'Hello'}, ${person.name}`)
   console.log(`${greeting            }, ${this.name  }`)
}

// Apply
greet.apply(person, ['Hi'])

// Bind
const greetAna = greet.bind(person, 'Hey')
greetAna()

// Call
greet.call(person, 'Hello')
