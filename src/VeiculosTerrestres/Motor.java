package VeiculosTerrestres;

public class Motor extends Produto {
    private String tipoCombustivel;
    private int rpm, rpmMaximo;
    
    public Motor() {
        super();
        tipoCombustivel = "";
        rpm = 0;
        rpmMaximo = 10000;
    }
    public Motor(String marca) {
        super(marca);
        tipoCombustivel = "";
        rpm = 0;
        rpmMaximo = 10000;
    }
    public Motor(String marca, String modelo) {
        super(marca, modelo);
        tipoCombustivel = "";
        rpm = 0;
        rpmMaximo = 10000;
    }
    public Motor(String marca, int rpmMaximo) {
        super(marca);
        setRpmMaximo(rpmMaximo);
        rpm = 0;
        tipoCombustivel = "";
    }
    public Motor(String marca, int rpmMaximo, int rpm) {
        super(marca);
        setRpmMaximo(rpmMaximo);
        setRpm(rpm);
        tipoCombustivel = "";
    }
    public Motor(String marca, int rpmMaximo, String tipoCombustivel) {
        super(marca);
        setRpmMaximo(rpmMaximo);
        setTipoCombustivel(tipoCombustivel);
        rpm =0;
    }
    public Motor(String marca, int rpmMaximo, int rpm, String tipoCombustivel) {
        super (marca);
        setRpmMaximo(rpmMaximo);
        setRpm(rpm);
        setTipoCombustivel(tipoCombustivel);
    }
    public Motor(String marca, String modelo, int rpmMaximo) {
        super(marca, modelo);
        setRpmMaximo(rpmMaximo);
        rpm = 0;
        tipoCombustivel = "";
    }
    public Motor(String marca, String modelo, int rpmMaximo, int rpm) {
        super(marca, modelo);
        setRpmMaximo(rpmMaximo);
        setRpm(rpm);
        tipoCombustivel = "";
    }
    public Motor(String marca, String modelo, int rpmMaximo, String tipoCombustivel) {
        super(marca, modelo);
        setRpmMaximo(rpmMaximo);
        setTipoCombustivel(tipoCombustivel);
        rpm =0;
    }
    public Motor(String marca, String modelo, int rpmMaximo, int rpm, String tipoCombustivel) {
        super (marca, modelo);
        setRpmMaximo(rpmMaximo);
        setRpm(rpm);
        setTipoCombustivel(tipoCombustivel);
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        if(!(tipoCombustivel.equals(""))) {
            this.tipoCombustivel = tipoCombustivel;
        } else {
            System.out.println("Entrada indevida na funcao setTipoCombustivel\nPor favor, repita o processo armazenando um valor devido");
            setTipoCombustivel((String)entradaDeDados("string"));
        }   
    }
    public void setRpm(int rpm) {
        if(rpm <= rpmMaximo) {
            if(rpm < 0) {
                rpm = 0;
            }
        }else if(rpm > rpmMaximo) {
            rpm = rpmMaximo;
        }
        this.rpm = rpm;
    }
    public void setRpmMaximo(int rpm) {
        if(rpm < this.rpm) {
            System.out.println("Entrada indevida na funcao setRpmMaximo\nPor favor, repita o processo armazenando um valor maior que "+rpm);
            setRpmMaximo((int)entradaDeDados("int"));
        }else {
            this.rpmMaximo = rpm;
        }
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public int getRpm() {
        return this.rpm;
    }
    public int getRpmMaximo() {
        return this.rpmMaximo;
    }

    public void imprimir() {
        System.out.println("Marca: "+getMarca()+
                "\n"+"Modelo: "+getModelo()+
                "\n"+"Tipo de Combustivel: "+getTipoCombustivel()+
                "\n"+"RPM: "+getRpm()+
                "\n"+"RPM Maximo: "+getRpmMaximo()+"\n"
        );
    }
    public void cadastrar() {
        System.out.println("Entre com a Marca do motor:");
        setMarca((String) entradaDeDados("string"));
        System.out.println("Entre com a Modelo do motor:");
        setModelo((String) entradaDeDados("string"));
        System.out.println("Entre com o RPM máximo do motor:");
        setRpmMaximo((int) entradaDeDados("int"));
        System.out.println("Entre com o RPM do motor:");
        setRpm((int) entradaDeDados("int"));
        System.out.println("Entre com o tipo de Combustivel do motor:");
        setTipoCombustivel((String) entradaDeDados("string"));
    }
}