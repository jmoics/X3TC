package org.jcs.esjp.model;

import java.util.ArrayList;
import java.util.List;

public class Sector
{
    private String name;
    private Integer posX;
    private Integer posY;
    private Race race;
    private final List<StructureAbstract> lstStruct = new ArrayList<StructureAbstract>();
    private final List<StructureGate> lstGates = new ArrayList<StructureGate>();

    public Sector() {

    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public Integer getPosX()
    {
        return posX;
    }

    public void setPosX(final Integer posX)
    {
        this.posX = posX;
    }

    public Integer getPosY()
    {
        return posY;
    }

    public void setPosY(final Integer posY)
    {
        this.posY = posY;
    }

    public Race getRace()
    {
        return race;
    }

    public void setRace(final Race race)
    {
        this.race = race;
    }

    public List<StructureAbstract> getLstStruct()
    {
        return lstStruct;
    }

    public List<StructureGate> getLstGates()
    {
        return lstGates;
    }

    public void init() {

    }
}
