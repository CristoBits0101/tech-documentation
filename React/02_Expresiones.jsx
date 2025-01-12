import React from 'react';

export default function Expresiones() {
  const name = 'John Doe';
  // Devuelve un valor
  return <div>{name}</div>;
}

export default function Declaración() {
  // Error: solo se evalúan expresiones
  // return <div>{if (condition) {}}</div>
}
