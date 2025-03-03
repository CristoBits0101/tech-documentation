# Patrón de diseño módulo

- .js -> CommonJS
- .mjs -> ES modules
- .cjs -> CommonJS

# Semantic version

- x: Rompe la compatibilidad con la versión anterior
- y: Nuevas funcionalidades
- z: Solución de bugs

# Instalar un paquete de node

- Copiar el comando desde npm
- Importar la librería
- Comprobar el package.json

- Cada dependecia puede tener sus propias dependencias

# JavaScript style guide, linter and formatter

npm install standard -D

+

"devDependencies": {
    "standard": "^17.1.0"
},
"eslintConfig": {
    "extends": "standard"
}

+

- ESLint extension for Visual Studio
