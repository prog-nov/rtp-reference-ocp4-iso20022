//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.07 at 12:45:54 PM EST 
//


package iso.std.iso._20022.tech.xsd.camt_029_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificationRejection2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModificationRejection2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UM01"/>
 *     &lt;enumeration value="UM02"/>
 *     &lt;enumeration value="UM03"/>
 *     &lt;enumeration value="UM04"/>
 *     &lt;enumeration value="UM05"/>
 *     &lt;enumeration value="UM06"/>
 *     &lt;enumeration value="UM07"/>
 *     &lt;enumeration value="UM08"/>
 *     &lt;enumeration value="UM09"/>
 *     &lt;enumeration value="UM10"/>
 *     &lt;enumeration value="UM11"/>
 *     &lt;enumeration value="UM12"/>
 *     &lt;enumeration value="UM13"/>
 *     &lt;enumeration value="UM14"/>
 *     &lt;enumeration value="UM15"/>
 *     &lt;enumeration value="UM16"/>
 *     &lt;enumeration value="UM17"/>
 *     &lt;enumeration value="UM18"/>
 *     &lt;enumeration value="UM19"/>
 *     &lt;enumeration value="UM20"/>
 *     &lt;enumeration value="UM21"/>
 *     &lt;enumeration value="UM22"/>
 *     &lt;enumeration value="UM23"/>
 *     &lt;enumeration value="UM24"/>
 *     &lt;enumeration value="UM25"/>
 *     &lt;enumeration value="UM26"/>
 *     &lt;enumeration value="UM27"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModificationRejection2Code")
@XmlEnum
public enum ModificationRejection2Code {

    @XmlEnumValue("UM01")
    UM_01("UM01"),
    @XmlEnumValue("UM02")
    UM_02("UM02"),
    @XmlEnumValue("UM03")
    UM_03("UM03"),
    @XmlEnumValue("UM04")
    UM_04("UM04"),
    @XmlEnumValue("UM05")
    UM_05("UM05"),
    @XmlEnumValue("UM06")
    UM_06("UM06"),
    @XmlEnumValue("UM07")
    UM_07("UM07"),
    @XmlEnumValue("UM08")
    UM_08("UM08"),
    @XmlEnumValue("UM09")
    UM_09("UM09"),
    @XmlEnumValue("UM10")
    UM_10("UM10"),
    @XmlEnumValue("UM11")
    UM_11("UM11"),
    @XmlEnumValue("UM12")
    UM_12("UM12"),
    @XmlEnumValue("UM13")
    UM_13("UM13"),
    @XmlEnumValue("UM14")
    UM_14("UM14"),
    @XmlEnumValue("UM15")
    UM_15("UM15"),
    @XmlEnumValue("UM16")
    UM_16("UM16"),
    @XmlEnumValue("UM17")
    UM_17("UM17"),
    @XmlEnumValue("UM18")
    UM_18("UM18"),
    @XmlEnumValue("UM19")
    UM_19("UM19"),
    @XmlEnumValue("UM20")
    UM_20("UM20"),
    @XmlEnumValue("UM21")
    UM_21("UM21"),
    @XmlEnumValue("UM22")
    UM_22("UM22"),
    @XmlEnumValue("UM23")
    UM_23("UM23"),
    @XmlEnumValue("UM24")
    UM_24("UM24"),
    @XmlEnumValue("UM25")
    UM_25("UM25"),
    @XmlEnumValue("UM26")
    UM_26("UM26"),
    @XmlEnumValue("UM27")
    UM_27("UM27");
    private final String value;

    ModificationRejection2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModificationRejection2Code fromValue(String v) {
        for (ModificationRejection2Code c: ModificationRejection2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
