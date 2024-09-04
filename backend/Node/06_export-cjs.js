// 1) Código que se exporta
const sum = (...params) => {
  return params.reduce(
    (acumulador, valorActual) => acumulador + valorActual,
    0
  );
};

// 2) Exportando la función sum
module.exports = { sum: sum };
