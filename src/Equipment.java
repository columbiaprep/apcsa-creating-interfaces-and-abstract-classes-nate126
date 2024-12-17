//represents items that can be equipped or unequipped by entities

public abstract class Equipment extends Item{
    private String typeOfEquipment;

    public void equip() {

    }



    public void unequip(){

    }


    public Equipment(String typeOfEquipment) {
        super();
        this.typeOfEquipment = typeOfEquipment;
    }

}