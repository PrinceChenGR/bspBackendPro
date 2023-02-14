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
public class Repair implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rid", type = IdType.AUTO)
    private Integer rid;

    @TableField("ftype")
    private Integer ftype;

    @TableField("xtype")
    private Integer xtype;

    @TableField("repairname")
    private String repairname;

    @TableField("repevent")
    private String repevent;

    @TableField("rjbmoney")
    private Float rjbmoney;

    @TableField("rhymoney")
    private Float rhymoney;

    @TableField("rvipmoney")
    private Float rvipmoney;

    @TableField("repxyperice")
    private Float repxyperice;


}
