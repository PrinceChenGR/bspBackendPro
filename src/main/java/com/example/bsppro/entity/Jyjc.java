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
public class Jyjc implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "jyid", type = IdType.AUTO)
    private Integer jyid;

    @TableField("teamid")
    private Integer teamid;

    @TableField("insid")
    private Integer insid;

    @TableField("nilc")
    private Integer nilc;

    @TableField("pgtime")
    private Date pgtime;

    @TableField("gototime")
    private Date gototime;

    @TableField("gotoaddress")
    private String gotoaddress;

    @TableField("dotime")
    private Date dotime;

    @TableField("doaddress")
    private String doaddress;

    @TableField("overtime")
    private Date overtime;


}
