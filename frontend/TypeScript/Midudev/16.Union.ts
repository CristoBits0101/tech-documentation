/**
 * Para crear un estandar de tipos parecido a los enumerados
 * Con valor variable 
 * Solo estructural
 */

// 16.1. Template union types 
type HeroId = `${string}-${string}-${string}-${string}-${string}`
type hexadecimalColor = `#${string}`

type HeroSummaryThree = {
    id: HeroId
    name: 'Spiderman',
    readonly age?: 25
}

// 16.2. Union types seria como un enum
type HeroPowerScale = 'low' | 'medium' | 'high'
