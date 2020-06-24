package com.bwa.demo1.swagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@ApiModel(value = "用户实体")
public class User implements Serializable {
    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名",required = true)
    @NotNull(message ="姓名不可为空" )
    private String name;


    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄")
    private String age;


}
