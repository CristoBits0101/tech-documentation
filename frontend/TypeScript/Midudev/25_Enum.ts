// 25.1. Para tipar errores por ejemplo por si escribimos mal en el if
enum ERROR_TYPES {
    TYPE_ERROR = 'TYPE_ERROR',
    VALUE_ERROR = 'VALUE_ERROR',
    RANGE_ERROR = 'RANGE_ERROR'
}

const tipeOfError: ERROR_TYPES = ERROR_TYPES.TYPE_ERROR;

if (tipeOfError === ERROR_TYPES.TYPE_ERROR) {
    console.error('Ha ocurrido un error de tipo');
}

// 25.2. Con const si es para consumir por fuera del frontend mediante API
const enum ERROR_TYPES_TWO {
    TYPE_ERROR = 'TYPE_ERROR',
    VALUE_ERROR = 'VALUE_ERROR',
    RANGE_ERROR = 'RANGE_ERROR'
}
