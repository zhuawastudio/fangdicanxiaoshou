package com.entity.vo;

import com.entity.FangchanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 房产信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fangchan")
public class FangchanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 房产编号
     */

    @TableField(value = "fangchan_uuid_number")
    private String fangchanUuidNumber;


    /**
     * 房产名
     */

    @TableField(value = "fangchan_name")
    private String fangchanName;


    /**
     * 房产户型
     */

    @TableField(value = "fangchan_types")
    private Integer fangchanTypes;


    /**
     * 房产图片
     */

    @TableField(value = "fangchan_photo")
    private String fangchanPhoto;


    /**
     * 房产价格
     */

    @TableField(value = "fangchan_money")
    private Double fangchanMoney;


    /**
     * 房产地址
     */

    @TableField(value = "fangchan_address")
    private String fangchanAddress;


    /**
     * 房屋面积
     */

    @TableField(value = "fangchan_mianjis")
    private Integer fangchanMianjis;


    /**
     * 所在区域
     */

    @TableField(value = "fangchan_quyu")
    private String fangchanQuyu;


    /**
     * 房产详情
     */

    @TableField(value = "fangchan_content")
    private String fangchanContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：房产编号
	 */
    public String getFangchanUuidNumber() {
        return fangchanUuidNumber;
    }


    /**
	 * 获取：房产编号
	 */

    public void setFangchanUuidNumber(String fangchanUuidNumber) {
        this.fangchanUuidNumber = fangchanUuidNumber;
    }
    /**
	 * 设置：房产名
	 */
    public String getFangchanName() {
        return fangchanName;
    }


    /**
	 * 获取：房产名
	 */

    public void setFangchanName(String fangchanName) {
        this.fangchanName = fangchanName;
    }
    /**
	 * 设置：房产户型
	 */
    public Integer getFangchanTypes() {
        return fangchanTypes;
    }


    /**
	 * 获取：房产户型
	 */

    public void setFangchanTypes(Integer fangchanTypes) {
        this.fangchanTypes = fangchanTypes;
    }
    /**
	 * 设置：房产图片
	 */
    public String getFangchanPhoto() {
        return fangchanPhoto;
    }


    /**
	 * 获取：房产图片
	 */

    public void setFangchanPhoto(String fangchanPhoto) {
        this.fangchanPhoto = fangchanPhoto;
    }
    /**
	 * 设置：房产价格
	 */
    public Double getFangchanMoney() {
        return fangchanMoney;
    }


    /**
	 * 获取：房产价格
	 */

    public void setFangchanMoney(Double fangchanMoney) {
        this.fangchanMoney = fangchanMoney;
    }
    /**
	 * 设置：房产地址
	 */
    public String getFangchanAddress() {
        return fangchanAddress;
    }


    /**
	 * 获取：房产地址
	 */

    public void setFangchanAddress(String fangchanAddress) {
        this.fangchanAddress = fangchanAddress;
    }
    /**
	 * 设置：房屋面积
	 */
    public Integer getFangchanMianjis() {
        return fangchanMianjis;
    }


    /**
	 * 获取：房屋面积
	 */

    public void setFangchanMianjis(Integer fangchanMianjis) {
        this.fangchanMianjis = fangchanMianjis;
    }
    /**
	 * 设置：所在区域
	 */
    public String getFangchanQuyu() {
        return fangchanQuyu;
    }


    /**
	 * 获取：所在区域
	 */

    public void setFangchanQuyu(String fangchanQuyu) {
        this.fangchanQuyu = fangchanQuyu;
    }
    /**
	 * 设置：房产详情
	 */
    public String getFangchanContent() {
        return fangchanContent;
    }


    /**
	 * 获取：房产详情
	 */

    public void setFangchanContent(String fangchanContent) {
        this.fangchanContent = fangchanContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
