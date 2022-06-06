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
- En el desarrollo de los ejercicios nuestras carpetas de trabajo se distribuyen de la siguiente manera:
    ```py
	   └|──EDA-22A-GrupoE01-Lab03
	    |
	    ├───Ejercicio01
	    │       Ejercicio1.java
	    │       ExceptionIsEmpty.java
	    │       Stack.java
	    │       StackArray.java
	    │
	    ├───Ejercicio_02_Pilas
	    │       Node.java
	    │       Prueba_Pila.java
	    │       pila.java
	    │
	    |───Ejercicio03
	    |    Node.java
	    |    Queue.java
	    |    Test.java
	    |
	    |___README.md
    ```
#
   1. Pilas iguales (6 puntos) <br>
- Para este ejercicio se crearon las clases (Stack(interface), ExceptionIsEmpty(manejar excepciones),  StackArray(contiene la implementacion de la pila))
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
```py
//este metodo esta siendo usado en el metodo main() para que se ingresen los valores de la pila por consola
 public static void pushElements(StackArray h,int t){
    //...
	//se hace uso de un bucle for para ingresar los valores de la pila segun su tamaño
        for(int i=0;i<t;i++){
            System.out.println("Ingrese valor: ");
            n=sc.nextInt();
            h.push(n); //se realiza el push del valor a la pila
        }
         
 }
```
- Desde el metodo main de la clase Ejercicio01 se hace aplicacion del ejercicio
```py
 public static void main(String[] args){
    //...
	//creamos a las 3 pilas
	//el tamaño de las pilas son ingresadas por consola
	
        StackArray<Integer> pila1 = new StackArray<Integer>(t1);
        StackArray<Integer> pila2 = new StackArray<Integer>(t2);
        StackArray<Integer> pila3 = new StackArray<Integer>(t3);
        try{
	// se ingresan por consola los elementos de cada pila y se muestran en conjunto
            System.out.println("PILA-1");
            pushElements(pila1, t1);
            System.out.println("Lista pila-1");
            System.out.println(pila1);
	//Se realiza los mismo para las demas pilas ...
	//...
	// Al valor entero que retorna el metodo equalStack() se asigna a la variable valor
            int valor = equalStack(pila1, pila2, pila3);
	    //se muestra la altura en consola
            System.out.println("Altura de las pilas igualadas:"+valor);

        }catch(ExceptionIsEmpty x){ //aqui se hace uso la clase ExceptionIsEmpty para el manejo de excepciones
            System.out.println(x.getMessage());
        }                   
 }
```
- Resultados al ejecutar Ejercicio01.java, se mostrara lo que sale en consola de manera abreviada para no extender el informe
```py
//solicita el tamaño de cada pila
Ingrese tamaño de la pila-1: 5
Ingrese tamaño de la pila-2: 3
Ingrese tamaño de la pila-3: 4
PILA-1
Ingrese valor: 
1
Ingrese valor: 
1
Ingrese valor: 
1
Ingrese valor: 
2
Ingrese valor: 
3
Lista pila-1
1, 1, 1, 2, 3, //muestra la lista de la pila
PILA-2
//se ingresan valores de pila2 ..
Lista pila-2
2, 3, 4, //muestra la lista de la pila
PILA-3
//se ingresan valores de pila2 ..
Lista pila-3
1, 4, 1, 1, //muestra la lista de la pila
//se muestra las sumas iniciales de cada pila
-------Sumas Iniciales--------------
suma pila 1: 8
suma pila 2: 9
suma pila 3: 7
------------------
//a continuacion se muestra la suma de cada pila luego de realizar el pop() a la pila mayor
suma p1:8
suma p2:5
suma p3:7
--------------
suma p1:5
suma p2:5
suma p3:7
--------------
suma p1:5
suma p2:5
suma p3:6
--------------
suma p1:5
suma p2:5
suma p3:5
--------------
//se concluye cuando las 3 pilas llegan a una misma altura
Altura de las pilas igualadas:5
```
#
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
 - Por último, se creó la clase "Prueba_pila.java" para probar estos métodos descritos anteriormente, en la ejecución obtenemos los siguientes resultados:
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
  - En la clase Queue.java se crearon los siguientes métodos para la cola su funcionalidad se describe en los comentarios:
 ```py
	//Añade un elemento a Queue sin sobrepasar la capacidad de la cola
	public boolean offer(E e){
	
      	//Funciona igual que offer() con la diferencia que muestra un mensaje de limite maximo alcanzado
	public boolean add(E e){
	
	//peek() : Recupera, pero no elimina, la cabeza de esta cola, o devuelve null si esta cola está vacía.
	 public E peek(){
	
	//element(): Este método difiere de peek() sólo en que lanza un mensaje si esta cola está vacía.
    	 public E element(){
	
	//poll(): Devuelve y elimina la cabeza de esta cola, o devuelve null si esta cola está vacía.
    	public E poll(){
	
	//remove(): Este método difiere del poll() sólo en que lanza una mensaje si esta cola está vacía.
	public E remove(){
  ```
 - Se creo la clase "Test.java" para ejecutar los resultados, se obtuvo lo siguiente:
 ```py
	==> Añadiendo valores a la cola <==
	15
	20
	25
	==> Agregamos un elemento mas a la cola superando el limite <==
	Limite maximo alcanzado
	==> Removemos elemento de la cola <==
	==> Llamamos a la nodo de la cola  <==
	20
	==> Removemos elemento de la cola <==
	==> Llamamos a la nodo de la cola  <==
	25
	==> Removemos elemento de la cola <==
	==> Llamamos a nodo cola, como esta vacia sale el sig. mensaje <==
	La cola esta vacia
	==> Eliminamos elementos, como esta vacia sale el sig. mensaje <==
	La cola esta vacia
  ```
   
#

### II.	SOLUCIÓN DEL CUESTIONARIO
#
- ¿Qué similitudes hay entre una Lista Enlazada y una Pila? ( 1 pt) <br>
Respuesta.
	- Las listas enlazadas permiten trabajar con todos sus elementos, al contrario de la Pila que es limitado porque solo permite trabajar con el primer elemento insertado eliminando los ultimos que estan en el Tope. 
#
- ¿En que casos seria favorable/desfavorable utilizar Pila/Cola? ( 1 pt)<br>
Respuesta.
#

### III.	CONCLUSIONES
#
-De lo desarrollado en el presente laboratorio pudimos aprender que las listas son estructuras de datos que nos permiten almacenar y recuperar los datos de modo que el primer elemento en ingresar es el primero en salir, de este modo podemos identificar 3 operaciones básicas: apilar, desopilar y comprobar si la lista esta vacía. <br>
-Este laboratorio nos a servido como practica de lo aprendido en teoria, terminar de comprender lo que son las pilas y las colas, y como estas se pueden implementar haciendo uso de memoria estatica con Arrays y memoria dinamica con list. Para este caso en el ejercicio01 la pila se implemento con el uso de memoria estatica con Arrays<br>
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
