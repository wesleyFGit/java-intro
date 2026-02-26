/*
Uma empresa decidiu cortar em 10% o salário de todos os funcionários.
crie um programa que calcule todos os salarios ajustados 
*/

const salarios = [1200, 2500, 3200, 1800]

const salarioCortado = salarios.map((salario) => (salario * 9)/10);

console.log(salarioCortado)