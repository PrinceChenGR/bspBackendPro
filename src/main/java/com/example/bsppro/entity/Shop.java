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
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "shopid", type = IdType.AUTO)
    private String shopid;

    @TableField("firmno")
    private String firmno;

    @TableField("stateid")
    private Integer stateid;

    @TableField("storeid")
    private String storeid;

    @TableField("unitid")
    private Integer unitid;

    @TableField("gid")
    private Integer gid;

    @TableField("shopname")
    private String shopname;

    @TableField("sBrand")
    private String sBrand;

    @TableField("weight")
    private Integer weight;

    @TableField("pictrueUrl")
    private String pictrueUrl;

    @TableField("stockprice")
    private Float stockprice;

    @TableField("bjmoney")
    private Float bjmoney;

    @TableField("hymoney")
    private Float hymoney;

    @TableField("vipmoney")
    private Float vipmoney;

    @TableField("rxyprice")
    private Float rxyprice;


}
