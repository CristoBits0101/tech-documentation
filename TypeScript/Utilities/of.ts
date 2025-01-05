/**
 * typeof     -> Para tipos (boolean, string, number...)
 * instanceof -> Para instancias (date...)
 */

function createAddress() {
    return {
        planet: 'Tierra',
        city: 'Madrid'
    }
}

// Crea un type obteniendo las propiedades del retorno
type AddressReturn = ReturnType<typeof createAddress>
