package com.example.myappvolleytest;

public class Civilization {
    Integer id;
    String name;
    String expansion;
    String army_type;
    String[] unique_unit_list;
    String[] unique_tech_list;
    String[] civ_bonus_list;

    public Civilization(){

    }

    public Civilization(Integer civID, String civName, String civExpansion, String civArmyType,
                        String[] civUnit, String[] civTech, String[] civBonus){
        this.id = civID;
        this.name = civName;
        this.expansion = civExpansion;
        this.army_type = civArmyType;
        this.unique_unit_list = civUnit;
        this.unique_tech_list = civTech;
        this.civ_bonus_list = civBonus;
    }







    //region GETTER SETTER
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public String getArmy_type() {
        return army_type;
    }

    public void setArmy_type(String army_type) {
        this.army_type = army_type;
    }

    public String[] getUnique_unit_list() {
        return unique_unit_list;
    }

    public void setUnique_unit_list(String[] unique_unit_list) {
        this.unique_unit_list = unique_unit_list;
    }

    public String[] getUnique_tech_list() {
        return unique_tech_list;
    }

    public void setUnique_tech_list(String[] unique_tech_list) {
        this.unique_tech_list = unique_tech_list;
    }

    public String[] getCiv_bonus_list() {
        return civ_bonus_list;
    }

    public void setCiv_bonus_list(String[] civ_bonus_list) {
        this.civ_bonus_list = civ_bonus_list;
    }
    //endregion
}
