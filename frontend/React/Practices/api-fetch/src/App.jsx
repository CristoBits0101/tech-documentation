import { useEffect, useState } from "react"
import "./App.css"

function App() {
  const FACT_URL = "https://catfact.ninja/fact"
  const IMAGE_URL_PREFIX = "https://cataas.com/cat/says/"
  const IMAGE_URL = "https://cataas.com"

  // Paso 1)
  const [fact, setFact] = useState()
  const [imageUrl, setImageUrl] = useState()

  // Paso 2)
  useEffect(() => {
    fetch(FACT_URL)
      .then((response) => response.json())
      .then((json) => {
        const { fact } = json
        setFact(fact)
        const firstWord = fact.split(" ", 3)[0]
        fetch(`${IMAGE_URL_PREFIX}${firstWord}?size=50&color=red&json=true`)
          .then((response) => response.json())
          .then((response) => {
            const { url } = response
            setImageUrl(url)
          })
      })
  }, [])

  return (
    <>
      {/* Paso 3) */}
      <main>
        {fact && <p>{fact}</p>}
        {imageUrl && (
          <img
            src={`${IMAGE_URL}${imageUrl}`}
            alt={`Imagen generada usando la primera palabra de: ${fact}`}
          />
        )}
      </main>
    </>
  )
}

export default App
