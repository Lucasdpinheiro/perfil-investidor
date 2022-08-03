package perfis;

import investimentos.RendaFixa;

public class Conservador extends PerfilClient {
    
    public <Investimento extends RendaFixa> void contratarInvestimento(Investimento investimento) {
        this.setCarteiraInvestimentos(investimento);
    }

}
