package VeiculosTerrestres;

public class Onibus extends VeiculoTerrestre {   
    private String motorista;
    
    public Onibus () {
        super();
        motorista = "Nao Registrado";
    }
    public Onibus (String marca) {
        super(marca);
        motorista = "Nao Registrado";
    }
    public Onibus(String marca, String modelo) {
        super(marca, modelo);
        motorista = "Nao Registrado";
    }
    public Onibus(String marca, String modelo, String marcaMotor) {
        super(marca, modelo, marcaMotor);
        motorista = "Nao Registrado";
    }
    public Onibus(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo);
        motorista = "Nao Registrado";
    }
    public Onibus(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, String tipoCombustivel) {
        super(marca, modelo,marcaMotor, modeloMotor, rpmMaximo, tipoCombustivel);
        motorista = "Nao Registrado";
    }
    public Onibus(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel);
        motorista = "Nao Registrado";
    }
    public Onibus(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario);
        motorista = "Nao Registrado";
    }
    public Onibus(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario, float preco) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario, preco);
        motorista = "Nao Registrado";
    }
    public Onibus(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario, float preco, int numeroPassageiros) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario, preco, numeroPassageiros);
        motorista = "Nao Registrado";
    }
   
    public Onibus(String marca, String modelo, String marcaMotor, String modeloMotor, String motorista,int rpmMaximo) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo);
        setMotorista(motorista);
    }
    public Onibus(String marca, String modelo, String marcaMotor, String modeloMotor, String motorista,int rpmMaximo, String tipoCombustivel) {
        super(marca, modelo,marcaMotor, modeloMotor, rpmMaximo, tipoCombustivel);
        setMotorista(motorista);
    }
    public Onibus(String marca, String modelo, String marcaMotor, String modeloMotor, String motorista,int rpmMaximo, int rpm, String tipoCombustivel) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel);
        setMotorista(motorista);
    }
    public Onibus(String marca, String modelo, String marcaMotor, String modeloMotor, String motorista,int rpmMaximo, int rpm, String tipoCombustivel, String proprietario) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario);
        setMotorista(motorista);
    }
    public Onibus(String marca, String modelo, String marcaMotor, String modeloMotor, String motorista,int rpmMaximo, int rpm, String tipoCombustivel, String proprietario, float preco) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario, preco);
        setMotorista(motorista);
    }
    public Onibus(String marca, String modelo, String marcaMotor, String modeloMotor,String motorista, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario, float preco, int numeroPassageiros) {
        super(marca, modelo, marcaMotor, modeloMotor, rpmMaximo, rpm, tipoCombustivel, proprietario, preco, numeroPassageiros);
        setMotorista(motorista);
    }
    public void setMotorista(String m) {
        if(!(m.equals(""))) {
            motorista = m;
        } else {
            System.out.println("Entrada invalida");
            setProprietario((String)entradaDeDados("string"));
        }   
    }
    public String getMotorista()
    {
        return motorista;
    }
    
    public void imprimir() {
        System.out.println("\nVeiculos: Onibus \n"+
                "Nome do Proprietario: "+getProprietario()+
                "\nMarca: "+getMarca()+
                "\nModelo: "+getModelo()+
                "\nNumero de Passageiros: "+getNumeroPassageiros()+
                "\nNome do Motorista: "+ getMotorista()+
                "\nPreco: "+getPreco()
        );
        getMotor().imprimir();
    }
    public void cadastrar() {
        System.out.println("Entre com o nome do Proprietario do onibus: ");
        setProprietario((String)entradaDeDados("string"));
        System.out.println("Entre com a Marca do onibus: ");
        setMarca((String)entradaDeDados("string"));
        System.out.println("Entre com a Modelo do onibus: ");
        setModelo((String)entradaDeDados("string"));
        System.out.println("Entre com o volume da mala do onibus: ");
        motorista = (String)entradaDeDados("string");
        System.out.println("Entre com a quantidade de passageiros maxima: ");
        setNumeroPassageiros((int)entradaDeDados("int"));
        System.out.println("Entre com o preco do onibus: ");
        setPreco((float)entradaDeDados("float"));
        getMotor().cadastrar();
        System.out.println("\n-----Dados do Onibus Cadastrados! -----");
    }
}
