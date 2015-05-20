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
/*Domain class of table m_ecm_driveinfo*/
package com.esofthead.mycollab.module.ecm.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;

@SuppressWarnings("ucd")
@com.esofthead.mycollab.core.db.metadata.Table("m_ecm_driveinfo")
public class DriveInfo extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_ecm_driveinfo.id
     *
     * @mbggenerated Mon May 18 10:06:59 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_ecm_driveinfo.sAccountId
     *
     * @mbggenerated Mon May 18 10:06:59 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_ecm_driveinfo.usedVolume
     *
     * @mbggenerated Mon May 18 10:06:59 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("usedVolume")
    private Long usedvolume;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_ecm_driveinfo.id
     *
     * @return the value of m_ecm_driveinfo.id
     *
     * @mbggenerated Mon May 18 10:06:59 ICT 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_ecm_driveinfo.id
     *
     * @param id the value for m_ecm_driveinfo.id
     *
     * @mbggenerated Mon May 18 10:06:59 ICT 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_ecm_driveinfo.sAccountId
     *
     * @return the value of m_ecm_driveinfo.sAccountId
     *
     * @mbggenerated Mon May 18 10:06:59 ICT 2015
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_ecm_driveinfo.sAccountId
     *
     * @param saccountid the value for m_ecm_driveinfo.sAccountId
     *
     * @mbggenerated Mon May 18 10:06:59 ICT 2015
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_ecm_driveinfo.usedVolume
     *
     * @return the value of m_ecm_driveinfo.usedVolume
     *
     * @mbggenerated Mon May 18 10:06:59 ICT 2015
     */
    public Long getUsedvolume() {
        return usedvolume;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_ecm_driveinfo.usedVolume
     *
     * @param usedvolume the value for m_ecm_driveinfo.usedVolume
     *
     * @mbggenerated Mon May 18 10:06:59 ICT 2015
     */
    public void setUsedvolume(Long usedvolume) {
        this.usedvolume = usedvolume;
    }

    public static enum Field {
        id,
        saccountid,
        usedvolume;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}