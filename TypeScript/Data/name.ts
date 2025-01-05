let name = 'Cristo';      // `let` no afecta al objeto global
console.log(name);        // Output: 'Cristo'
console.log(window.name); // Output: '' (no sobrescribe la propiedad global)

const Person = {
    name: 'Cristo'
}