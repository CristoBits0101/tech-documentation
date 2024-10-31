// Parse
let a = 5
let b = '5'
let c = '0x35b345by'

let d = Number(b) * 6
let e = parseInt(b) * 6
let f = parseFloat(b) * 6
let g = parseInt(c)
let h = a.toString()

// Limit
let minimum = Number.MIN_VALUE
let maximum = Number.MAX_VALUE
let precision = Number.EPSILON

// Round
let i = 1
let j = 0.111111
let k = 99.2323

console.log(Math.round(i + j))
console.log(j.toPrecision(2))
console.log(k.toFixed(2))

// Type
console.log(typeof a)
console.log(isNaN(a))
