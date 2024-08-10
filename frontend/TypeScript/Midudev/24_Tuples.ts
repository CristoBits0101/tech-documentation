/**
 * Array de 3 posiciones en cada una tiene que ir un número
 * La diferencia con un array de números es que limita las posiciones
 */

// 24.1. Definición de tupla
// type RGB = [number, number, number]

const black: RGB = [0, 0, 0]

// 24.2. Esto no se debería	hacer la tupla ahora tiene 4 posiciones
black.push(4)

// 24.3. Con readonly se soluciona
type RGB = readonly [number, number, number]
