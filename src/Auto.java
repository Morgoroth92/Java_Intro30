public class Auto {

    private String marca;
    private String model;
    private int cilindrata;
    private String targa;

    public Auto(String marca, String model, int cilindrata, String targa) {
        this.marca = marca;
        this.model = model;
        this.cilindrata = cilindrata;
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }


}

