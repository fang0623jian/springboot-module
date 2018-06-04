package com.example.module.domain.es;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Description:
 * @Author：fang_jian
 * @Date:Create in 2018/6/1
 * @Version 1.0.0
 */
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "bank",type = "account")
@ApiModel(value="Account对象",description="账户实体类Account")
public class Account implements Serializable {

    @Id
    @ApiModelProperty(value="账户id",name="id",example="1")
    private Long id;
    @ApiModelProperty(value="账户",name="accountNumber",example="13641457646")
    private Integer accountNumber;
    @ApiModelProperty(value="姓氏",name="firstname",example="方")
    private String firstname;
    @ApiModelProperty(value="名字",name="lastname",example="剑")
    private String lastname;
    @ApiModelProperty(value="年龄",name="age",example="24")
    private Integer age;
    @ApiModelProperty(value="性别",name="gender",example="男")
    private String gender;
    @ApiModelProperty(value="地址",name="address",example="深圳市宝安区下围园新村10-6号")
    private String address;
    @ApiModelProperty(value="职业",name="employer",example="程序员")
    private String employer;
    @ApiModelProperty(value="城市",name="city",example="深圳")
    private String city;

}