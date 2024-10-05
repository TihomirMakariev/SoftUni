package Java_OOP._09_InterfacesAndAbstraction.CarShopExtend_02;

import java.io.Serializable;

public interface Car extends Serializable {
    Integer TIRES = 4;

    String getModel();

    String getColor();

    Integer getHorsePower();

    String getCountryProduced();
}
