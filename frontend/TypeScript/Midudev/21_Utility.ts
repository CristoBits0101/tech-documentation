// 26. Utility
function createAddress() {
    return {
        planet: 'Tierra',
        city: 'Madrid'
    }
}

// Crea un type obteniendo las propiedades del retorno
type AddressReturn = ReturnType<typeof createAddress>
