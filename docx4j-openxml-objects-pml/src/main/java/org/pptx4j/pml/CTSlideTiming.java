/*
 *  Copyright 2010-2012, Plutext Pty Ltd.
 *   
 *  This file is part of pptx4j, a component of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */
package org.pptx4j.pml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_SlideTiming complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_SlideTiming">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tnLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_TimeNodeList" minOccurs="0"/>
 *         &lt;element name="bldLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_BuildList" minOccurs="0"/>
 *         &lt;element name="extLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_ExtensionListModify" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_SlideTiming", propOrder = {
    "tnLst",
    "bldLst",
    "extLst"
})
public class CTSlideTiming {

    protected CTTimeNodeList tnLst;
    protected CTBuildList bldLst;
    protected CTExtensionListModify extLst;

    /**
     * Gets the value of the tnLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTTimeNodeList }
     *     
     */
    public CTTimeNodeList getTnLst() {
        return tnLst;
    }

    /**
     * Sets the value of the tnLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTTimeNodeList }
     *     
     */
    public void setTnLst(CTTimeNodeList value) {
        this.tnLst = value;
    }

    /**
     * Gets the value of the bldLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTBuildList }
     *     
     */
    public CTBuildList getBldLst() {
        return bldLst;
    }

    /**
     * Sets the value of the bldLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTBuildList }
     *     
     */
    public void setBldLst(CTBuildList value) {
        this.bldLst = value;
    }

    /**
     * Gets the value of the extLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTExtensionListModify }
     *     
     */
    public CTExtensionListModify getExtLst() {
        return extLst;
    }

    /**
     * Sets the value of the extLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTExtensionListModify }
     *     
     */
    public void setExtLst(CTExtensionListModify value) {
        this.extLst = value;
    }

}