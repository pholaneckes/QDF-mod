package gq.codephon;

import net.minecraft.command.CommandSource;
import net.minecraft.command.ICommandSource;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Map;

public class QdfResetToProd {
    public static int mainResetProd(Map<String, Object> dependencies, int way) {

//该部分冗余省略

        IWorld world = (IWorld) dependencies.get("world");
        if (world instanceof ServerWorld) {

            if (way>=20 && way<=50){
//该部分不给予展示
            }

            if (way<=20) {
//该部分不给予展示
            }

            if (way==10){
//该部分不给予展示
                qdSt.shut = 1;

            }else if (way==30){
//该部分不给予展示
                qdSt.shut = 0;
                System.out.println("qdf to" + qdSt.shut);

            }else if (way==20){
//该部分不给予展示
            }else if (way==100){
                if(qdSt.shut != 0){
                    qdSt.shut = 0;
//该部分不给予展示
                }else {
//该部分不给予展示
                }

            }else if (way==200){
                if(qdSt.shut != 1){
                    qdSt.shut = 1;
//该部分不给予展示
                }else {
//该部分不给予展示
                }

            }else {
//该部分不给予展示

            }

        }
        return 1;
    }
}


