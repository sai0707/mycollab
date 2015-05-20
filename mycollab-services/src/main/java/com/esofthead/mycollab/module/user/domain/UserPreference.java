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
/*Domain class of table s_user_preference*/
package com.esofthead.mycollab.module.user.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import java.util.Date;

@SuppressWarnings("ucd")
@com.esofthead.mycollab.core.db.metadata.Table("s_user_preference")
public class UserPreference extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_preference.id
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_preference.username
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("username")
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_preference.lastModuleVisit
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("lastModuleVisit")
    private String lastmodulevisit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_preference.lastAccessedTime
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("lastAccessedTime")
    private Date lastaccessedtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_user_preference.sAccountId
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sAccountId")
    private Integer saccountid;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_preference.id
     *
     * @return the value of s_user_preference.id
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_preference.id
     *
     * @param id the value for s_user_preference.id
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_preference.username
     *
     * @return the value of s_user_preference.username
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_preference.username
     *
     * @param username the value for s_user_preference.username
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_preference.lastModuleVisit
     *
     * @return the value of s_user_preference.lastModuleVisit
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public String getLastmodulevisit() {
        return lastmodulevisit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_preference.lastModuleVisit
     *
     * @param lastmodulevisit the value for s_user_preference.lastModuleVisit
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public void setLastmodulevisit(String lastmodulevisit) {
        this.lastmodulevisit = lastmodulevisit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_preference.lastAccessedTime
     *
     * @return the value of s_user_preference.lastAccessedTime
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public Date getLastaccessedtime() {
        return lastaccessedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_preference.lastAccessedTime
     *
     * @param lastaccessedtime the value for s_user_preference.lastAccessedTime
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public void setLastaccessedtime(Date lastaccessedtime) {
        this.lastaccessedtime = lastaccessedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_user_preference.sAccountId
     *
     * @return the value of s_user_preference.sAccountId
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_user_preference.sAccountId
     *
     * @param saccountid the value for s_user_preference.sAccountId
     *
     * @mbggenerated Mon May 18 10:06:57 ICT 2015
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    public static enum Field {
        id,
        username,
        lastmodulevisit,
        lastaccessedtime,
        saccountid;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}