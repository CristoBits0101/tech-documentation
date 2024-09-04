/**
 * Node usa el patrón de diseño module
 * .js  -> CommonJS
 * .mjs -> ES modules
 * .cjs -> CommonJS
 */
const sum = (...params) => {
  return params.reduce(
    (acumulador, valorActual) => acumulador + valorActual,
    0
  );
};

module.exports = sum;          // Versión 1
module.exports = { sum: sum }; // Versión 2
