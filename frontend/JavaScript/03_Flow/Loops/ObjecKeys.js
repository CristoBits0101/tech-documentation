let objeto_a_iterar = [
  {
    name1: "Cristo",
    name2: "Rubén",
    apellido1: "Pérez",
    apellido2: "Suárez",
  },
  {
    name1: "Cristo2",
    name2: "Rubén2",
    apellido1: "Pérez2",
    apellido2: "Suárez2",
  },
];

let iterator1 = Object.keys(objeto_a_iterar[0]);

for (const propiedad1 of iterator1) {
  console.log("Soy el for of con el método keys");
  console.log(propiedad1, "\n");
}
