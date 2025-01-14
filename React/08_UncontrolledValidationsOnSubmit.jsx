export default function UncontrolledValidationsOnSubmit() {
  // 1. Crear una referencia
  const inputRef = React.useRef()
  // 4. Manejar el envío sin preventDefault
  const handleSubmit = (event) => {
    // 5. Evitar el envío del formulario
    event.preventDefault()
    // Versión 1
    const value = inputRef.current.value
    alert(value)
    // Versión 2
    const inputElement = inputRef.current
    const inputValue = inputElement.value
    alert(inputValue)
  }
  return (
    <form onSubmit={handleSubmit}>
      {/* 2. Asignar una referencia */}
      <input type='search' ref={inputRef} />
      {/* 3. Crear control de envío */}
      <button type='submit'>Enviar</button>
    </form>
  )
}
