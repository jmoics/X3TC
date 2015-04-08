package org.jcs.esjp.util;

import java.util.HashMap;
import java.util.Map;

public class Settings
{
    public enum FactorySettings
    {
        ASTILLERO("-----Astillero"),
        MUELLE("-----Muelle"),
        ESTACION_COMERCIAL("-----Estación comercial"),
        FACTORIA("-----Factoría"),
        MENA("-----Mena"),
        SILICIO("-----Obleas de Silicio"),
        NVIDIUM("-----Nividium"),
        HIELO("-----Hielo"),
        VACIO("-----");

        private final String key;

        private FactorySettings(final String _key)
        {
            this.key = _key;
        }

        public String getKey()
        {
            return this.key;
        }
    }

    public enum RaceSettings
    {
        ARGON("Argon", "#005588"),
        TERRAN("Terran", "#142c50"),
        BORON("Boron", "#362080"),
        TELADI("Teladi", "#1d401d"),
        PARANID("Paranid", "#402542"),
        SPLIT("Split", "#535008"),
        PIRATAS("Piratas", "black"),
        XENON("Xenon", "#5a1919"),
        KHAAK("Kha'ak", "#aa0520"),
        YAKI("Yaki", "#555555"),
        UNKNOWN("Desconocida", "#555555");

        private final String key;
        private final String color;

        private RaceSettings(final String _key,
                             final String _color)
        {
            this.key = _key;
            this.color = _color;
        }

        public String getKey()
        {
            return this.key;
        }

        public String getColor()
        {
            return this.color;
        }
    }

    public static Map<String, String> RACE2COLOR = new HashMap<String, String>();
    static {
        Settings.RACE2COLOR.put("Argon", "#005588");
        Settings.RACE2COLOR.put("Terran", "#142c50");
        Settings.RACE2COLOR.put("Boron", "#362080");
        Settings.RACE2COLOR.put("Teladi", "#1d401d");
        Settings.RACE2COLOR.put("Paranid", "#402542");
        Settings.RACE2COLOR.put("Split", "#535008");
        Settings.RACE2COLOR.put("Piratas", "black");
        Settings.RACE2COLOR.put("Xenon", "#5a1919");
        Settings.RACE2COLOR.put("Kha'ak", "#aa0520");
        Settings.RACE2COLOR.put("Yaki", "#555555");
        Settings.RACE2COLOR.put("Desconocida", "#555555");
    }

    public enum GateSettings
    {
        NORTH("NO"),
        SOUTH("SO"),
        EAST("EA"),
        WEST("WE");

        private final String key;

        private GateSettings(final String _key)
        {
            this.key = _key;
        }

        public String getKey()
        {
            return this.key;
        }
    }
}
