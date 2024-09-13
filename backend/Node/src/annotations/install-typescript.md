# 1) Crea una carpeta para el proyecto

    👉 mkdir folder_name
    👉 cd folder_name

# 2) Inicializa el proyecto de Node.js

    👉 npm init -y

# 3) Instala TypeScript y los tipos necesarios

    👉 npm install typescript ts-node @types/node --save-dev

<!--
    👉 typescript: El compilador de TypeScript.
    👉 ts-node: Permite ejecutar archivos TypeScript directamente sin necesidad de compilarlos.
    👉 @types/node: Define los tipos para las bibliotecas internas de Node.js.
-->

# 4) Crea el archivo de configuración de TypeScript (tsconfig.json)

    👉 npx tsc --init

# 5) Crea la estructura de carpetas

    👉 mkdir src

# 6) Escribe un archivo TypeScrip

    👉 touch src/index.ts

# 7) Ejecutar el proyecto

    👉 npx ts-node src/index.ts

# 8) Compilar el proyecto

    👉 npx tsc

# 8) Para ejecutarlo con Node.js:

    👉 node dist/index.js

# 9) Añadir scripts en package.json

<!--
    {
        "scripts": {
            "start": "node dist/index.js",  // Ejecutar el proyecto compilado
            "build": "tsc",                 // Compilar el proyecto
            "dev": "ts-node src/index.ts"   // Ejecutar en modo desarrollo sin compilar
        }
    }
-->
