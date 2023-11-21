//1 .- Obtén del 1 al 255
function a(){  
var arr=[];
for(i=1;i<256;i++){
    arr.push(i);
    }
    return arr
} 
//
//2 .- Obtener cantidad de numeros pares del 1 al 1000
function par() {
    var arr=[]
    for( i=1;i<=1000;i++){
     if (i % 2 === 0) {
            arr.push(i);
             }
        }
    return arr
}
//3.- Suma impares hasta 5000
function impares(){
    let sum=0
    for (i=1;i<=5000;i++){
        if(i%2!==0){
            sum+=i
        }  
    }
    return sum
}
//4.- Itera un array:
function suma(arr){
    let sum=0
    for(i=0;i<arr.length;i++){
        sum+=arr[i]
    }
    return sum
}
//5.-Encuentra el mayor (max)
function mayor(arr){
    let max=arr[0]
    for(i=0;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
         }
    }
    return max;
}
//6.-Encuentra el promedio (avg)
function promedio(arr){
    let avg=arr[0]
    let sum = 0
    for(i=0;i<arr.length;i++){
         sum = sum+arr[i]
    }
    avg=sum/arr.length
    return avg
}
//7.-Array de impares: Escribe una función que devuelva un array de todos los números impares entre 1 y 50
function sumOdd(){
    let arr=[]
    for(i=1;i<50;i++){
        if (i % 2 !== 0)
        arr.push(i)
    }
    return arr
}
//8.- Mayor que Y: Dado un valor Y, escribe una función que toma un array y devuelve los valores mayores que Y. Por ejemplo, si arr = [1,3,5,7] y Y = 3, tu función devolverá 2 (hay 2 números en el array mayores que 3, esto son 5 y 7). 
function mayorqy(arr,y){
    let result=0
    for(i=0;i<arr.length;i++){
        if(arr[i]>y){
            result+=1
        }
    }
    return result
}
//9.-Cuadrados: Dado un array con múltiples valores, escribe una función que reemplace cada valor por el cuadrado del mismo valor (ej: [1,5,10,-2] será [1,25,100,4]).
function cuadrado(arr){
    for(let i=0;i<arr.length;i++){
        arr[i]=arr[i] ** 2
    }
    return arr
}
//10.- Negativos: Dado un array con múltiples valores, escribe una función que reemplace cualquier número negativo dentro del array por 0. Cuando el programa esté listo, el array no debiera contener números negativos (ej: [1,5,10,-2] se convertirá en [1,5,10,0]).
function reemplazarNegativosConCero(array) {
    for (let i = 0; i < array.length; i++) {
      if (array[i] < 0) {
        array[i] = 0;
      }
    }
    return array;
  }

//11.- Max/Min/Avg: Dado un array con múltiples valores, escribe una función que devuelva un nuevo array que solo contenga el valor mayor (max), menor (min) y promedio (avg) del array original (ej: [1,5,10,-2] devolverá [10,-2,3.5]).
function operations(x){
    var min = x[0];
    var max = x[0];
    var sum = 0;
    for(var i = 0; i < x.length; ++i){
        if(x[i] < min)min = x[i];
        if(x[i] > max) max = x[i];
        sum+=x[i]
    }
    return [max,min,sum/x.length];
}

x = [1,2,3,4,5]

console.log(operations(x))

//12.-intercambia Valores: Escribe una función que intercambie el primer y el último valor de cualquier array.
function swap(arr) {
    if (arr.length < 2) {
    }
    [arr[0], arr[arr.length - 1]] = [arr[arr.length - 1], arr[0]];
  }


//13.-De Número a String: Escribe una función que tome un array de números y reemplace cualquier valor negativo por el string ‘Dojo’
function reemplazarNegativosConDojo(array) {
    const newArray = array.slice();
    for (let i = 0; i < newArray.length; i++) {
      if (newArray[i] < 0) {
        newArray[i] = 'Dojo';
      }
    }
  
    return newArray;
  }
  