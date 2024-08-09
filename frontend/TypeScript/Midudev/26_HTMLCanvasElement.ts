const canvas = document.createElement('canvas')

/**
 * Si lo encuentra devuelte HTMLElement
 * Si no lo encuentra devuelve null
 * Para saber si es canvas usar la propiedad HTMLCanvasElement
 * HTMLCanvasElement es porque canvas no es un elemento HTML
 */
if (canvas instanceof HTMLCanvasElement) {
    const ctx = canvas.getContext('2d');
}
