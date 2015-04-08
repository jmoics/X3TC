package org.jcs.esjp.model;

import java.util.ArrayList;
import java.util.List;

public class StructureNormal
    extends StructureAbstract
{
    private final List<ObjectSale> objSale;

    public StructureNormal () {
        objSale = new ArrayList<ObjectSale>();
    }

    public List<ObjectSale> getObjSale()
    {
        return objSale;
    }
}
