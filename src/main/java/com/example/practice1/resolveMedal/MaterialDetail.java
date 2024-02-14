package com.example.practice1.resolveMedal;

public class MaterialDetail {
    
    private final static String MATERIAL_GOLD = "金";
    private final static String MATERIAL_SILVER = "銀";
    private final static String MATERIAL_COPPER = "銅";
    private final static String MATERIAL_WOOD = "木";
    private final static int MATERIAL_GOLD_COST = 10000;
    private final static int MATERIAL_SILVER_COST = 5000;
    private final static int MATERIAL_COPPER_COST = 1000;
    private final static int MATERIAL_WOOD_COST = 500;
    private final static String MEDAL_GOLD = "金メダル";
    private final static String MEDAL__SILVER = "銀メダル";
    private final static String MEDAL__COPPER = "銅メダル";
    private final static String MEDAL_WOOD = "不良品";
    
    public static String getMedalGold() {
        return MEDAL_GOLD;
    }
    public static String getMedalSilver() {
        return MEDAL__SILVER;
    }
    public static String getMedalCopper() {
        return MEDAL__COPPER;
    }
    public static String getMedalWood() {
        return MEDAL_WOOD;
    }

    public static String getMaterialGold() {
        return MATERIAL_GOLD;
    }
    public static String getMaterialSilver() {
        return MATERIAL_SILVER;
    }
    public static String getMaterialCopper() {
        return MATERIAL_COPPER;
    }
    public static String getMaterialWood() {
        return MATERIAL_WOOD;
    }
    public static int getMaterialGoldCost() {
        return MATERIAL_GOLD_COST;
    }
    public static int getMaterialSilverCost() {
        return MATERIAL_SILVER_COST;
    }
    public static int getMaterialCopperCost() {
        return MATERIAL_COPPER_COST;
    }
    public static int getMaterialWoodCost() {
        return MATERIAL_WOOD_COST;
    }
    

}