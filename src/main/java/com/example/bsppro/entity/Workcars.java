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
public class Workcars implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "wid", type = IdType.AUTO)
    private Integer wid;

    @TableField("teamid")
    private Integer teamid;

    @TableField("caid")
    private String caid;

    @TableField("carBrand")
    private String carBrand;

    @TableField("carType")
    private String carType;

    @TableField("clic")
    private Integer clic;


}
