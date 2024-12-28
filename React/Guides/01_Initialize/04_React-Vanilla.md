# PASO 1) Crear un proyecto sin dependencias:

-> CMD
-> npm create vite@latest
-> Vanilla
-> JavaScript

# PASO 2) Plugin para crear el punto de entrada:

-> npm install @vitejs/plugin-react -E

# PASO 3) Intalar las dependencias de React:

-> npm install react react-dom -E (react/library, react-dom/browser)

# PASO 4) Configurar Vite

-> vite.config.js
-> import {defineConfig} from "vite"
-> import react from "@vitejs/plugin-react"
-> export default defineConfig({ 
        plugins: [react()]
   })

# PASO 5) Configurar el punto de entrada en el primer archivo que carga la aplicación

-> import { createRoot } from 'react-dom/client'
-> import { App } from './src/App.jsx'

-> const root = createRoot(document.getElementById('app'))

-> root.render(<App />)

# PASO 6) Cambiar js a jsx en el Main

# PASO 7) Instalar el linter

-> npm install standard -D
-> Open packeage.json
-> Add: "eslintConfig": {
    "extends": "standard"
}
-> npm run lint:standard