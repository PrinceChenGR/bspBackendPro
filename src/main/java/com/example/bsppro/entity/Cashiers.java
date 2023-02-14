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
public class Cashiers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "casid", type = IdType.AUTO)
    private Integer casid;

    @TableField("insid")
    private Integer insid;

    @TableField("cashiersprice")
    private Float cashiersprice;

    @TableField("shijprice")
    private Float shijprice;

    @TableField("paymenttemp")
    private String paymenttemp;

    @TableField("jfdk")
    private Float jfdk;

    @TableField("cashierstimes")
    private Date cashierstimes;


}
