const base2 = 2;
const expoente = 5;
let contador = 0;
let potencia = 1 ;
while (contador < expoente){
    potencia = potencia*base2;
    contador++;
}
console.log(potencia);