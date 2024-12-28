class Constructor {
  name
  _age
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
  color
  constructor(name, age, country, color) {
    super(name, age, country)
    this.color = color
  }

  static get color() {}
  static set color(value) {
    if (value === 'white' || value === 'black') this._color = value
    else throw new Error('Color must be either white or black.')
  }
}

color(red)
