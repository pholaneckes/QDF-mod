package gq.codephon;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.Commands;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.command.arguments.ItemArgument;
import net.minecraft.command.arguments.ItemInput;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Collection;

@Mod.EventBusSubscriber
public class GiveWay {
    
//该部分不给予展示

    public static int giveItem(ItemInput a, Collection<ServerPlayerEntity> b, int c) throws CommandSyntaxException {
        for(ServerPlayerEntity serverplayerentity : b) {
            int i = c;

            while(i > 0) {
                int j = Math.min(a.getItem().getMaxStackSize(), i);
                i -= j;
                ItemStack itemstack = a.createItemStack(j, false);
                boolean flag = serverplayerentity.inventory.add(itemstack);
                if (flag && itemstack.isEmpty()) {
                    itemstack.setCount(1);
                    ItemEntity itementity1 = serverplayerentity.drop(itemstack, false);
                    if (itementity1 != null) {
                        itementity1.makeFakeItem();
                    }

                    serverplayerentity.inventoryMenu.broadcastChanges();
                } else {
                    ItemEntity itementity = serverplayerentity.drop(itemstack, false);
                    if (itementity != null) {
                        itementity.setNoPickUpDelay();
                        itementity.setOwner(serverplayerentity.getUUID());
                    }
                }
            }
        }

        return b.size();
    }
}
