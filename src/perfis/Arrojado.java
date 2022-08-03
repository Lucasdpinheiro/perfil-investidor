package perfis;

import investimentos.RendaVariavel;

public class Arrojado extends PerfilClient {

    public <Investimento extends RendaVariavel> void contratarInvestimento(Investimento investimento) {
        this.setCarteiraInvestimentos(investimento);
    }
    
}
