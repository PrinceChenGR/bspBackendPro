package com.example.bsppro.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author LT
 * @since 2023-02-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "employeeid", type = IdType.AUTO)
    private String employeeid;

    @TableField("propertyid")
    private Integer propertyid;

    @TableField("storeid")
    private String storeid;

    @TableField("departmentid")
    private Integer departmentid;

    @TableField("stateid")
    private Integer stateid;

    @TableField("empname")
    private String empname;

    @TableField("esex")
    private Integer esex;

    @TableField("emplogenid")
    private String emplogenid;

    @TableField("emplogepaw")
    private String emplogepaw;

    @TableField("education")
    private String education;

    @TableField("graduationschool")
    private String graduationschool;

    @TableField("major")
    private String major;

    @TableField("crrdID")
    private String crrdID;

    @TableField("address")
    private String address;

    @TableField("newaddress")
    private String newaddress;

    @TableField("empphone")
    private String empphone;

    @TableField("emergencyphone")
    private String emergencyphone;

    @TableField("molphone")
    private String molphone;

    @TableField("email")
    private String email;

    @TableField("entrytimes")
    private Date entrytimes;

    @TableField("lztimes")
    private Date lztimes;

    @TableField("brithtimes")
    private Date brithtimes;


}
