package com.seata.provider1.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yxj
 * @since 2019-08-25
 */
@Data
@Accessors(chain = true)
public class TUpmsUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private LocalDateTime createTime;

    private String creator;

    private String lastUpdatePerson;

    private LocalDateTime lastUpdateTime;

    private String companyId;

    private String creatorId;

    private String email;

    private String fullName;

    private String headerImg;

    private String imgPath;

    private String imgRealPath;

    private Integer isAdmin;

    private String parentIds;

    @TableField("parentId")
    private String parentId;

    private String password;

    private String userName;

    private String companyIds;

    private String roleId;

    private String telephone;


}
