package org.playstat.amnesia;

import org.joda.money.CurrencyUnit;

public class Contract {
    private enum ContractType {
        STOCK, FUTURES, OPTIONS;
    }

    private ContractType type;
    private String symbol;

    private CurrencyUnit currency;

    public Contract() {
    }

    public ContractType getType() {
        return type;
    }

    public void setType(ContractType type) {
        this.type = type;
    }

    public CurrencyUnit getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyUnit currency) {
        this.currency = currency;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
