/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you 
 * may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.07 at 01:56:59 PM PDT 
//

package org.esipfed.eskg.structures;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Paleo_Start_Date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Paleo_Stop_Date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Chronostratigraphic_Unit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "paleoStartDate", "paleoStopDate", "chronostratigraphicUnit" })
@XmlRootElement(name = "Paleo_Temporal_Coverage")
public class PaleoTemporalCoverage {

  @XmlElement(name = "Paleo_Start_Date")
  protected String paleoStartDate;
  @XmlElement(name = "Paleo_Stop_Date")
  protected String paleoStopDate;
  @XmlElement(name = "Chronostratigraphic_Unit")
  protected List<ChronostratigraphicUnit> chronostratigraphicUnit;

  /**
   * Gets the value of the paleoStartDate property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getPaleoStartDate() {
    return paleoStartDate;
  }

  /**
   * Sets the value of the paleoStartDate property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setPaleoStartDate(String value) {
    this.paleoStartDate = value;
  }

  /**
   * Gets the value of the paleoStopDate property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getPaleoStopDate() {
    return paleoStopDate;
  }

  /**
   * Sets the value of the paleoStopDate property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setPaleoStopDate(String value) {
    this.paleoStopDate = value;
  }

  /**
   * Gets the value of the chronostratigraphicUnit property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the chronostratigraphicUnit property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getChronostratigraphicUnit().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ChronostratigraphicUnit }
   * 
   * 
   */
  public List<ChronostratigraphicUnit> getChronostratigraphicUnit() {
    if (chronostratigraphicUnit == null) {
      chronostratigraphicUnit = new ArrayList<ChronostratigraphicUnit>();
    }
    return this.chronostratigraphicUnit;
  }

}
