package com.example.apitest.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName tcs_doctor
 */
@TableName(value ="tcs_doctor")
@Data
public class Doctor implements Serializable {
    /**
     * 医生表主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 医生登录工号
     */
    private String loginId;

    /**
     * 数据源标识
     */
    private Integer dbSourceId;

    /**
     * 医生姓名
     */
    private String doctorName;

    /**
     * 医生科室
     */
    private String department;

    /**
     * 医生职称
     */
    private String professionalTitle;

    /**
     * 医生描述
     */
    private String description;

    /**
     * 是否删除
     */
    private Boolean flagDelete;

    /**
     * 数据插入类型(手动插入或者同步)
     */
    private Integer dataType;

    /**
     * 是否显示（门诊专家是否显示）
     */
    private Boolean flagShow;

    /**
     * 医生图片url地址
     */
    private String doctorImgUrl;

    /**
     * 扩展字段
     */
    private String other;

    /**
     * 最后更新时间
     */
    private Date lastUpdateTime;

    /**
     * 叫号器热键
     */
    private String hotKey;

    /**
     * 
     */
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Doctor other = (Doctor) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLoginId() == null ? other.getLoginId() == null : this.getLoginId().equals(other.getLoginId()))
            && (this.getDbSourceId() == null ? other.getDbSourceId() == null : this.getDbSourceId().equals(other.getDbSourceId()))
            && (this.getDoctorName() == null ? other.getDoctorName() == null : this.getDoctorName().equals(other.getDoctorName()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getProfessionalTitle() == null ? other.getProfessionalTitle() == null : this.getProfessionalTitle().equals(other.getProfessionalTitle()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getFlagDelete() == null ? other.getFlagDelete() == null : this.getFlagDelete().equals(other.getFlagDelete()))
            && (this.getDataType() == null ? other.getDataType() == null : this.getDataType().equals(other.getDataType()))
            && (this.getFlagShow() == null ? other.getFlagShow() == null : this.getFlagShow().equals(other.getFlagShow()))
            && (this.getDoctorImgUrl() == null ? other.getDoctorImgUrl() == null : this.getDoctorImgUrl().equals(other.getDoctorImgUrl()))
            && (this.getOther() == null ? other.getOther() == null : this.getOther().equals(other.getOther()))
            && (this.getLastUpdateTime() == null ? other.getLastUpdateTime() == null : this.getLastUpdateTime().equals(other.getLastUpdateTime()))
            && (this.getHotKey() == null ? other.getHotKey() == null : this.getHotKey().equals(other.getHotKey()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLoginId() == null) ? 0 : getLoginId().hashCode());
        result = prime * result + ((getDbSourceId() == null) ? 0 : getDbSourceId().hashCode());
        result = prime * result + ((getDoctorName() == null) ? 0 : getDoctorName().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getProfessionalTitle() == null) ? 0 : getProfessionalTitle().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getFlagDelete() == null) ? 0 : getFlagDelete().hashCode());
        result = prime * result + ((getDataType() == null) ? 0 : getDataType().hashCode());
        result = prime * result + ((getFlagShow() == null) ? 0 : getFlagShow().hashCode());
        result = prime * result + ((getDoctorImgUrl() == null) ? 0 : getDoctorImgUrl().hashCode());
        result = prime * result + ((getOther() == null) ? 0 : getOther().hashCode());
        result = prime * result + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        result = prime * result + ((getHotKey() == null) ? 0 : getHotKey().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginId=").append(loginId);
        sb.append(", dbSourceId=").append(dbSourceId);
        sb.append(", doctorName=").append(doctorName);
        sb.append(", department=").append(department);
        sb.append(", professionalTitle=").append(professionalTitle);
        sb.append(", description=").append(description);
        sb.append(", flagDelete=").append(flagDelete);
        sb.append(", dataType=").append(dataType);
        sb.append(", flagShow=").append(flagShow);
        sb.append(", doctorImgUrl=").append(doctorImgUrl);
        sb.append(", other=").append(other);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", hotKey=").append(hotKey);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}