// 18.1. Interception types combina varios objetos con sus tipos (AND)
type HeroBasicInfo = {
    name: string,
    age: number,
}

type HeroProperties = {
    readonly id?: HeroId,
    isActive?: boolean
    powerScale?: HeroPowerScale,
}

type HeroFusion = HeroBasicInfo & HeroProperties
