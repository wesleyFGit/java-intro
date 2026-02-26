/*
Crie um programa que percorra um vetor com 5 números e use forEach para mostrar no console
o número dele e o dobro dele.
*/
const numeroEach = [2,53,97,23,37]

numeroEach.forEach(function(element){
    let dobroEach = element*2;
    console.log("número: "+element)
    console.log("dobro: "+dobroEach)
});