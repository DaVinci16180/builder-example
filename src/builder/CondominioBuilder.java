package builder;

import product.Condominio;

public class CondominioBuilder implements BuilderBase {
    
    private Condominio condominio = new Condominio();
    
    @Override
    public void reset() {
        this.condominio = new Condominio();
    }

    @Override
    public BuilderBase buildJanelas(int quantidade) {
        condominio.setQuantidadeDeJanelasPorApartamento(quantidade);
        return this;
    }

    @Override
    public BuilderBase buildPortas(int quantidade) {
        condominio.setQuantidadeDePortasPorApartamento(quantidade);
        return this;
    }

    @Override
    public BuilderBase setMaterial(String material) {
        condominio.setMaterialDosApartamentos(material);
        return this;
    }

    @Override
    public BuilderBase buildPiscina(boolean piscina) {
        condominio.setPossuiPiscina(piscina);
        return this;
    }

    @Override
    public BuilderBase setArea(double area) {
        condominio.setAreaTotal(area);
        return this;
    }

    @Override
    public BuilderBase setQualidadeDeVida(String nivel) {
        condominio.setQualidadeDeVida(nivel);
        return this;
    }

    public Condominio getResult() {
        return this.condominio;
    }
}