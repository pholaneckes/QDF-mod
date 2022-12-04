package gq.codephon;

import net.minecraft.command.CommandSource;
import net.minecraft.command.ICommandSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class QdfToProd {
    public static int mainProd(Map<String, Object> dependencies) {
        Entity entity = (Entity) dependencies.get("entity");
        Date dayNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("dd");
        System.out.println(ft.format(dayNow));
//省略
        String nowDate = "";
        nowDate = new java.text.SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime());
        if (world instanceof ServerWorld && qdSt.shut==1) {
//该部分不给予展示
                double convert(String s) {
                    try {
                        return Double.parseDouble(s.trim());
                    } catch (Exception e) {
                    }
                    return 0;
                }
            }.convert(nowDate)) {
                if (entity instanceof PlayerEntity && !entity.getCommandSenderWorld().isClientSide()) {
                    ((PlayerEntity) entity).displayClientMessage(new StringTextComponent(("\u91CD\u590D\u7B7E\u5230 " + nowDate)), (true));
                }
            }
//该部分不给予展示
            {
                Entity ent = entity;
                    double convert(String s) {
                        try {
                            return Double.parseDouble(s.trim());
                        } catch (Exception e) {
                        }
                        return 0;
                    }
                }.convert(nowDate));
            }
        }

//该部分不给予展示
        return 1;
    }
}

