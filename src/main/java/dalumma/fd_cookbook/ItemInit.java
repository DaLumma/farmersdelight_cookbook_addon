package dalumma.fd_cookbook;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import dalumma.fd_cookbook.items.CookBook;

public class ItemInit {
    public static final DeferredRegister<Item> Items = DeferredRegister.create(ForgeRegistries.ITEMS, dalumma.fd_cookbook.fd_cookbook.Mod_ID);

    public static final RegistryObject<CookBook> COOK_BOOK = Items.register("cook_book", () -> new CookBook(new Item.Properties()
            .group(ItemGroup.MISC)
            .maxStackSize(1)
            .rarity(Rarity.COMMON)));

    //Block Items
    public static final RegistryObject<BlockItem> cookbook_block = Items.register("cookbook_block", () -> new BlockItem(BlockInit.COOKBOOK_BLOCK.get(), new Item.Properties()
            .group(ItemGroup.MISC)));
}