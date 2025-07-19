import java.util.Scanner;

public class compra_de_casa {
    public static void main(String[] args){
    String nome;
    Double salario;
    int idade;
    Scanner resultado = new Scanner(System.in);
    System.out.println("Digite seu Nome: ");
    nome = resultado.nextLine();
    System.out.println("Digite seu Idade: ");
    idade = resultado.nextInt();
    System.out.println("Digite seu Salário: ");
    salario = resultado.nextDouble();
    if (idade >= 21){
        System.out.println(nome+" você passou no requisito - Idade.");
    }else{
        System.out.println(nome+" você não passou no requisito - Idade.");
    }
    if (salario >= 3000) {
        System.out.println(nome+" você passou no requisito - Salário.");
    }else{
        System.out.println(nome+" você não passou no requisito - Salário.");
    }
    if (idade >= 21 && salario >= 3000) {
        System.out.println("Parabéns "+nome+", Você pode comprar uma Casa.");
    }else{
        System.out.println("Desculpe "+nome+", Você não pode comprar uma Casa.");
    }
    }
}
