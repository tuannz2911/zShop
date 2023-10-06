package fr.maxlego08.zshop.economy.economies;

import fr.maxlego08.zshop.api.economy.ShopEconomy;

public abstract class DefaultExample implements ShopEconomy {

    private final String name;
    private final String currency;
    private final String format;
    private final String denyMessage;

    public DefaultExample(String name, String currency, String format, String denyMessage) {
        this.name = name;
        this.currency = currency;
        this.format = format;
        this.denyMessage = denyMessage;
    }

    @Override
    public String getCurrency() {
        return this.currency;
    }

    @Override
    public String getFormat() {
        return this.format;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDenyMessage() {
        return this.denyMessage;
    }
}