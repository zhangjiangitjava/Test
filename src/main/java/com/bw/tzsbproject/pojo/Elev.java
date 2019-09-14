package com.bw.tzsbproject.pojo;
import cn.afterturn.easypoi.excel.annotation.Excel;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "t_productionunit")
public class Elev {
    //@Excel(name="ID",orderNum="0"
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Excel(name="ID",orderNum = "0")
    private Integer id;
    @Column(name = "productionunit_id")
    @Excel(name="电梯编号",orderNum = "1")
    private Integer productionunit_id;
    @Column(name = "productionunit_name")
    @Excel(name="电梯名称",orderNum = "2")
    private String  productionunit_name;
    @Column(name = "productionunit_permit")
    @Excel(name="生产许可证",orderNum = "3")
    private String  productionunit_permit;
    @Column(name = "productionunit_address")
    @Excel(name="生产单位地址",orderNum = "4")
    private String  productionunit_address;
    @Column(name = "contact")
    @Excel(name="联系电话",orderNum = "5")
    private String  contact;

    @Column(name = "duty")
    @Excel(name="负责人电话",orderNum = "6")
    private String  duty;

    @Column(name = "duty_name")
    @Excel(name="负责人姓名",orderNum = "7")
    private String  duty_name;

    @Column(name = "factory_upper")
    @Excel(name="上个月出厂数量",orderNum = "8")
    private String  factory_upper;

    @Column(name = "factory")
    @Excel(name="本月出厂数量",orderNum = "9")
    private String  factory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductionunit_id() {
        return productionunit_id;
    }

    public void setProductionunit_id(Integer productionunit_id) {
        this.productionunit_id = productionunit_id;
    }

    public String getProductionunit_name() {
        return productionunit_name;
    }

    public void setProductionunit_name(String productionunit_name) {
        this.productionunit_name = productionunit_name;
    }

    public String getProductionunit_permit() {
        return productionunit_permit;
    }

    public void setProductionunit_permit(String productionunit_permit) {
        this.productionunit_permit = productionunit_permit;
    }

    public String getProductionunit_address() {
        return productionunit_address;
    }

    public void setProductionunit_address(String productionunit_address) {
        this.productionunit_address = productionunit_address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getDuty_name() {
        return duty_name;
    }

    public void setDuty_name(String duty_name) {
        this.duty_name = duty_name;
    }

    public String getFactory_upper() {
        return factory_upper;
    }

    public void setFactory_upper(String factory_upper) {
        this.factory_upper = factory_upper;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "id=" + id +
                ", productionunit_id=" + productionunit_id +
                ", productionunit_name='" + productionunit_name + '\'' +
                ", productionunit_permit='" + productionunit_permit + '\'' +
                ", productionunit_address='" + productionunit_address + '\'' +
                ", contact='" + contact + '\'' +
                ", duty='" + duty + '\'' +
                ", duty_name='" + duty_name + '\'' +
                ", factory_upper='" + factory_upper + '\'' +
                ", factory='" + factory + '\'' +
                '}';
    }
}
