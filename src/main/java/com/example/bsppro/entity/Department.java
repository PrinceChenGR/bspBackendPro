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
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "departmentid", type = IdType.AUTO)
    private Integer departmentid;

    @TableField("depnames")
    private String depnames;


}
