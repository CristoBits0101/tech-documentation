// 1) Módulo para el sistema de ficheros
import { fs } from "node:fs/promises";

// 2) Lectura del fichero y muestra su contenido
const data = await fs("./data.txt", "utf8");

// 3) Mostrar el contenido del fichero
console.log(data);

/**
 * Note:
 * Awiat solo funciona con .mjs -> ES modules o con funciones autoinvocadas
 * Realiza los procesos de manera secuencial los lee en orden y espera la respuesta
 * La diferencia con las sincrónas es que no bloquea el programa
 */
