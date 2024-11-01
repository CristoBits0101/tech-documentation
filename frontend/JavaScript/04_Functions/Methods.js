const person = { name: 'Ana' }

function greet(greeting) {
  console.log(`${greeting}, ${this.name}`)
}

/**
 * This receives person
 * Greeting receives 'hi', 'Hey', 'Hello'
 */

// Apply
greet.apply(person, ['Hi'])

// Bind
const greetAna = greet.bind(person, 'Hey')
greetAna()

// Call
greet.call(person, 'Hello')
