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
public class Goodstype implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "gid", type = IdType.AUTO)
    private Integer gid;

    @TableField("gname")
    private String gname;

    @TableField("fatherType")
    private Integer fatherType;


}
