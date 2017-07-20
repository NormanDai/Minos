# Mines - Java开源Spring 对象校验库

Mines 是由java语言实现的Spring 对象校验插件库，内部校验基于Oval 实现，基于Oval封装的原因是 该框架开源并且功能强大，同时支持JSR-303。

## Mines 特点：
- 1.基于成熟的对象校验框架Oval
- 2.遵循JSR-303 对象校验标准
- 3.使用简单方便，可插拔
- 4.基于注解

> 由于目前Mines 还没有提交到Maven center 所以用户需自行从 [Github](https://github.com/NormanDai/Mines) 下载代码并编译

## 使用范例

### **在spring 配置中定义插件**


```
<bean id="validator" class="com.Mines.Validator"/>
```

### **定义需要校验的bean**


```
public class ValidateBeanTest{

   
    
    @NotBlank(message = "名称不能为空")
    private String name;
   
    @NotBlank(message = "开始生效日期不能为空")
    private Date startDate;
   
    @NotBlank(message = "结束生效日期不能为空")
    private Date endDate;
	
	//此处 get set 方法忽略
	
}
```

> 关于Oval 基于注解校验规则使用方法请[参考](http://blog.csdn.net/neweastsun/article/details/49154337)



### **在需要校验的方法上定义Validator注解**




```
import com.Mines.core.annotations.Validator;
import net.sf.oval.constraint.NotEmpty;

public class ValidatorTest {


    @Validator
    public String test(ValidateBeanTest beanTest){
        return "";
    }

}
```


> 若对本软件库感兴趣或者有什么好的意见 欢迎大家发邮件到 daishenglei@foxmail.com ，谢谢


















