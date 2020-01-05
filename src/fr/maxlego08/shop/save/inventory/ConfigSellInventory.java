package fr.maxlego08.shop.save.inventory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.maxlego08.shop.zcore.utils.inventory.Button;

public class ConfigSellInventory {

	public static int inventorySize = 54;
	public static String inventoryName = "�aVente �2%item%";
	public static List<String> lore = Arrays.asList("�f� �2Prix�7: �a%price%%currency%");
	public static Map<Integer, Button> decoration = new HashMap<Integer, Button>();
	public static int backintSlotSlot = 39;
	public static int sellintSlotSlot = 41;
	public static int resetItemintSlot = 18;
	public static int removeTenItemintSlot = 19;
	public static int removeOneItemintSlot = 20;
	public static int addOneItemintSlot = 24;
	public static int addTenItemintSlot =25;
	public static int maxItemintSlot = 26;
	public static int itemSlot = 22;

}
