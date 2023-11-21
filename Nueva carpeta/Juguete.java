class Juguete{
    private int anio;
    private String color;
    private String modelo;
    public Juguete(){

    }
    public Juguete(int anio, String Modelo){
        this.anio=anio;
        this.modelo=Modelo;
    }
    public Juguete(String Color, String Modelo){
        this.modelo=Modelo;
        this.color=Color;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}