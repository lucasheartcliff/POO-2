package VeiculosTerrestres;

public class Moto extends VeiculoTerrestre {
    private int volumeBagageiro;
    
    public Moto () {
        super();
        volumeBagageiro = 0;
    }
    public Moto (String marca) {
        super(marca);
        volumeBagageiro = 0;
    }
    public Moto(String marca, String modelo) {
        super(marca, modelo);
        volumeBagageiro = 0;
    }
    public Moto(String marca, String modelo, String marcaMotor) {
        super(marca, modelo, marcaMotor);
        volumeBagageiro = 0;
    }
    public Moto(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo);
        volumeBagageiro = 0;
    }
    public Moto(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, String tipoCombustivel) {
        super(marca, modelo,marcaMotor, modeloMotor, rpmMaximo, tipoCombustivel);
        volumeBagageiro = 0;
    }
    public Moto(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel);
        volumeBagageiro = 0;
    }
    public Moto(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario);
        volumeBagageiro = 0;
    }
    public Moto(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario, float preco) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario, preco);
        volumeBagageiro = 0;
    }
    public Moto(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario, float preco, int numeroPassageiro) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario, preco, numeroPassageiro);
        volumeBagageiro = 0;
    }
   
    public Moto(String marca, String modelo, int volumeBagageiro,String marcaMotor, String modeloMotor,int rpmMaximo) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo);
        setVolumeBagageiro(volumeBagageiro);
    }
    public Moto(String marca, String modelo, int volumeBagageiro,String marcaMotor, String modeloMotor, int rpmMaximo, String tipoCombustivel) {
        super(marca, modelo,marcaMotor, modeloMotor, rpmMaximo, tipoCombustivel);
        setVolumeBagageiro(volumeBagageiro);
    }
    public Moto(String marca, String modelo, String marcaMotor, String modeloMotor, int volumeBagageiro,int rpmMaximo, int rpm, String tipoCombustivel) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel);
        setVolumeBagageiro(volumeBagageiro);
    }
    public Moto(String marca, String modelo, String marcaMotor, String modeloMotor, int volumeBagageiro,int rpmMaximo, int rpm, String tipoCombustivel, String proprietario) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario);
        setVolumeBagageiro(volumeBagageiro);
    }
    public Moto(String marca, String modelo, String marcaMotor, String modeloMotor, int volumeBagageiro,int rpmMaximo, int rpm, String tipoCombustivel, String proprietario, float preco) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario, preco);
        setVolumeBagageiro(volumeBagageiro);
    }
    public Moto(String marca, String modelo, String marcaMotor, String modeloMotor,int volumeBagageiro, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario, float preco, int numeroPassageiro) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario, preco, numeroPassageiro);
        setVolumeBagageiro(volumeBagageiro);
    }
    public void setVolumeBagageiro(int volumeBagageiro) {
        if(volumeBagageiro > 0) {
            this.volumeBagageiro = volumeBagageiro;
        }else {
            System.out.println("Entrada invalida");
            this.volumeBagageiro = 1;
        }
    }
    public int getVolumeBagageiro() {
        return volumeBagageiro;
    }
    
    public void imprimir() {
        System.out.println("\nVeiculos: Moto\n" +
                "Nome do Proprietario: "+getProprietario()+
                "\nMarca: "+getMarca()+
                "\nModelo: "+getModelo()+
                "\nNumero de Passageiros: "+getNumeroPassageiros()+
                "\nVolume do Bagageiro: "+ getVolumeBagageiro()+
                "\nPreco: "+getPreco()
        );
        getMotor().imprimir();
    }
    public void cadastrar() {
        System.out.println("Entre com o nome do Proprietario da moto: ");
        setProprietario((String)entradaDeDados("string"));
        System.out.println("Entre com a Marca da moto: ");
        setMarca((String)entradaDeDados("string"));
        System.out.println("Entre com a Modelo da moto: ");
        setModelo((String)entradaDeDados("string"));
        System.out.println("Entre com o volume do bagageiro da moto: ");
        volumeBagageiro = (int)entradaDeDados("int");
        System.out.println("Entre com a quantidade de passageiros maxima: ");
        setNumeroPassageiros((int)entradaDeDados("int"));
        System.out.println("Entre com o preco da moto: ");
        setPreco((float)entradaDeDados("float"));
        getMotor().cadastrar();
        System.out.println("\n-----Dados da Moto Cadastrados! -----");
    }
    
}
