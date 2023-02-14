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
public class Firm implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "firmno", type = IdType.AUTO)
    private String firmno;

    @TableField("cityid")
    private Integer cityid;

    @TableField("firmname")
    private String firmname;

    @TableField("firmaddress")
    private String firmaddress;

    @TableField("url")
    private String url;

    @TableField("gsphone")
    private String gsphone;

    @TableField("lxr")
    private String lxr;

    @TableField("lxrphone")
    private String lxrphone;

    @TableField("scity")
    private String scity;

    @TableField("firmsevenst")
    private String firmsevenst;


}
