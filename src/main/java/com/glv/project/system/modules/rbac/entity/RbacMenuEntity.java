package com.glv.project.system.modules.rbac.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.glv.project.system.modules.jpa.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ZHOUXIANG
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Entity
@Table(name = "T_SYS_RBAC_MENU")
@TableName("T_SYS_RBAC_MENU")
public class RbacMenuEntity extends BaseEntity {

    /**
     * 菜单代码
     */
    private String menuCode;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 菜单别名
     */
    private String aliasName;

    /**
     * 附加信息
     */
    private String addInfo;

    /**
     * 菜单说明
     */
    private String menuDesc;

    /**
     * 序号
     */
    private Double sequence;
}
