// 32. Typar matrices con Union types
type CellValue = 'X' | 'O' | ''        // El tipo de string que puede tener en cada posición
type GameBoard = [                     // Cantidad de posiciones que tiene la matriz, es una tupla
    [CellValue, CellValue, CellValue],
    [CellValue, CellValue, CellValue],
    [CellValue, CellValue, CellValue]
]

const gameBoard: GameBoard[][]         // Inicialización 