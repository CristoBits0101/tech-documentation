// 10.1. Función que nunca devuelve nada, void si podría pero no le importa
const showError = (error: string): never => {
    throw new Error(error)
}
