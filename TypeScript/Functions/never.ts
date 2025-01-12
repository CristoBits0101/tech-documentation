// Never significa que la función nunca retorna.
const showError = (error: string): never => {
    throw new Error(error)
}
