<!--

    import React, { useState, useEffect } from "react"
    import "./App.css"

    export default function App() {
        const [show, setShow] = useState(true)
        return (
            <>
            <button onClick={() => {setShow(false)}}>
                Stop showing
            </button>
            {show ? <MouseColor /> : null}
            </>
        )
    }

    function MouseColor() {
        const [color, setColor] = useState("Yellow")
        useEffect(()=>{
            function onMouseMove(event) {
            if (event.clientX < window.innerWidth / 2)
                setColor("Yellow")
            else
                setColor("blue")
            }
            window.addEventListener('mousemove', onMouseMove)
            console.log('Running')
            return () => {
            window.removeEventListener('mousemove', onMouseMove)
            console.log('Cleaning')
            }
    }, [])

    // console.log("📣 Rendering")
    return <div style={{height: "100vh", background: color}}></div>
    }

-->
