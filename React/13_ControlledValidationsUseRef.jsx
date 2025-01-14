import { useState } from 'react'

export default function ControlledValidationsUseRef() {
  // Estados
  const [search, setSearch] = useState('')
  const [error, setError] = useState('')
  // Referencia boleana
  const isFirstRender = useRef(true)
  // Controladores
  const handleSubmit = (event) => {
    event.preventDefault()
    console.log({ search })
  }
  const handleChange = (event) => {
    const newSearch = event.target.value
    if (newSearch.startsWith()) return
    setSearch(event.target.value)
  }
  // Efectos
  useEffect(() => {
    if (isFirstRender.current) {
      isFirstRender.current = search === ''
      return
    }
    if (search.trim() === '') {
      setError('Debes ingresar un valor')
      return
    }
    if (search.length < 3) {
      setError('Debes teclear mínimo 3 caracteres')
      return
    }
    if (search.match(/^\d+$/)) {
      setError('No se puede escribir caracteres')
      return
    }
  }, [search])
  // Componente
  return (
    <form onSubmit={handleSubmit}>
      <input onChange={handleChange} value={search} type='search' />
      <button type='submit'>Enviar</button>
    </form>
  )
}
