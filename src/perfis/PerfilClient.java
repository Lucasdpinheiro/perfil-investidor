package perfis;

import java.util.ArrayList;

import interfaces.Investimento;

public abstract class PerfilClient {
    private ArrayList<Investimento> carteiraInvestimentos;

    public ArrayList<Investimento> getCarteiraInvestimentos() {
        return carteiraInvestimentos;
    }

    public void setCarteiraInvestimentos(Investimento investimento) {
        this.carteiraInvestimentos.add(investimento);
    }
}
