package aplication;

import entities.Carro;
import entities.ErrosOrSucess;
import entities.Locadora;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Locadora locadoraAdm = new Carro();
        locadoraAdm.addCarro("Civic", 123);
        locadoraAdm.addCarro("Uno", 321);
        try {
            System.out.println("Carros disponiveis: ");
            locadoraAdm.listarCarros();
            System.out.print("Digite o numero o codigo do carro: ");
            int codigo = sc.nextInt();
            System.out.print("Deseja alugar por quantos dias: ");
            int dias = sc.nextInt();
            locadoraAdm.alugarCarro(codigo, dias);
            System.out.println("Valor total a ser pago: " + String.format("%.2f", locadoraAdm.valorTotal()));

            sc.close();
        }
        catch (ErrosOrSucess e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Digite apenas tipos de valores compativeis");
        }
    }
}
