package VeiculosTerrestres;
public abstract class VeiculoTerrestre extends Produto {
    public static int IdadeMinMotorista = 18;
    public static int TempoMaxUso = 30;
    
    private int numeroPassagerios;
    private Motor motor1;
    private float preco;
    private String proprietario;
    
    public VeiculoTerrestre() {
        super();
        motor1 = new Motor();
        numeroPassagerios = 0;
        preco =0;
        proprietario = "Nao Registrado";
    }
    public VeiculoTerrestre(String marca) {
        super(marca);
        motor1 = new Motor();
        numeroPassagerios = 0;
        preco =0;
        proprietario = "Nao Registrado";
    }
    public VeiculoTerrestre(String marca, String modelo) {
        super(marca, modelo);
        motor1 = new Motor();
        numeroPassagerios = 0;
        preco =0;
        proprietario = "Nao Registrado";
    }
    public VeiculoTerrestre(String marca, String modelo, String marcaMotor) {
        super(marca, modelo);
        motor1 = new Motor(marcaMotor);
        numeroPassagerios = 0;
        preco =0;
        proprietario = "Nao Registrado";
    }
    public VeiculoTerrestre(String marca, String modelo, String marcaMotor, String modeloMotor) {
        super(marca, modelo);
        motor1 = new Motor(marcaMotor, modeloMotor);
        numeroPassagerios = 0;
        preco = 0;
        proprietario = "Nao Registrado";
    }
    public VeiculoTerrestre(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo) {
        super(marca, modelo);
        motor1 = new Motor(marcaMotor, modeloMotor, rpmMaximo);
        numeroPassagerios = 0;
        preco =0;
        proprietario = "Nao Registrado";
    }
    public VeiculoTerrestre(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, String tipoCombustivel) {
        super(marca, modelo);
        motor1 = new Motor(marcaMotor, modeloMotor, rpmMaximo,tipoCombustivel);
        numeroPassagerios = 0;
        preco =0;
        proprietario = "Nao Registrado";
    }
    public VeiculoTerrestre(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel) {
        super(marca, modelo);
        motor1 = new Motor(marcaMotor, modeloMotor, rpmMaximo, rpm,tipoCombustivel);
        numeroPassagerios = 0;
        preco =0;
        proprietario = "Nao Registrado";
    }
    public VeiculoTerrestre(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, String tipoCombustivel, String proprietario) {
        super(marca, modelo);
        motor1 = new Motor(marcaMotor, modeloMotor, rpmMaximo, tipoCombustivel);
        numeroPassagerios =0;
        preco = 0;
        setProprietario(proprietario);
    }
    public VeiculoTerrestre(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario) {
        super(marca, modelo);
        motor1 = new Motor(marcaMotor, modeloMotor, rpmMaximo, rpm,tipoCombustivel);
        numeroPassagerios =0;
        preco = 0;
        setProprietario(proprietario);
    }
    public VeiculoTerrestre(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario, float preco) {
        super(marca, modelo);
        motor1 = new Motor(marcaMotor, modeloMotor, rpmMaximo, rpm,tipoCombustivel);
        numeroPassagerios =0;
        setPreco(preco);
        setProprietario(proprietario);
    }
    public VeiculoTerrestre(String marca, String modelo, String marcaMotor, String modeloMotor, int rpmMaximo, int rpm, String tipoCombustivel, String proprietario, float preco, int numeroPassagerios) {
        super(marca, modelo);
        motor1 = new Motor(marcaMotor, modeloMotor, rpmMaximo, rpm,tipoCombustivel);
        setNumeroPassageiros(numeroPassagerios);
        setPreco(preco);
        setProprietario(proprietario);
    }

    public void setNumeroPassageiros(int p) {
        if(p > 0) {
            numeroPassagerios = p;
        } else {
            System.out.println("Entrada indevida na funcao setNumPassageiro\nO valor de numPassageiros = 1");
            numeroPassagerios = 1;
        }    
    }
    public void setMotor() {
        motor1.cadastrar();
    }
    public void setPreco(float f) {
       if(f > 0) {
            preco = f;
       }else{
            System.out.println("Entrada indevida na funcao setPreco\nO valor de Preco = 1");
            preco = 1.0f;
       }
    }
    public void setProprietario(String p) {
       if(!(p.equals(""))){
            proprietario = p;
       } else{
            System.out.println("Entrada indevida na funcao setProprietario\nPor favor, repita o processo armazenando um valor devido");
            setProprietario((String)entradaDeDados("string"));
       }
    }
    public int getNumeroPassageiros() {
        return numeroPassagerios;
    }
    public Motor getMotor() {
        return motor1;
    }
    public float getPreco() {
        return preco;
    }
    public String getProprietario() {
        return proprietario;
    }

    public void acelerar(int m) {
        if(m < 0){
            m *= -1;
        }
        motor1.setRpm((motor1.getRpm()+(100*m)));
    }
    public void desacelerar(int m){
        if(m > 0){
            m *= -1;
        }
        motor1.setRpm((motor1.getRpm()-(100*m)));
    }
    public void virarDireita()
    {
        System.out.println("O veiculo do "+getProprietario()+" virou a direita");
    }
    public void virarEsquerda()
    {
        System.out.println("O veiculo do "+getProprietario()+" virou a esquerda");
    }
}
