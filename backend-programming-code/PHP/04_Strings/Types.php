<?php

    $var = "Paco"          ; // Cadena con comillas dobles.

    echo " Hola $var\n"    ; // Cadena con comillas dobles y variable dentro.

    echo "'Hola $var\n'"   ; // Cadena con comillas dobles y comillas simple + variable dentro.

    echo " Hola ".$var."\n"; // Cadena con comillas dobles y variable concatenada.

    echo ' Hola $var'."\n" ; // Cadena con comillas simple y variable dentro que se toma como parte de la cadena.

    echo ' Hola '.$var."\n"; // Cadena con comillas simple y variable concatenada.
    
?>