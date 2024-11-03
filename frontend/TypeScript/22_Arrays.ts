// 22.1. Arrays estructura no valida
const language = [] // Declaras un array never que siempre está vacío

language.push('Javascript')

// 22.2. Arrays con tipos estructurados
const languageTwo: string[] = []        // Opción a
const languageThree: Array<string> = [] // Opción b

languageTwo.push('Javascript')

// 22.3. Arrays con varios tipos
const languageFour: string[] | number[] = [] // Solo puede ser de string o de números
const languageFive: (string | number)[] = [] // Puede almacenar string o números

// 24.4. Arrays de typos
const languageSix: Hero[] = []
