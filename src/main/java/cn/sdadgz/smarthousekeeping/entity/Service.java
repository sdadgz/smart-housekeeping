package cn.sdadgz.smarthousekeeping.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 服务
 * </p>
 *
 * @author sdadgz
 * @since 2023-05-16
 */
@Getter
@Setter
@ApiModel(value = "Service对象", description = "服务")
public class Service implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("类别")
    private String type;

    @ApiModelProperty("介绍")
    private String context;
}
