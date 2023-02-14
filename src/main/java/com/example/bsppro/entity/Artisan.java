package com.example.bsppro.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class Artisan implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "artisanid", type = IdType.AUTO)
    private String artisanid;

    @TableField("teamid")
    private Integer teamid;

    @TableField("starsid")
    private Integer starsid;

    @TableField("isgroup")
    private Boolean isgroup;

    @TableField("aname")
    private String aname;

    @TableField("asex")
    private Integer asex;

    @TableField("aphone")
    private String aphone;

    @TableField("loginaid")
    private String loginaid;

    @TableField("loginapaw")
    private String loginapaw;

    @TableField("idcaid")
    private String idcaid;

    @TableField("araddress")
    private String araddress;

    @TableField("craft")
    private String craft;

    @TableField("maintainBrand")
    private String maintainBrand;


}
