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
      .then((response) => {
        if (!response.ok)
          throw new Error(`HTTP error! status: ${response.status}`)
        response.json();
      })
      .then((json) => {
        const { fact } = json
        setFact(fact)
      })
      .catch((error) => console.error("Error fetching fact:", error))
  }, [])

  // Paso 3)
  useEffect(() => {
    if (!fact) return
    const firstWord = fact.split(" ")[0]
    fetch(`${IMAGE_URL_PREFIX}${firstWord}?size=50&color=red&json=true`)
      .then((response) => response.json())
      .then((response) => {
        const { url } = response
        console.log("Image URL:", `${IMAGE_URL}${url}`)
        setImageUrl(`${IMAGE_URL}${url}`)
      })
      .catch((error) => console.error("Error fetching image:", error))
  }, [fact])

  return (
    <>
      {/* Paso 4) */}
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
