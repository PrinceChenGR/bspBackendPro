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
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "clientno", type = IdType.AUTO)
    private String clientno;

    @TableField("mid")
    private Integer mid;

    @TableField("artisanid")
    private String artisanid;

    @TableField("clientname")
    private String clientname;

    @TableField("cphone")
    private String cphone;

    @TableField("caddress")
    private String caddress;

    @TableField("cbrind")
    private Date cbrind;

    @TableField("khsf")
    private String khsf;

    @TableField("city")
    private String city;

    @TableField("county")
    private String county;

    @TableField("khbz")
    private String khbz;


}
