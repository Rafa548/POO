public enum TipoCaixa {
    OPERADOR("Operador", 100), SELFSERVICE("SelfService", 50), EXPRESS("Express", 200);

    private String tc;
    private int maxp;

    private TipoCaixa(String tc, int maxp) {
        this.tc = tc;
        this.maxp = maxp;
    }

    public String toString() {
        return tc;
    }

    public int getMaxProdutos() {
        return maxp;
    }
}
