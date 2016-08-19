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
/*Domain class of table m_prj_task*/
package com.mycollab.module.project.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_prj_task")
public class Task extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.id
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.taskname
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Length(max=255, message="Field value is too long")
    @Column("taskname")
    private String taskname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.percentagecomplete
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("percentagecomplete")
    private Double percentagecomplete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.startdate
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("startdate")
    private Date startdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.enddate
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("enddate")
    private Date enddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.priority
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("priority")
    private String priority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.duration
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("duration")
    private Long duration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.isestimated
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("isestimated")
    private Boolean isestimated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.projectId
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("projectId")
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.deadline
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("deadline")
    private Date deadline;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.taskindex
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("taskindex")
    private Integer taskindex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.createdTime
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.lastUpdatedTime
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("lastUpdatedTime")
    private Date lastupdatedtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.assignUser
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("assignUser")
    private String assignuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.sAccountId
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("sAccountId")
    private Integer saccountid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.status
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("status")
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.logBy
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Length(max=45, message="Field value is too long")
    @Column("logBy")
    private String logby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.taskkey
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("taskkey")
    private Integer taskkey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.originalEstimate
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("originalEstimate")
    private Double originalestimate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.remainEstimate
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("remainEstimate")
    private Double remainestimate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.parentTaskId
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("parentTaskId")
    private Integer parenttaskid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.milestoneId
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("milestoneId")
    private Integer milestoneid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.ganttindex
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Column("ganttindex")
    private Integer ganttindex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_task.notes
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    @Length(max=16777215, message="Field value is too long")
    @Column("notes")
    private String notes;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        Task item = (Task)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(657, 201).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.id
     *
     * @return the value of m_prj_task.id
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.id
     *
     * @param id the value for m_prj_task.id
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.taskname
     *
     * @return the value of m_prj_task.taskname
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public String getTaskname() {
        return taskname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.taskname
     *
     * @param taskname the value for m_prj_task.taskname
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.percentagecomplete
     *
     * @return the value of m_prj_task.percentagecomplete
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Double getPercentagecomplete() {
        return percentagecomplete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.percentagecomplete
     *
     * @param percentagecomplete the value for m_prj_task.percentagecomplete
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setPercentagecomplete(Double percentagecomplete) {
        this.percentagecomplete = percentagecomplete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.startdate
     *
     * @return the value of m_prj_task.startdate
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Date getStartdate() {
        return startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.startdate
     *
     * @param startdate the value for m_prj_task.startdate
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.enddate
     *
     * @return the value of m_prj_task.enddate
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.enddate
     *
     * @param enddate the value for m_prj_task.enddate
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.priority
     *
     * @return the value of m_prj_task.priority
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public String getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.priority
     *
     * @param priority the value for m_prj_task.priority
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.duration
     *
     * @return the value of m_prj_task.duration
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.duration
     *
     * @param duration the value for m_prj_task.duration
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.isestimated
     *
     * @return the value of m_prj_task.isestimated
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Boolean getIsestimated() {
        return isestimated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.isestimated
     *
     * @param isestimated the value for m_prj_task.isestimated
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setIsestimated(Boolean isestimated) {
        this.isestimated = isestimated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.projectId
     *
     * @return the value of m_prj_task.projectId
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.projectId
     *
     * @param projectid the value for m_prj_task.projectId
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.deadline
     *
     * @return the value of m_prj_task.deadline
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.deadline
     *
     * @param deadline the value for m_prj_task.deadline
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.taskindex
     *
     * @return the value of m_prj_task.taskindex
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Integer getTaskindex() {
        return taskindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.taskindex
     *
     * @param taskindex the value for m_prj_task.taskindex
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setTaskindex(Integer taskindex) {
        this.taskindex = taskindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.createdTime
     *
     * @return the value of m_prj_task.createdTime
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.createdTime
     *
     * @param createdtime the value for m_prj_task.createdTime
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.lastUpdatedTime
     *
     * @return the value of m_prj_task.lastUpdatedTime
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_prj_task.lastUpdatedTime
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.assignUser
     *
     * @return the value of m_prj_task.assignUser
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public String getAssignuser() {
        return assignuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.assignUser
     *
     * @param assignuser the value for m_prj_task.assignUser
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setAssignuser(String assignuser) {
        this.assignuser = assignuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.sAccountId
     *
     * @return the value of m_prj_task.sAccountId
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.sAccountId
     *
     * @param saccountid the value for m_prj_task.sAccountId
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.status
     *
     * @return the value of m_prj_task.status
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.status
     *
     * @param status the value for m_prj_task.status
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.logBy
     *
     * @return the value of m_prj_task.logBy
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public String getLogby() {
        return logby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.logBy
     *
     * @param logby the value for m_prj_task.logBy
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setLogby(String logby) {
        this.logby = logby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.taskkey
     *
     * @return the value of m_prj_task.taskkey
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Integer getTaskkey() {
        return taskkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.taskkey
     *
     * @param taskkey the value for m_prj_task.taskkey
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setTaskkey(Integer taskkey) {
        this.taskkey = taskkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.originalEstimate
     *
     * @return the value of m_prj_task.originalEstimate
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Double getOriginalestimate() {
        return originalestimate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.originalEstimate
     *
     * @param originalestimate the value for m_prj_task.originalEstimate
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setOriginalestimate(Double originalestimate) {
        this.originalestimate = originalestimate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.remainEstimate
     *
     * @return the value of m_prj_task.remainEstimate
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Double getRemainestimate() {
        return remainestimate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.remainEstimate
     *
     * @param remainestimate the value for m_prj_task.remainEstimate
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setRemainestimate(Double remainestimate) {
        this.remainestimate = remainestimate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.parentTaskId
     *
     * @return the value of m_prj_task.parentTaskId
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Integer getParenttaskid() {
        return parenttaskid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.parentTaskId
     *
     * @param parenttaskid the value for m_prj_task.parentTaskId
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setParenttaskid(Integer parenttaskid) {
        this.parenttaskid = parenttaskid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.milestoneId
     *
     * @return the value of m_prj_task.milestoneId
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Integer getMilestoneid() {
        return milestoneid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.milestoneId
     *
     * @param milestoneid the value for m_prj_task.milestoneId
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setMilestoneid(Integer milestoneid) {
        this.milestoneid = milestoneid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.ganttindex
     *
     * @return the value of m_prj_task.ganttindex
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public Integer getGanttindex() {
        return ganttindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.ganttindex
     *
     * @param ganttindex the value for m_prj_task.ganttindex
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setGanttindex(Integer ganttindex) {
        this.ganttindex = ganttindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_task.notes
     *
     * @return the value of m_prj_task.notes
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_task.notes
     *
     * @param notes the value for m_prj_task.notes
     *
     * @mbggenerated Wed Aug 17 20:00:24 ICT 2016
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public enum Field {
        id,
        taskname,
        percentagecomplete,
        startdate,
        enddate,
        priority,
        duration,
        isestimated,
        projectid,
        deadline,
        taskindex,
        createdtime,
        lastupdatedtime,
        assignuser,
        saccountid,
        status,
        logby,
        taskkey,
        originalestimate,
        remainestimate,
        parenttaskid,
        milestoneid,
        ganttindex,
        notes;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}