let array = new Array();

array.push("I am the new value");    // Añadir un valor al final.
array.unshift("I am the new value"); // Añadir un valor inicial.

console.log(array.map((element) => element));
array.forEach((element) => console.log(element));
