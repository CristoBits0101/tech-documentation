// 1. Parse: Convertir entre tipos de datos
let a = 5                                // Número
let b = '5'                              // Cadena representando un número
let c = '0x35b345by'                     // Cadena con formato hexadecimal inválido

let d = Number(b) * 6                    // Convierte la cadena a número y multiplica
let e = parseInt(b) * 6                  // Convierte a entero y multiplica
let f = parseFloat(b) * 6                // Convierte a flotante y multiplica
let g = parseInt(c)                      // Convierte solo la parte inicial válida de la cadena a entero
let h = a.toString()                     // Convierte un número a cadena

// 2. Limit: Valores límites y precisión en números
let minimum = Number.MIN_VALUE           // El número positivo más pequeño representable
let maximum = Number.MAX_VALUE           // El número más grande representable
let precision = Number.EPSILON           // Diferencia mínima entre dos números representables

// 3. Round: Redondear números
let i = 1                                // Número entero
let j = 0.111111                         // Número pequeño
let k = 99.2323                          // Número con decimales

const closeInteger = Math.round(i + j)   // Redondea al entero más cercano
const quantityNumbers = j.toPrecision(2) // Representa el número con dos cifras significativas
const quantityDecimals = k.toFixed(2)    // Redondea a dos decimales y lo convierte en cadena
