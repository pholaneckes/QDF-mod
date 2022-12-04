package gq.codephon;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class ModConfig
{
    public static void init(Path file)
    {
        final CommentedFileConfig configData = CommentedFileConfig.builder(file)
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();

        configData.load();
        SPEC.setConfig(configData);
    }

    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    /*
     * CLIENT
     */
    public static final String CATEGORY_CLIENT = "client";
    private static final String CATEGORY_CLIENT_COMMENT =
            "These config settings are client-side only";

    public static final ForgeConfigSpec.ConfigValue D1;
    public static String Day1 = "minecraft:apple";
    private static final String Y1 = "Day1";
    private static final String T1 =
            "\u5f53\u67081\u53f7";

    public static final ForgeConfigSpec.ConfigValue D2;
    public static String Day2 = "minecraft:apple";
    private static final String Y2 = "Day2";
    private static final String T2 =  "\u5f53\u67082\u53f7";
    public static final ForgeConfigSpec.ConfigValue D3;
    public static String Day3 = "minecraft:apple";
    private static final String Y3 = "Day3";
    private static final String T3 =  "\u5f53\u67083\u53f7";
    public static final ForgeConfigSpec.ConfigValue D4;
    public static String Day4 = "minecraft:apple";
    private static final String Y4 = "Day4";
    private static final String T4 =  "\u5f53\u67084\u53f7";
    public static final ForgeConfigSpec.ConfigValue D5;
    public static String Day5 = "minecraft:apple";
    private static final String Y5 = "Day5";
    private static final String T5 =  "\u5f53\u67085\u53f7";
    public static final ForgeConfigSpec.ConfigValue D6;
    public static String Day6 = "minecraft:apple";
    private static final String Y6 = "Day6";
    private static final String T6 =  "\u5f53\u67086\u53f7";
    public static final ForgeConfigSpec.ConfigValue D7;
    public static String Day7 = "minecraft:apple";
    private static final String Y7 = "Day7";
    private static final String T7 =  "\u5f53\u67087\u53f7";
    public static final ForgeConfigSpec.ConfigValue D8;
    public static String Day8 = "minecraft:apple";
    private static final String Y8 = "Day8";
    private static final String T8 =  "\u5f53\u67088\u53f7";
    public static final ForgeConfigSpec.ConfigValue D9;
    public static String Day9 = "minecraft:apple";
    private static final String Y9 = "Day9";
    private static final String T9 =  "\u5f53\u67089\u53f7";
    public static final ForgeConfigSpec.ConfigValue D10;
    public static String Day10 = "minecraft:apple";
    private static final String Y10 = "Day10";
    private static final String T10 =  "\u5f53\u670810\u53f7";
    public static final ForgeConfigSpec.ConfigValue D11;
    public static String Day11 = "minecraft:apple";
    private static final String Y11 = "Day11";
    private static final String T11 =  "\u5f53\u670811\u53f7";
    public static final ForgeConfigSpec.ConfigValue D12;
    public static String Day12 = "minecraft:apple";
    private static final String Y12 = "Day12";
    private static final String T12 =  "\u5f53\u670812\u53f7";
    public static final ForgeConfigSpec.ConfigValue D13;
    public static String Day13 = "minecraft:apple";
    private static final String Y13 = "Day13";
    private static final String T13 =  "\u5f53\u670813\u53f7";
    public static final ForgeConfigSpec.ConfigValue D14;
    public static String Day14 = "minecraft:apple";
    private static final String Y14 = "Day14";
    private static final String T14 =  "\u5f53\u670814\u53f7";
    public static final ForgeConfigSpec.ConfigValue D15;
    public static String Day15 = "minecraft:apple";
    private static final String Y15 = "Day15";
    private static final String T15 =  "\u5f53\u670815\u53f7";
    public static final ForgeConfigSpec.ConfigValue D16;
    public static String Day16 = "minecraft:apple";
    private static final String Y16 = "Day16";
    private static final String T16 =  "\u5f53\u670816\u53f7";
    public static final ForgeConfigSpec.ConfigValue D17;
    public static String Day17 = "minecraft:apple";
    private static final String Y17 = "Day17";
    private static final String T17 =  "\u5f53\u670817\u53f7";
    public static final ForgeConfigSpec.ConfigValue D18;
    public static String Day18 = "minecraft:apple";
    private static final String Y18 = "Day18";
    private static final String T18 =  "\u5f53\u670818\u53f7";
    public static final ForgeConfigSpec.ConfigValue D19;
    public static String Day19 = "minecraft:apple";
    private static final String Y19 = "Day19";
    private static final String T19 =  "\u5f53\u670819\u53f7";
    public static final ForgeConfigSpec.ConfigValue D20;
    public static String Day20 = "minecraft:apple";
    private static final String Y20 = "Day20";
    private static final String T20 =  "\u5f53\u670820\u53f7";
    public static final ForgeConfigSpec.ConfigValue D21;
    public static String Day21 = "minecraft:apple";
    private static final String Y21 = "Day21";
    private static final String T21 =  "\u5f53\u670821\u53f7";
    public static final ForgeConfigSpec.ConfigValue D22;
    public static String Day22 = "minecraft:apple";
    private static final String Y22 = "Day22";
    private static final String T22 =  "\u5f53\u670822\u53f7";
    public static final ForgeConfigSpec.ConfigValue D23;
    public static String Day23 = "minecraft:apple";
    private static final String Y23 = "Day23";
    private static final String T23 =  "\u5f53\u670823\u53f7";
    public static final ForgeConfigSpec.ConfigValue D24;
    public static String Day24 = "minecraft:apple";
    private static final String Y24 = "Day24";
    private static final String T24 =  "\u5f53\u670824\u53f7";
    public static final ForgeConfigSpec.ConfigValue D25;
    public static String Day25 = "minecraft:apple";
    private static final String Y25 = "Day25";
    private static final String T25 =  "\u5f53\u670825\u53f7";
    public static final ForgeConfigSpec.ConfigValue D26;
    public static String Day26 = "minecraft:apple";
    private static final String Y26 = "Day26";
    private static final String T26 =  "\u5f53\u670826\u53f7";
    public static final ForgeConfigSpec.ConfigValue D27;
    public static String Day27 = "minecraft:apple";
    private static final String Y27 = "Day27";
    private static final String T27 =  "\u5f53\u670827\u53f7";
    public static final ForgeConfigSpec.ConfigValue D28;
    public static String Day28 = "minecraft:apple";
    private static final String Y28 = "Day28";
    private static final String T28 =  "\u5f53\u670828\u53f7";
    public static final ForgeConfigSpec.ConfigValue D29;
    public static String Day29 = "minecraft:apple";
    private static final String Y29 = "Day29";
    private static final String T29 =  "\u5f53\u670829\u53f7";
    public static final ForgeConfigSpec.ConfigValue D30;
    public static String Day30 = "minecraft:apple";
    private static final String Y30 = "Day30";
    private static final String T30 =  "\u5f53\u670830\u53f7";
    public static final ForgeConfigSpec.ConfigValue D31;
    public static String Day31 = "minecraft:apple";
    private static final String Y31 = "Day31";
    private static final String T31 =  "\u5f53\u670831\u53f7";

    public static final ForgeConfigSpec.ConfigValue DOt;
    public static String DayOt = "minecraft:apple";
    private static final String YOt = "DayOters";
    private static final String TOt =  "\u5f53\u6708\u5176\u5b83";

    public static final ForgeConfigSpec.ConfigValue C1;
    public static String Numc1 = "7";
    private static final String O1 = "Count1";
    private static final String X1 =  "\u6570\u91cf";

    public static final ForgeConfigSpec.ConfigValue C2;
    public static String Numc2 = "7";
    private static final String O2 = "Count2";
    private static final String X2 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C3;
    public static String Numc3 = "7";
    private static final String O3 = "Count3";
    private static final String X3 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C4;
    public static String Numc4 = "7";
    private static final String O4 = "Count4";
    private static final String X4 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C5;
    public static String Numc5 = "7";
    private static final String O5 = "Count5";
    private static final String X5 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C6;
    public static String Numc6 = "7";
    private static final String O6 = "Count6";
    private static final String X6 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C7;
    public static String Numc7 = "7";
    private static final String O7 = "Count7";
    private static final String X7 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C8;
    public static String Numc8 = "7";
    private static final String O8 = "Count8";
    private static final String X8 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C9;
    public static String Numc9 = "7";
    private static final String O9 = "Count9";
    private static final String X9 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C10;
    public static String Numc10 = "7";
    private static final String O10 = "Count10";
    private static final String X10 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C11;
    public static String Numc11 = "7";
    private static final String O11 = "Count11";
    private static final String X11 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C12;
    public static String Numc12 = "7";
    private static final String O12 = "Count12";
    private static final String X12 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C13;
    public static String Numc13 = "7";
    private static final String O13 = "Count13";
    private static final String X13 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C14;
    public static String Numc14 = "7";
    private static final String O14 = "Count14";
    private static final String X14 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C15;
    public static String Numc15 = "7";
    private static final String O15 = "Count15";
    private static final String X15 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C16;
    public static String Numc16 = "7";
    private static final String O16 = "Count16";
    private static final String X16 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C17;
    public static String Numc17 = "7";
    private static final String O17 = "Count17";
    private static final String X17 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C18;
    public static String Numc18 = "7";
    private static final String O18 = "Count18";
    private static final String X18 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C19;
    public static String Numc19 = "7";
    private static final String O19 = "Count19";
    private static final String X19 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C20;
    public static String Numc20 = "7";
    private static final String O20 = "Count20";
    private static final String X20 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C21;
    public static String Numc21 = "7";
    private static final String O21 = "Count21";
    private static final String X21 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C22;
    public static String Numc22 = "7";
    private static final String O22 = "Count22";
    private static final String X22 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C23;
    public static String Numc23 = "7";
    private static final String O23 = "Count23";
    private static final String X23 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C24;
    public static String Numc24 = "7";
    private static final String O24 = "Count24";
    private static final String X24 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C25;
    public static String Numc25 = "7";
    private static final String O25 = "Count25";
    private static final String X25 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C26;
    public static String Numc26 = "7";
    private static final String O26 = "Count26";
    private static final String X26 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C27;
    public static String Numc27 = "7";
    private static final String O27 = "Count27";
    private static final String X27 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C28;
    public static String Numc28 = "7";
    private static final String O28 = "Count28";
    private static final String X28 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C29;
    public static String Numc29 = "7";
    private static final String O29 = "Count29";
    private static final String X29 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C30;
    public static String Numc30 = "7";
    private static final String O30 = "Count30";
    private static final String X30 =  "\u6570\u91cf";
    public static final ForgeConfigSpec.ConfigValue C31;
    public static String Numc31 = "7";
    private static final String O31 = "Count31";
    private static final String X31 =  "\u6570\u91cf";

    public static final ForgeConfigSpec.ConfigValue COt;
    public static String NumcOt = "7";
    private static final String OOt = "CountOthers";
    private static final String XOt =  "\u6570\u91cf";

    static
    {
        BUILDER.push(CATEGORY_CLIENT);
        D1 = BUILDER
                .comment(T1)
                .define(Y1, Day1);
        C1 = BUILDER
                .comment(X1)
                .define(O1, Numc1);
        D2 = BUILDER
                .comment(T2)
                .define(Y2, Day2);
        C2 = BUILDER
                .comment(X2)
                .define(O2, Numc2);
        D3 = BUILDER
                .comment(T3)
                .define(Y3, Day3);
        C3 = BUILDER
                .comment(X3)
                .define(O3, Numc3);
        D4 = BUILDER
                .comment(T4)
                .define(Y4, Day4);
        C4 = BUILDER
                .comment(X4)
                .define(O4, Numc4);
        D5 = BUILDER
                .comment(T5)
                .define(Y5, Day5);
        C5 = BUILDER
                .comment(X5)
                .define(O5, Numc5);
        D6 = BUILDER
                .comment(T6)
                .define(Y6, Day6);
        C6 = BUILDER
                .comment(X6)
                .define(O6, Numc6);
        D7 = BUILDER
                .comment(T7)
                .define(Y7, Day7);
        C7 = BUILDER
                .comment(X7)
                .define(O7, Numc7);
        D8 = BUILDER
                .comment(T8)
                .define(Y8, Day8);
        C8 = BUILDER
                .comment(X8)
                .define(O8, Numc8);
        D9 = BUILDER
                .comment(T9)
                .define(Y9, Day9);
        C9 = BUILDER
                .comment(X9)
                .define(O9, Numc9);
        D10 = BUILDER
                .comment(T10)
                .define(Y10, Day10);
        C10 = BUILDER
                .comment(X10)
                .define(O10, Numc10);
        D11 = BUILDER
                .comment(T11)
                .define(Y11, Day11);
        C11 = BUILDER
                .comment(X11)
                .define(O11, Numc11);
        D12 = BUILDER
                .comment(T12)
                .define(Y12, Day12);
        C12 = BUILDER
                .comment(X12)
                .define(O12, Numc12);
        D13 = BUILDER
                .comment(T13)
                .define(Y13, Day13);
        C13 = BUILDER
                .comment(X13)
                .define(O13, Numc13);
        D14 = BUILDER
                .comment(T14)
                .define(Y14, Day14);
        C14 = BUILDER
                .comment(X14)
                .define(O14, Numc14);
        D15 = BUILDER
                .comment(T15)
                .define(Y15, Day15);
        C15 = BUILDER
                .comment(X15)
                .define(O15, Numc15);
        D16 = BUILDER
                .comment(T16)
                .define(Y16, Day16);
        C16 = BUILDER
                .comment(X16)
                .define(O16, Numc16);
        D17 = BUILDER
                .comment(T17)
                .define(Y17, Day17);
        C17 = BUILDER
                .comment(X17)
                .define(O17, Numc17);
        D18 = BUILDER
                .comment(T18)
                .define(Y18, Day18);
        C18 = BUILDER
                .comment(X18)
                .define(O18, Numc18);
        D19 = BUILDER
                .comment(T19)
                .define(Y19, Day19);
        C19 = BUILDER
                .comment(X19)
                .define(O19, Numc19);
        D20 = BUILDER
                .comment(T20)
                .define(Y20, Day20);
        C20 = BUILDER
                .comment(X20)
                .define(O20, Numc20);
        D21 = BUILDER
                .comment(T21)
                .define(Y21, Day21);
        C21 = BUILDER
                .comment(X21)
                .define(O21, Numc21);
        D22 = BUILDER
                .comment(T22)
                .define(Y22, Day22);
        C22 = BUILDER
                .comment(X22)
                .define(O22, Numc22);
        D23 = BUILDER
                .comment(T23)
                .define(Y23, Day23);
        C23 = BUILDER
                .comment(X23)
                .define(O23, Numc23);
        D24 = BUILDER
                .comment(T24)
                .define(Y24, Day24);
        C24 = BUILDER
                .comment(X24)
                .define(O24, Numc24);
        D25 = BUILDER
                .comment(T25)
                .define(Y25, Day25);
        C25 = BUILDER
                .comment(X25)
                .define(O25, Numc25);
        D26 = BUILDER
                .comment(T26)
                .define(Y26, Day26);
        C26 = BUILDER
                .comment(X26)
                .define(O26, Numc26);
        D27 = BUILDER
                .comment(T27)
                .define(Y27, Day27);
        C27 = BUILDER
                .comment(X27)
                .define(O27, Numc27);
        D28 = BUILDER
                .comment(T28)
                .define(Y28, Day28);
        C28 = BUILDER
                .comment(X28)
                .define(O28, Numc28);
        D29 = BUILDER
                .comment(T29)
                .define(Y29, Day29);
        C29 = BUILDER
                .comment(X29)
                .define(O29, Numc29);
        D30 = BUILDER
                .comment(T30)
                .define(Y30, Day30);
        C30 = BUILDER
                .comment(X30)
                .define(O30, Numc30);
        D31 = BUILDER
                .comment(T31)
                .define(Y31, Day31);
        C31 = BUILDER
                .comment(X31)
                .define(O31, Numc31);
        DOt = BUILDER
                .comment(TOt)
                .define(YOt, DayOt);
        COt = BUILDER
                .comment(XOt)
                .define(OOt, NumcOt);
        BUILDER.pop();

    }

    public static final ForgeConfigSpec SPEC = BUILDER.build();
}
