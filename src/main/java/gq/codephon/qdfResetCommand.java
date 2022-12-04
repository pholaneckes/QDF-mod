package gq.codephon;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.Entity;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

@Mod.EventBusSubscriber
public class qdfResetCommand {
    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent event) {
        event.getDispatcher().register(LiteralArgumentBuilder.<CommandSource>literal("qdfevent").requires((tho) -> {
                    return tho.hasPermission(2);
                })
                .then(Commands.literal("reset")

                .executes(arguments -> {
//省略
                        return QdfResetToProd.mainResetProd(Stream
                                .of(/*省略，省略*/),20);
                }))

                .then(Commands.literal("start")

                        .executes(arguments -> {
//省略;
                            return QdfResetToProd.mainResetProd(Stream
                                    .of(/*省略，省略*/),10);

                }))

                .then(Commands.literal("shut").then(Commands.literal("confirm")

                        .executes(arguments -> {
//省略
                            return QdfResetToProd.mainResetProd(Stream
                                    .of(/*省略，省略*/),30);

                        })))

                .then(Commands.literal("off")

                        .executes(arguments -> {
//省略
                            return QdfResetToProd.mainResetProd(Stream
                                    .of(/*省略，省略*/),100);

                        }))

                .then(Commands.literal("on")

                        .executes(arguments -> {
//省略
                            return QdfResetToProd.mainResetProd(Stream
                                    .of(/*省略，省略*/),200);

                        }))
        );
    }
}

