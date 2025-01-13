import React from 'react'

export default function DefaultValues({
  age = 0,
  person = false,
  name = 'Unknown',
}) {
  return <div>DefaultValues</div>
}

/**
 * age es 1
 * person es true
 * name es undefined
 */
<DefaultValues age={1} person />
