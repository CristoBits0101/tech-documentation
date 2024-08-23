const miSet = new Set();   // Crear un array de valores irrepetibles.

miSet.add(1);              // Agregar elementos al conjunto.
miSet.add(2);
miSet.add(3);
miSet.add(2);              // No se agregarán duplicados

console.log(miSet.has(2)); // Verificar si un elemento existe.

miSet.delete(3);           // Eliminar un elemento.

console.log(miSet.size);   // Obtener el tamaño del conjunto
