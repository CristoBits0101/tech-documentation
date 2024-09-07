// 1) Exportando la función sum
export const sum = (...params) => {
  return params.reduce((acumulador, valorActual) => acumulador + valorActual, 0)
}
