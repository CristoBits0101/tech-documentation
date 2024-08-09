const canvas = document.createElement('canvas') as HTMLCanvasElement;

/**
 * Si lo encuentra devuelte HTMLElement
 * Si no lo encuentra devuelve null
 * Para saber si es canvas usar la propiedad HTMLCanvasElement
 * HTMLCanvasElement es porque canvas no es un elemento HTML
 */
if (canvas !== null) {
    const ctx = canvas.getContext('2d');
}
