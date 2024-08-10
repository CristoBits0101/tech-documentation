// Declaración
class Avenger {

    name: string;
    powerScore: number;

    constructor(name: string, powerScore: number) {
        this.name = name;
        this.powerScore = powerScore;
    }

    get fullName(): string {
        return `${this.name} - ${this.powerScore} points`;
    }

    set power(value: number) {
        if (value < 0) {
            throw new Error('Power score cannot be negative.');
        }
        this.powerScore = value;
    }
    
}

// Instanciación
const avengers: Avenger[] = [
    new Avenger('Thor', 1000),
    new Avenger('Hulk', 800),
    new Avenger('Captain America', 700)
];
