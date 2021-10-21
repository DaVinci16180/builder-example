package director;

import builder.CasaBuilder;
import product.Casa;

public class CasaDirector {
    
    public Casa makeCasaDeCampo(CasaBuilder builder) {
        Casa casa = new Casa();

        builder.reset();
        builder.buildJanelas(2)
            .buildPiscina(false)
            .buildPortas(2)
            .setArea(128)
            .setMaterial("Madeira")
            .setQualidadeDeVida("Alta");

        casa = builder.getResult();

        return casa;
    }

    public Casa makeMansão(CasaBuilder builder) {
        Casa mansao = new Casa();

        builder.reset();
        builder.buildJanelas(50)
            .buildPiscina(true)
            .buildPortas(40)
            .setArea(3500)
            .setMaterial("Tijolos")
            .setQualidadeDeVida("Média");

        mansao = builder.getResult();

        return mansao;
    }

    public Casa makeApartamento(CasaBuilder builder) {
        Casa apartamento = new Casa();

        builder.reset();
        builder.buildJanelas(0)
            .buildPiscina(false)
            .buildPortas(1)
            .setArea(50)
            .setMaterial("Concreto")
            .setQualidadeDeVida("Muito Baixa");

        apartamento = builder.getResult();

        return apartamento;
    }

    
}
