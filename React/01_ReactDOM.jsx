// 1. Importar las librerías
import React from 'https://esm.sh/react-dom@18.2.0'
import ReactDOM from 'https://esm.sh/react-dom@18.2.0/client'

// 2. Obtener el div con el id app
const appDomElement = document.getElementById('app')

// 3. Crear una raíz de React para gestionar el renderizado
const root = ReactDOM.createRoot(appDomElement)

/**
 * 4.0. Crear un element con React
 * 4.1. Elemento
 * 4.2. Atributo
 * 4.3. Envoltorio
 */
const button1 = React.createElement('button', { 'data-id': 123 }, 'Me gusta')
const button2 = React.createElement('button', { 'data-id': 456 }, 'Me gusta')
const button3 = React.createElement('button', { 'data-id': 789 }, 'Me gusta')

// 5. Envolver en un solo elemento
const app = h(React.Fragment, null, [button1, button2, button3])

// 6. Renderizar contenido en la raíz creada
root.render('<button>Sin React se renderiza un texto</button>')

// 7. Remplaza el contenido anterior
root.render(app)
