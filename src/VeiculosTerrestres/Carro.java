package VeiculosTerrestres;
public class Carro extends VeiculoTerrestre{
    private int volumeMala;

    public Carro (){
        super();
        volumeMala = 0;
    }
    public Carro (String marca){
        super(marca);
         volumeMala = 0;
    }
    public Carro(String marca, String modelo){
        super(marca, modelo);
         volumeMala = 0;
    }
    public Carro(String marca, String modelo, String marcaMotor) {
        super(marca, modelo, marcaMotor);
         volumeMala = 0;
    }
    public Carro(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo);
        volumeMala = 0;
    }
    public Carro(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, String tipoCombustivel) {
        super(marca, modelo,marcaMotor, modeloMotor, rpmMaximo, tipoCombustivel);
        volumeMala = 0;
    }
    public Carro(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel);
         volumeMala = 0;
    }
    public Carro(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario);
         volumeMala = 0;
    }
    public Carro(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario, float preco) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario, preco);
        volumeMala = 0;
    }
    public Carro(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario, float preco, int numeroPassageiros) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario, preco, numeroPassageiros);
        volumeMala = 0;
    }
   
    public Carro(String marca, String modelo, int volumeMala,String marcaMotor, String modeloMotor,int rpmMaximo) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo);
        setVolumeMala(volumeMala);
    }
    public Carro(String marca, String modelo, int volumeMala,String marcaMotor, String modeloMotor, int rpmMaximo, String tipoCombustivel) {
        super(marca, modelo,marcaMotor, modeloMotor, rpmMaximo, tipoCombustivel);
        setVolumeMala(volumeMala);
    }
    public Carro(String marca, String modelo, String marcaMotor, String modeloMotor, int volumeMala,int rpmMaximo, int rpm, String tipoCombustivel) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel);
        setVolumeMala(volumeMala);
    }
    public Carro(String marca, String modelo, String marcaMotor, String modeloMotor, int volumeMala,int rpmMaximo, int rpm, String tipoCombustivel, String proprietario) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario);
        setVolumeMala(volumeMala);
    }
    public Carro(String marca, String modelo, String marcaMotor, String modeloMotor, int volumeMala,int rpmMaximo, int rpm, String tipoCombustivel, String proprietario, int preco) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario, preco);
        setVolumeMala(volumeMala);
    }
    public Carro(String marca, String modelo, String marcaMotor, String modeloMotor,int volumeMala, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario, int preco, int numeroPassageiros) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario, preco, numeroPassageiros);
        setVolumeMala(volumeMala);
    }
    
    public void setVolumeMala(int vm) {
        if(vm > 0) {
            volumeMala = vm;
        }else {
            System.out.println("Entrada invalida");
        }
    }
    public int getVolumeMala()
    {
        return volumeMala;
    }
    
    public void imprimir() {
        System.out.println("\nVeiculos: Carro" +
                "\n"+"Nome do Proprietario: "+getProprietario()+
                "\n"+"Marca: "+getMarca()+
                "\nModelo: "+getModelo()+
                "\nNumero de Passageiros: "+getNumeroPassageiros()+
                "\nVolume da Mala "+ getVolumeMala()+
                "\nPreco: "+getPreco()
        );
        getMotor().imprimir();
    }

    public void cadastrar() {
        System.out.println("Entre com o nome do Proprietario do carro: ");
        setProprietario((String)entradaDeDados("string"));
        System.out.println("Entre com a Marca do carro: ");
        setMarca((String)entradaDeDados("string"));
        System.out.println("Entre com a Modelo do carro: ");
        setModelo((String)entradaDeDados("string"));
        System.out.println("Entre com o volume da mala do carro: ");
        setVolumeMala( (int)entradaDeDados("int") );
        System.out.println("Entre com a quantidade de passageiros maxima: ");
        setNumeroPassageiros((int)entradaDeDados("int"));
        System.out.println("Entre com o preco do carro: ");
        setPreco((float)entradaDeDados("float"));
        getMotor().cadastrar();
        System.out.println("\n-----Dados do Carro Cadastrados! -----");
    }
}