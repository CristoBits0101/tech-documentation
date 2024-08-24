const miSet = new Set();   // Crear un array de valores irrepetibles.

miSet.add(1);              // Agregar elementos al conjunto.
miSet.add(2);
miSet.add(3);
miSet.add(2);              // No se agregarán duplicados
miSet.delete("pepa");      // Borrar.
miSet.clear();             // Borrar todos los datos.
miSet.has(3);              // Saber si incluir un dato y devolver un verdadero o falso.
miSet.size();              // Conocer la longitud del conjunto y devolver un verdadero o falso.

console.log(miSet.has(2)); // Verificar si un elemento existe.
console.log(miSet.size);   // Obtener el tamaño del conjunto
