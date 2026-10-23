package io.github.snappliminal.shootyliminal.item;

import io.github.snappliminal.shootyliminal.SnappysShooties;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SnappysShooties.MODID);

    public static final DeferredItem<Item> RECURVE_BOW = ITEMS.register("recurve_bow",
            () -> new BowItem(new Item.Properties().durability(500)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
