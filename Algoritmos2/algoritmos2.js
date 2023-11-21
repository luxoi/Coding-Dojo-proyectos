//actividad print 1 to 1000
function printUpTo(x) {
    if(x>=0)
      for(var i=0;i<=x;i++)
      console.log(i)
      else {
        console.log(false)
        return false
      }
       
    }
    printUpTo(1000); // debería imprimir todos los enteros de 1 to 1000
    y = printUpTo(-10); // debería imprimir false
    console.log(y); // debería imprimir false
  
// actividadPrintsum 
function printSum(x) {
    var sum = 0;
    for(var i=0;i<=255; i++)
    sum+=i
    return sum
  }
  y = printSum(255) 
  console.log(y) 
  

  //Actividad print sumarray
  function printSumArray(x) {
    var sum = 0;
    for(var i=0; i<x.length; i++) {
      sum+=x[i]
    }
    return sum;
  }
  console.log( printSumArray([1,2,3]) ); // debería imprimir 6