import { useState } from 'react'

export default function ControlledValidationsOnSubmit() {
  // Estados de la consulta
  const [query, setQuery] = useState('')
  const [error, setError] = useState('')
  // Controla el envío
  const handleSubmit = (event) => {
    event.preventDefault()
    console.log({ query })
  }
  // Controla los cambios
  const handleChange = (event) => {
    const newQuery = event.target.value
    // Pre validación antes de setear el estado
    if (newQuery.startWith(' ')) return
    setQuery(newQuery)
    if (newQuery.trim() === '') {
      setError('Debes ingresar un valor')
      return
    }
    if (newQuery.length < 3) {
      setError('Debes teclear mínimo 3 caracteres')
      return
    }
    if (newQuery.match(/^\d+$/)) {
      setError('No se puede escribir caracteres')
      return
    }
  }
  return (
    <form onSubmit={handleSubmit}>
      <input onChange={handleChange} value={query} type='search' />
      <button type='submit'>Enviar</button>
    </form>
  )
}
