const array = [1, 3, "a"];
const objectList = [
  { nombre: "Crista", edad: 31 },
  { nombre: "Criste", edad: 32 },
  { nombre: "Cristi", edad: 33 },
];

console.log(array.some((valor) => valor === "a"));                  // Devuelve true o false
console.log(objectList.some((valor) => valor.nombre === "Crista")); // Devuelve true o false
