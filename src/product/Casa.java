package product;

public class Casa {
    private int quantidadeDeJanelas;
    private int quantidadeDePortas;
    private String material;
    private boolean possuiPiscina;
    private double area;
    private String qualidadeDeVida;

    public int getQuantidadeDeJanelas() {
        return quantidadeDeJanelas;
    }

    public void setQuantidadeDeJanelas(int quantidadeDeJanelas) {
        this.quantidadeDeJanelas = quantidadeDeJanelas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }
    
    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public boolean isPossuiPiscina() {
        return possuiPiscina;
    }
    
    public void setPossuiPiscina(boolean possuiPiscina) {
        this.possuiPiscina = possuiPiscina;
    }
    
    public double getArea() {
        return area;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    
    public String getQualidadeDeVida() {
        return qualidadeDeVida;
    }
    
    public void setQualidadeDeVida(String qualidadeDeVida) {
        this.qualidadeDeVida = qualidadeDeVida;
    }

    public String toString() {
        String casa = "Quantidade de janelas: " + this.quantidadeDeJanelas
                    + "\nQuantidade de portas: " + this.quantidadeDePortas
                    + "\nMaterial: " + this.material
                    + "\nPossui piscina: " + this.possuiPiscina
                    + "\nArea: " + this.area
                    + "\nQualidade de vida: " + this.qualidadeDeVida;
        
        return casa;
    }

}