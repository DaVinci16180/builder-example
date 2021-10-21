package product;

public class Condominio {
    private int quantidadeDeJanelasPorApartamento;
    private int quantidadeDePortasPorApartamento;
    private String materialDosApartamentos;
    private boolean possuiPiscina;
    private double areaTotal;
    private String qualidadeDeVida;
    
    public int getQuantidadeDeJanelasPorApartamento() {
        return quantidadeDeJanelasPorApartamento;
    }
    
    public void setQuantidadeDeJanelasPorApartamento(int quantidadeDeJanelasPorApartamento) {
        this.quantidadeDeJanelasPorApartamento = quantidadeDeJanelasPorApartamento;
    }
    
    public int getQuantidadeDePortasPorApartamento() {
        return quantidadeDePortasPorApartamento;
    }
    
    public void setQuantidadeDePortasPorApartamento(int quantidadeDePortasPorApartamento) {
        this.quantidadeDePortasPorApartamento = quantidadeDePortasPorApartamento;
    }
    
    public String getMaterialDosApartamentos() {
        return materialDosApartamentos;
    }
    
    public void setMaterialDosApartamentos(String materialDosApartamentos) {
        this.materialDosApartamentos = materialDosApartamentos;
    }
    
    public boolean isPossuiPiscina() {
        return possuiPiscina;
    }
    
    public void setPossuiPiscina(boolean possuiPiscina) {
        this.possuiPiscina = possuiPiscina;
    }
    
    public double getAreaTotal() {
        return areaTotal;
    }
    
    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }
    
    public String getQualidadeDeVida() {
        return qualidadeDeVida;
    }
    
    public void setQualidadeDeVida(String qualidadeDeVida) {
        this.qualidadeDeVida = qualidadeDeVida;
    }
}
