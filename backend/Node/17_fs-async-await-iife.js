// 1) Módulo para el sistema de ficheros
const { fs } = require("node:fs/promises");

(
    async () => {

        // 2) Lectura del fichero y muestra su contenido
        const data = await fs("./data.txt", "utf8");

        // 3) Mostrar el contenido del fichero
        console.log(data);

    }
)();

// Note: Awiat se puede usar dentro de funciones autoinvocadas
