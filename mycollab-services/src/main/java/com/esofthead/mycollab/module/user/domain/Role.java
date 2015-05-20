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
/*Domain class of table s_roles*/
package com.esofthead.mycollab.module.user.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;

@SuppressWarnings("ucd")
@com.esofthead.mycollab.core.db.metadata.Table("s_roles")
public class Role extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_roles.id
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_roles.rolename
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("rolename")
    private String rolename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_roles.description
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("description")
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_roles.sAccountId
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_roles.isSystemRole
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("isSystemRole")
    private Boolean issystemrole;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_roles.id
     *
     * @return the value of s_roles.id
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_roles.id
     *
     * @param id the value for s_roles.id
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_roles.rolename
     *
     * @return the value of s_roles.rolename
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_roles.rolename
     *
     * @param rolename the value for s_roles.rolename
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_roles.description
     *
     * @return the value of s_roles.description
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_roles.description
     *
     * @param description the value for s_roles.description
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_roles.sAccountId
     *
     * @return the value of s_roles.sAccountId
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_roles.sAccountId
     *
     * @param saccountid the value for s_roles.sAccountId
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_roles.isSystemRole
     *
     * @return the value of s_roles.isSystemRole
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public Boolean getIssystemrole() {
        return issystemrole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_roles.isSystemRole
     *
     * @param issystemrole the value for s_roles.isSystemRole
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public void setIssystemrole(Boolean issystemrole) {
        this.issystemrole = issystemrole;
    }

    public static enum Field {
        id,
        rolename,
        description,
        saccountid,
        issystemrole;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}