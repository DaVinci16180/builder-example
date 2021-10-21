import builder.CasaBuilder;
import director.CasaDirector;
import product.Casa;

public class App {
    public static void main(String[] args) throws Exception {
        
        CasaBuilder builder = new CasaBuilder();
        CasaDirector director = new CasaDirector();

        Casa casaDeCampo = director.makeCasaDeCampo(builder);
        Casa mansao = director.makeMansão(builder);
        Casa apartamento = director.makeApartamento(builder);

        System.out.println(casaDeCampo.toString() + "\n");
        System.out.println(mansao.toString() + "\n");
        System.out.println(apartamento.toString() + "\n");
    }
}