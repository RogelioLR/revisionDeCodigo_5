# Práctica de Revisión de Código de Otros 5.

## Objetivo del Código:

Dado un número entero introducido por el usuario, se debe establecer si tal número es afortunado o 
no lo es. El algoritmo analiza cada dígito del número ingresado, de izquierda a derecha, si tal 
dígito es igual a 3,7,8 o 9, se le asigna un punto una variable denominada **afortunado**, en otro caso 
se le asigna un punto a la variable denominada **no_afortunado**. Finalmente, el número introducido por 
el usuario es afortunado si la diferencia (afortunado-no_afortunado) es **positiva**.

## Cambios Realizados:

* Se crea el método **main**
* Se configura la clase Scanner para recibir un número entero por parte del usuario.
* Se separa el bucle **while** del bloque condicional **if-else**
* Se define de manera correcta la obtendión de la variable **digito**
* Se usan nombres más descriptivos en las variables.

