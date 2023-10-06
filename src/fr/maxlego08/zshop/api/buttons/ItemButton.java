package fr.maxlego08.zshop.api.buttons;

import fr.maxlego08.menu.api.button.Button;
import fr.maxlego08.zshop.api.economy.ShopEconomy;
import org.bukkit.entity.Player;

import java.util.List;

public interface ItemButton extends Button {

    double getSellPrice();

    double getBuyPrice();

    double getSellPrice(int amount);

    double getBuyPrice(int amount);

    double getUnitSellPrice();

    double getUnitBuyPrice();

    boolean canSell();

    boolean canBuy();

    int getMaxStack();

    ShopEconomy getEconomy();

    List<String> getLore();

    String getSellPriceFormat(Player player, int amount);

    String getBuyPriceFormat(Player player, int amount);

    void buy(Player player, int amount);

    void sell(Player player, int amount);

    /**
     * @return buy commands
     */
    List<String> getBuyCommands();

    /**
     * @return sell commands
     */
    List<String> getSellCommands();

    /**
     * @return give item
     */
    boolean giveItem();

}