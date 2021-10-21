package builder;

public interface BuilderBase {
    public void reset();
    public BuilderBase buildJanelas(int quantidade);
    public BuilderBase buildPortas(int quantidade);
    public BuilderBase setMaterial(String material);
    public BuilderBase buildPiscina(boolean piscina);
    public BuilderBase setArea(double area);
    public BuilderBase setQualidadeDeVida(String nivel);
}
