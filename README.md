<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLE-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />

<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Pilas y Colas</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>03</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA DE PRESENTACIÓN:</td><td>05/06/2022</td><td>HORA DE PRESENTACIÓN: 11:55 pm</td><td colspan="3"></td>
</tr>
<tr><td colspan="3">INTEGRANTE(s):
<ul>
      <li><a href="https://github.com/fernandocoylaA">Fernando Jesús Coyla Alvarez</a></li>
			<li><a href="https://github.com/Icielo23">Valery Cielo Iquise Mamani</a></li>
			<li><a href="https://github.com/Mario-Chura">Mario Franco Chura Puma</a></li>
</ul>
</td>
<td>NOTA:</td><td colspan="2"></td>
</<tr>
<tr><td colspan="6">DOCENTE(s):
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tbody>
</table>
</div>
  

  
<div align="center"><h2> SOLUCIÓN Y RESULTADOS </h2></div>

### I.	SOLUCIÓN DE EJERCICIOS/PROBLEMAS
#	
   1. Pilas iguales (6 puntos) <br>
- Para este ejercicio se crearon las clases (Stack(interface),ExceptionIsEmpty(manejar excepciones),StackArray(contiene la implementacion de la pila))
- La clase StackArray contiene los metodos necesarios para manejar una Pila(Stack), agregando un metodo adicional que es summation stack que nos sirve para conocer la suma de los valores de la pila(valores enteros para este ejercicio).
```py
	public int summationStack(){
		int suma=0;
		for(int i=0;i<=this.tope;i++)
			suma+=(Integer)this.array[i];
		return suma;
	}
	
  ```
- El metodo equalStack se implemento desde la clase Ejercicio01, con las 3 pilas como parametros. El metodo mayorStack que se muestra en el bucle while se explica mas adelante
	
```py
// recibe a las 3 pilas como objetos de la clase StackArray
// se agrega a ExceptionIsEmpty por hacer uso del metodo pop() dentro de la funcion
 public static int equalStack(StackArray h1,StackArray h2,StackArray h3)throws ExceptionIsEmpty{		
	// ...				
        StackArray may; //"La Pila(stack) mayor"
        while(cond){
		//al mayor de los 3 se le quita un elemento con el metodo pop()	            
            	mayorStack(h1,h2,h3).pop(); 			
		// ...				
		//A continuacion se realiza la asignacion de los valores que tengan las sumas de las pilas	
            	s1=h1.summationStack();
            	s2=h2.summationStack();
            	s3=h3.summationStack();
	    	//La siguiente condicion funciona para concluir el bucle cuando la suma de los 3 sean iguales 	
            	if(s1 == s2 && s1 == s3){
                	cond=false;
            	}
        }
	//cuando el bucle finalize retornamos la altura que sera la suma de cualquiera de las 3 pilas
        altura = h1.summationStack();//los 3 tendran la misma altura
        return altura; //retorno de la altura
 }
```
- El metodo mayorStack que nos sirve para conocer a la pila con mayor suma de elementos, para retornar a dicho objeto
```py
//recibe a las 3 pilas como parametros
 public static StackArray mayorStack(StackArray h1,StackArray h2,StackArray h3) {
	//asignacion de los valores de la suma de las 3 pilas haciendo uso del metodo summationStack() de la clase StackArray.
        int s1 = h1.summationStack();
        int s2 = h2.summationStack();
        int s3 = h3.summationStack();
	//los siguientes condicionales simplemente para determinar al mayor de los 3
	//Al encontrarlo se retornara a la pila como objeto StackArray
        if(s1>s2){
            if(s1>s3){
                return h1;
            }else{
                return h3;
            }
        }else if(s2>s3){
            return h2;
        }else{
            return h3;
        }
 }
```
- El metodo pushElements que nos sirve para poder realizar push con valores ingresados desde consola.

   2. Pilas (6 puntos) <br>   

- Para este ejercicio se crearon 3 clases ( Node.java, pila.java, pruba_pila.java)
- En el archivo Node se establece los atributos "datos" de tipo genérico y "siguiente" de tipo Node con los siguientes métodos:
```py
	public Node<T> getsiguiente()
	
      	public void setsiguiente(Node<T> siguiente)
	
	public T getDato()
	
	public void setDato(T dato)
	
  ```
 - En la clase pila se colocó como atributos "root" el que hace referencia al nodo inicial y el atributo conteo, quien llevara la cuenta del número de elementos de mi pila, también se implementan los siguientes métodos:
 ```py
	// Se devolvera verdadero si la pila tiene cero elementos
	public boolean empty()
	
      	//Vaciamos toda la pila al declarar que root es igual a null
	public void vaciar()
	
	//Para insertar un elemento usamos el atributo root el cual es de tipo generico
	public void apilar( T dato )
	
	//Este metodo extrae el primer elemento de la pila si es que esta llena
    	public T desapilar ()
	
	//Este metodo me devuelve el primer elemento de la pila si es que esta llena
    	public T primero ()
  ```
 - Por último, se creó el método "Prueba_pila.java" para probar estos métodos descritos anteriormente, en la ejecución obtenemos los siguientes resultados:
 ```py
	==> Apilamos 10 numeros del 1 al 10
	[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
	==> Desapilamos el ultimo en ingresar
	[9, 8, 7, 6, 5, 4, 3, 2, 1]
	==> Preguntamos si esta vacia la pila
	false
	==> Preguntamos cual es el primer numero en la pila
	9
	==> Vaciamos la pila
	[]
	==> Preguntamos si esta vacia la pila
	true
  ```
-
   #
   3. Colas (6 puntos) <br>
   #
   
#

### II.	SOLUCIÓN DEL CUESTIONARIO
#
- ¿Qué similitudes hay entre una Lista Enlazada y una Pila? ( 1 pt) <br>
Respuesta.
#
- ¿En que casos seria favorable/desfavorable utilizar Pila/Cola? ( 1 pt)<br>
Respuesta.
#

### III.	CONCLUSIONES
#
-De lo desarrollado en el presente laboratorio pudimos aprender que las listas son estructuras de datos que nos permiten almacenar y recuperar los datos de modo que el primer elemento en ingresar es el primero en salir, de este modo podemos identificar 3 operaciones básicas: apilar, desopilar y comprobar si la lista esta vacía. <br>
-Conclusion 2 <br>
-Conclusion 3 <br>
-Conclusion 4 <br>
-Conclusion 5 <br>
#
<div align="center"><h2>  RETROALIMENTACIÓN GENERAL </h2></div> <br>

<div align="center"><h2> REFERENCIAS Y BIBLIOGRAFÍAL </h2></div> <br>

-   https://www.w3schools.com/java/default.asp
-   https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
-   http://www.it.uc3m.es/java/2012-13/units/pilas-colas/guides/4/guide_es_solution.html
-   4
