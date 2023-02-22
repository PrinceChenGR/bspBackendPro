package com.example.bsppro.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
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
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "cartypes", schema = "bdm78700319_db")
public class Cartypes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ctsid", type = IdType.AUTO)
    private Integer ctsid;

    @TableField("ctsnames")
    private String ctsnames;

    @TableField("cartypeszm")
    private String cartypeszm;


}
