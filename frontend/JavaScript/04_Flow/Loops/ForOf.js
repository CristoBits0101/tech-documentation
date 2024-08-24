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

for (let propiedadDelObjeto of objeto_a_iterar) {
  console.log("Soy el for of");
  console.log(propiedadDelObjeto);
}

