const objectList = [
  { nombre: "Crista", edad: 31 },
  { nombre: "Criste", edad: 32 },
  { nombre: "Cristi", edad: 33 },
];

const sumaEdades = objectList.reduce(
  (acumulador, persona) => acumulador + persona.edad, // Suma las edades de las personas.
  0                                                   // Valor inicial opcional.
);

console.log(sumaEdades);                              // 96
