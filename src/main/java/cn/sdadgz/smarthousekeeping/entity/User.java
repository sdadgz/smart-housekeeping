package cn.sdadgz.smarthousekeeping.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author sdadgz
 * @since 2023-05-10
 */
@Getter
@Setter
@ApiModel(value = "User对象", description = "用户")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String username;

    private String password;

    private String nickname;

    private Boolean isEnable;

    private Long phone;

    @ApiModelProperty("偷懒咯")
    private String role;

    private LocalDateTime updateTime;

    private LocalDateTime createTime;
}
