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
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Latitude_Resolution" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Longitude_Resolution" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Horizontal_Resolution_Range" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Vertical_Resolution" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Vertical_Resolution_Range" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Temporal_Resolution" minOccurs="0"/&gt;
 *         &lt;element ref="{http://gcmd.gsfc.nasa.gov/Aboutus/xml/dif/}Temporal_Resolution_Range" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "latitudeResolution", "longitudeResolution", "horizontalResolutionRange", "verticalResolution", "verticalResolutionRange", "temporalResolution",
        "temporalResolutionRange" })
@XmlRootElement(name = "Data_Resolution")
public class DataResolution {

  @XmlElement(name = "Latitude_Resolution")
  protected String latitudeResolution;
  @XmlElement(name = "Longitude_Resolution")
  protected String longitudeResolution;
  @XmlElement(name = "Horizontal_Resolution_Range")
  protected String horizontalResolutionRange;
  @XmlElement(name = "Vertical_Resolution")
  protected String verticalResolution;
  @XmlElement(name = "Vertical_Resolution_Range")
  protected String verticalResolutionRange;
  @XmlElement(name = "Temporal_Resolution")
  protected String temporalResolution;
  @XmlElement(name = "Temporal_Resolution_Range")
  protected String temporalResolutionRange;

  /**
   * Gets the value of the latitudeResolution property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getLatitudeResolution() {
    return latitudeResolution;
  }

  /**
   * Sets the value of the latitudeResolution property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setLatitudeResolution(String value) {
    this.latitudeResolution = value;
  }

  /**
   * Gets the value of the longitudeResolution property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getLongitudeResolution() {
    return longitudeResolution;
  }

  /**
   * Sets the value of the longitudeResolution property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setLongitudeResolution(String value) {
    this.longitudeResolution = value;
  }

  /**
   * Gets the value of the horizontalResolutionRange property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getHorizontalResolutionRange() {
    return horizontalResolutionRange;
  }

  /**
   * Sets the value of the horizontalResolutionRange property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setHorizontalResolutionRange(String value) {
    this.horizontalResolutionRange = value;
  }

  /**
   * Gets the value of the verticalResolution property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getVerticalResolution() {
    return verticalResolution;
  }

  /**
   * Sets the value of the verticalResolution property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setVerticalResolution(String value) {
    this.verticalResolution = value;
  }

  /**
   * Gets the value of the verticalResolutionRange property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getVerticalResolutionRange() {
    return verticalResolutionRange;
  }

  /**
   * Sets the value of the verticalResolutionRange property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setVerticalResolutionRange(String value) {
    this.verticalResolutionRange = value;
  }

  /**
   * Gets the value of the temporalResolution property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getTemporalResolution() {
    return temporalResolution;
  }

  /**
   * Sets the value of the temporalResolution property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setTemporalResolution(String value) {
    this.temporalResolution = value;
  }

  /**
   * Gets the value of the temporalResolutionRange property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getTemporalResolutionRange() {
    return temporalResolutionRange;
  }

  /**
   * Sets the value of the temporalResolutionRange property.
   * 
   * @param value
   *          allowed object is {@link String }
   * 
   */
  public void setTemporalResolutionRange(String value) {
    this.temporalResolutionRange = value;
  }

}
