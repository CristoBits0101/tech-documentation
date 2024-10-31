// Test 1
let array = new Array()

array.unshift('I am the new value') // Añadir un valor inicial.
array.push('I am the new value')    // Añadir un valor al final.

console.log(array.map((element) => element))
array.forEach((element) => console.log(element))

// Test 2
let arrayTwo = [undefined, null, true, 1, '1']
console.log(arrayTwo)

// Test 3
arrayTwo.forEach((element, index) => console.log(element, index))

// Test 4
arrayTwo.unshift("first")
arrayTwo.push("last")
arrayTwo.forEach((element, index) => console.log(element, index))
