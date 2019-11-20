package VeiculosTerrestres;
import java.util.Scanner;
public abstract class Produto {
    private String modelo, marca;
    
    public Produto() {
        modelo = "";
        marca = "";
    }
    public Produto(String marca) {
        setMarca(marca);
        modelo = "";
    }
    public Produto(String marca, String modelo) {
        setMarca(marca);
        setModelo(modelo);
    }
    
    public void setModelo(String modelo) {
       if(!(modelo.equals(""))) {
            this.modelo = modelo;
       }else {
            System.out.println("Entrada invalida na funcao setModelo\nPor favor, repita o processo armazenando um valor devido");
       }
    }
    public void setMarca(String marca) {
        if(!marca.equals("") ) {
            this.marca = marca;
        } else {
            System.out.println("Entrada invalida na funcao setMarca\nPor favor, repita o processo armazenando um valor devido");
        }
    }
    String getModelo() {
        return modelo;
    }
    String getMarca() {
        return marca;
    }

    public Object entradaDeDados(String tipo) {
        Scanner sc = new Scanner(System.in);
        switch(tipo) {
            case "string":
                  return sc.nextLine();
            case "int":
               return Integer.parseInt(sc.nextLine());
            case "float":
               return Float.parseFloat(sc.nextLine());
            default:
               System.out.println("Erro ao inserir dados!");
               return null;
        }
    }
    public abstract void imprimir();
    public abstract void cadastrar();
}
