export default function UncontrolledValidationsFormData() {
  // 2. Manejar el envío sin preventDefault
  const handleSubmit = (event) => {
    // 3. Evitar el envío del formulario
    event.preventDefault()
    // 4. Obtener el valor del input
    const { query } = Object.fromEntries(new window.FormData(event.target))
    alert(query)
  }
  return (
    // 1. Crear control de envío
    <form onSubmit={handleSubmit}>
      <input type='search' />
      <button type='submit'>Enviar</button>
    </form>
  )
}
