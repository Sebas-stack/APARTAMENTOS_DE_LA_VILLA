package org.example;

import org.example.MODELOS.Apartamento;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("DATOS DEL APARTAMENTO");
        System.out.println("************************");


        Scanner lea = new Scanner(System.in);


        Apartamento apartamento = new Apartamento();

        System.out.println("Digite el nombre de la unidad: ");
        apartamento.setNombre(lea.nextLine());
        System.out.println("Digite el tipo de propiedad: ");
        apartamento.setTipoDePropiedad(lea.nextLine());
        System.out.println("Digite la ubicacion del apartamento: ");
        apartamento.setUbicacion(lea.nextLine());
        System.out.println("Superficie del apartamento: ");
        apartamento.setSuperficie(lea.nextLine());
        System.out.println("Precio del arriendo: ");
        apartamento.setPrecio(lea.nextInt());
       

        System.out.println(apartamento);


    }
}