export const sum = (...params) => {
  return params.reduce(
    (acumulador, valorActual) => acumulador + valorActual,
    0
  );
};
