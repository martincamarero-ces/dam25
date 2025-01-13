public class pokemonpoo {
    private String tipo;
    private int vida;
    private int[] potencia = new int[4];
    private String[] ataques = new String[4];
    private String color;
    private String nombre;

    // public void pokemonpoo(){} le pichas drch source action generator constructor seleccionas todas y pa lante
    public pokemonpoo(String tipo, int vida, int[] potencia, String[] ataques, String color, String nombre) {
        this.tipo = tipo;
        this.vida = vida;
        this.potencia = potencia;
        this.ataques = ataques;
        this.color = color;
        this.nombre = nombre;
    }

    // source action en linea vacia getter and setter

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int[] getPotencia() {
        return potencia;
    }

    public void setPotencia(int[] potencia) {
        this.potencia = potencia;
    }

    public String[] getAtaques() {
        return ataques;
    }

    public void setAtaques(String[] ataques) {
        this.ataques = ataques;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    




}