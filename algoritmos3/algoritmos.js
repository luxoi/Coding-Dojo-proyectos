//actividad1 promedio
function printAverage(x){
    sum = 0;
    for(i=0;i<x.length;i++)
    sum+=x[i]
    return sum/x.length
    
 }
 y = printAverage([1,2,3]);
 console.log(y); // should log 2
   
 y = printAverage([2,5,8]);
 console.log(y); // should log 5
 
 
 //actividad2 impares de 1 hasta 255
 function returnOddArray(){
    var arr=[]
    for(var i=0;i<=255;i++){
      if (i%2!==0){
        arr.push(i);
      }
      
    }
    return arr
 }
 y = returnOddArray();
 console.log(y); // should log [1,3,5,...,253,255]
 
//3) Cuadra cada valor con un array dado, obteniendo el mismo array con valores cambiados..

  function squareValue(x){
    var arr=[]
    for(var i=0;i<x.length;i++){
        arr[i]=x[i] ** 2
    }
    return arr;
 }
 y = squareValue([1,2,3]);
 console.log(y); // should log [1,4,9]
   
 y = squareValue([2,5,8]);
 console.log(y); // should log [4,25,64]
 