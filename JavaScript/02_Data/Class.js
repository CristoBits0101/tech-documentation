class Constructor {
  // public
  name
  // private
  _age
  // protected
  #country

  constructor(name, age, country) {
    this.name = name
    this._age = age
    this.#country = country
  }

  get name() {
    return this._name
  }

  set name(value) {
    this._name = value
  }

  get age() {
    return this._age
  }

  set age(value) {
    if (value > 0) this._age = value
    else throw new Error('Age must be positive.')
  }

  get country() {
    return this.#country
  }

  set country(value) {
    this.#country = value
  }
}

class Peon extends Constructor {
  _color

  constructor(name, age, country, color) {
    super(name, age, country)
    this.color = color
  }

  get color() {
    return this._color
  }

  set color(value) {
    if (value === 'white' || value === 'black') this._color = value
    else throw new Error('Color must be either white or black.')
  }
}

// Ejemplo de uso
try {
  const peon1 = new Peon('Cristo', 30, 'USA', 'white')
  console.log(peon1.name)
  console.log(peon1.color)

  const peon2 = new Peon('Juan', 25, 'Spain', 'black')
  console.log(peon2.color)
  peon2.color = 'red'
} catch (error) {
  console.error(error.message)
}
