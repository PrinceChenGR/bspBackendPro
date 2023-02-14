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
public class Instation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "insid", type = IdType.AUTO)
    private Integer insid;

    @TableField("wxstateid")
    private Integer wxstateid;

    @TableField("artisanid")
    private String artisanid;

    @TableField("ctsid")
    private Integer ctsid;

    @TableField("instation")
    private String instation;

    @TableField("jsyuan")
    private String jsyuan;

    @TableField("joininstimes")
    private Date joininstimes;

    @TableField("predictcompletetime")
    private Date predictcompletetime;

    @TableField("predicttime")
    private Date predicttime;

    @TableField("budgetmoney")
    private Float budgetmoney;

    @TableField("insevent")
    private String insevent;

    @TableField("iszn")
    private Boolean iszn;

    @TableField("ifjs")
    private Boolean ifjs;


}
