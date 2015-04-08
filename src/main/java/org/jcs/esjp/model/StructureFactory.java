package org.jcs.esjp.model;

import java.util.ArrayList;
import java.util.List;

public class StructureFactory
    extends StructureAbstract
{
    private final List<ObjectPurchase> objPurch;
    private final List<ObjectSale> objSale;

    public StructureFactory () {
        objPurch = new ArrayList<ObjectPurchase>();
        objSale = new ArrayList<ObjectSale>();
    }

    public List<ObjectPurchase> getObjPurch()
    {
        return objPurch;
    }

    public List<ObjectSale> getObjSale()
    {
        return objSale;
    }


}
