package builder;

import product.Casa;

public class CasaBuilder implements BuilderBase {
    
    private Casa casa = new Casa();
    
    @Override
    public void reset() {
        this.casa = new Casa();
    }

    @Override
    public BuilderBase buildJanelas(int quantidade) {
        casa.setQuantidadeDeJanelas(quantidade);
        return this;
    }

    @Override
    public BuilderBase buildPortas(int quantidade) {
        casa.setQuantidadeDePortas(quantidade);
        return this;
    }

    @Override
    public BuilderBase setMaterial(String material) {
        casa.setMaterial(material);
        return this;
    }

    @Override
    public BuilderBase buildPiscina(boolean piscina) {
        casa.setPossuiPiscina(piscina);
        return this;
    }

    @Override
    public BuilderBase setArea(double area) {
        casa.setArea(area);
        return this;
    }

    @Override
    public BuilderBase setQualidadeDeVida(String nivel) {
        casa.setQualidadeDeVida(nivel);
        return this;
    }

    public Casa getResult() {
        return this.casa;
    }
}