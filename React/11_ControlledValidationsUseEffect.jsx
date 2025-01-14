import { useState } from 'react'

export default function ControlledValidationsUseEffect() {
  // Estados de la consulta
  const [query, setQuery] = useState('')
  const [error, setError] = useState('')
  // Controla el envío
  const handleSubmit = (event) => {
    event.preventDefault()
    console.log(query)
  }
  // Controla los cambios
  const handleChange = (event) => {
    setQuery(event.target.value)
  }
  // Controla las validaciones
  useEffect(() => {
    if (query.trim() === '') {
      setError('Debes ingresar un valor')
      return
    }
    if (query.length < 3) {
      setError('Debes teclear mínimo 3 caracteres')
      return
    }
    if (query.match(/^\d+$/)) {
      setError('No se puede escribir caracteres')
      return
    }
  }, [query])
  return (
    <form onSubmit={handleSubmit}>
      <input onChange={handleChange} value={query} type='search' />
      <button type='submit'>Enviar</button>
    </form>
  )
}
