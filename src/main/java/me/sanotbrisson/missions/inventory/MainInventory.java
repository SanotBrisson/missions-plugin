package me.sanotbrisson.missions.inventory;

import fr.minuskube.inv.SmartInventory;
import fr.minuskube.inv.content.InventoryProvider;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author SanotBrisson
 */
@Getter
@AllArgsConstructor
public class MainInventory {

    public static SmartInventory INVENTORY = SmartInventory.builder()
            .id("missionInventory")
            .provider((InventoryProvider) new MainInventory())
            .size(5, 9)
            .title("Central de Missões")
            .build();

}
