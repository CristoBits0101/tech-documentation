const array = [
  { nombre: "Crista", edad: 31 },
  { nombre: "Criste", edad: 32 },
  { nombre: "Cristi", edad: 33 },
];

console.log(array.filter((property) => property.edad > 32));        // Retorna el primer elemento que cumple la condición.
console.log(array.find((element) => element.nombre === "Cuenca"));  // Retorna el primer elemento que cumple la condición.
console.log(array.slice(2, 3));                                     // Retorna la posición 2 del array.
