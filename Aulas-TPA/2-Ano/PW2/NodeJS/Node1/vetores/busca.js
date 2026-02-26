/*
Crie um vetor com 5 números, crie uma variavel e verifique se o número desta variavel existe ou não no vetor.
*/
let busca = [10,13,33,25,22]
let valorBusca = 7
let resultado = 0
busca.forEach(function(element){
    if(element == valorBusca){
       resultado = 1
    } 
});
if(resultado == 1 ){
     console.log("este número existe no vetor")
} else {
    console.log("este número não existe no vetor")
}