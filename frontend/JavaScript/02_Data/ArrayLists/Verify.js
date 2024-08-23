const array = [1, "1", null, undefined, false];

console.log(array.every(valor => valor !== null));      // False

console.log(
    array.every(
        valor => typeof valor === "number" && valor > 0 // False
    )
);
