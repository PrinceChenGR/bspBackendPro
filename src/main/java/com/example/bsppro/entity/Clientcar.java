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
public class Clientcar implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cno", type = IdType.AUTO)
    private String cno;

    @TableField("clientno")
    private String clientno;

    @TableField("ctsid")
    private Integer ctsid;

    @TableField("driver")
    private String driver;

    @TableField("driverphone")
    private String driverphone;

    @TableField("driverbirth")
    private Date driverbirth;

    @TableField("clicang")
    private Integer clicang;

    @TableField("purchasetime")
    private Date purchasetime;

    @TableField("jctime")
    private Date jctime;


}
