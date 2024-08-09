// 3.1. Tipar parámetros para evitar que se infiera
function sum({ a, b }: { a: number, b: number }): number {
    return a + b;
}

// 3.2. Tipar retorno para evitar que se infiera
function sumResult({ a, b }: { a: number, b: number }): string {
    return a + b;
}

// 3.3. Tipar arrow function
const restar = (a: number, b: number): number => {
    return a - b
}
