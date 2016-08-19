/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table s_billing_plan*/
package com.mycollab.module.user.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("s_billing_plan")
public class BillingPlan extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_billing_plan.id
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_billing_plan.billingType
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("billingType")
    private String billingtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_billing_plan.numUsers
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    @Column("numUsers")
    private Integer numusers;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_billing_plan.volume
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    @Column("volume")
    private Long volume;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_billing_plan.numProjects
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    @Column("numProjects")
    private Integer numprojects;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_billing_plan.pricing
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    @Column("pricing")
    private Double pricing;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_billing_plan.description
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    @Length(max=1000, message="Field value is too long")
    @Column("description")
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_billing_plan.shoppingUrl
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    @Length(max=400, message="Field value is too long")
    @Column("shoppingUrl")
    private String shoppingurl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_billing_plan.productPath
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("productPath")
    private String productpath;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        BillingPlan item = (BillingPlan)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(499, 1443).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_billing_plan.id
     *
     * @return the value of s_billing_plan.id
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_billing_plan.id
     *
     * @param id the value for s_billing_plan.id
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_billing_plan.billingType
     *
     * @return the value of s_billing_plan.billingType
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public String getBillingtype() {
        return billingtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_billing_plan.billingType
     *
     * @param billingtype the value for s_billing_plan.billingType
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public void setBillingtype(String billingtype) {
        this.billingtype = billingtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_billing_plan.numUsers
     *
     * @return the value of s_billing_plan.numUsers
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public Integer getNumusers() {
        return numusers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_billing_plan.numUsers
     *
     * @param numusers the value for s_billing_plan.numUsers
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public void setNumusers(Integer numusers) {
        this.numusers = numusers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_billing_plan.volume
     *
     * @return the value of s_billing_plan.volume
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public Long getVolume() {
        return volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_billing_plan.volume
     *
     * @param volume the value for s_billing_plan.volume
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public void setVolume(Long volume) {
        this.volume = volume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_billing_plan.numProjects
     *
     * @return the value of s_billing_plan.numProjects
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public Integer getNumprojects() {
        return numprojects;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_billing_plan.numProjects
     *
     * @param numprojects the value for s_billing_plan.numProjects
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public void setNumprojects(Integer numprojects) {
        this.numprojects = numprojects;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_billing_plan.pricing
     *
     * @return the value of s_billing_plan.pricing
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public Double getPricing() {
        return pricing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_billing_plan.pricing
     *
     * @param pricing the value for s_billing_plan.pricing
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public void setPricing(Double pricing) {
        this.pricing = pricing;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_billing_plan.description
     *
     * @return the value of s_billing_plan.description
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_billing_plan.description
     *
     * @param description the value for s_billing_plan.description
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_billing_plan.shoppingUrl
     *
     * @return the value of s_billing_plan.shoppingUrl
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public String getShoppingurl() {
        return shoppingurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_billing_plan.shoppingUrl
     *
     * @param shoppingurl the value for s_billing_plan.shoppingUrl
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public void setShoppingurl(String shoppingurl) {
        this.shoppingurl = shoppingurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_billing_plan.productPath
     *
     * @return the value of s_billing_plan.productPath
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public String getProductpath() {
        return productpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_billing_plan.productPath
     *
     * @param productpath the value for s_billing_plan.productPath
     *
     * @mbggenerated Wed Aug 17 20:00:18 ICT 2016
     */
    public void setProductpath(String productpath) {
        this.productpath = productpath;
    }

    public enum Field {
        id,
        billingtype,
        numusers,
        volume,
        numprojects,
        pricing,
        description,
        shoppingurl,
        productpath;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}