package appVeiculosTerrestres;

import java.util.ArrayList;
import VeiculosTerrestres.*;

public class App {
    public static void main(String[] args) {
        ArrayList<VeiculoTerrestre> list = new ArrayList<VeiculoTerrestre>();

        for(int i=0;i<30;i++){
            if(i<10){
                list.add( i,new Carro(
                        "marca "+ i,
                        "modelo "+i,
                        "marca do motor "+i,
                        "modelo do motor "+i,
                        (i+1)*3000,
                        i+1,
                        "Gasolina",
                        "dono "+i,
                        30000 + i*1000,
                        5
                        )
                );
                System.out.println("Carro "+i);
                list.get(i).imprimir();
            }else if(i<20){
                list.add( i, new Moto(
                        "marca "+ i,
                        "modelo "+i,
                        "marca do motor "+i,
                        "modelo do motor "+i,
                        i*1000,
                        i+1,
                        "Eletrico",
                        "dono "+i,
                        15000 + i*1000,
                        2
                        )
                );
                System.out.println("Moto "+i);
                list.get(i).imprimir();
            }else{
                list.add( i, new Onibus(
                        "marca "+ i,
                        "modelo "+i,
                        "marca do motor "+i,
                        "modelo do motor "+i,
                        "motorista "+i,
                        i*1500,
                        i+1,
                        "Gas",
                        "dono "+i,
                        50000 + i*1000,
                        80
                        )
                );
                System.out.println("Onibus "+i);
                list.get(i).imprimir();
            }
        }
    }
}
