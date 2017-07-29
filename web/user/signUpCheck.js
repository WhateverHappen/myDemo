/**
 * Created by hakunaMatata on 2017/7/28.
 */
/**
 * 注册校验
 * @param form 传入form标签，用以获取username、password等信息
 */
function register(form) {
    if (validate(form)) {
        form.submit();
    }
}

/**
 * 对参数的具体校验
 * @param form 传入的form标签
 * @return {boolean} 不符合要求返回false，阻止参数提交
 */
function validate(form) {
    //获得输入框信息并截取空格
    var username = form.username.value.trim();
    var password = form.password.value.trim();
    var passwordCheck = form.passwordCheck.value.trim();
    var age = form.age.value.trim();
    var sex = form.sex.value.trim();

    //判断用户名是否被输入
    if (username === "" || username === null) {
        alert("用户名必须输入！");
        form.username.focus();
        return false;
    }
    //用正则表达式判断用户名
    if(!/^\w*$/.test(username)){
        alert("用户名必须是字母和数字！");
        form.username.focus();
        return false;
    }
    //判断用户名长度，应在4到20之间
    if(username.length<4||username.length>20){
        alert("用户名长度必须介于4到20之间！");
        form.username.focus();
        return false;
    }
    //判断密码是否被输入
    if(password===""||password===null){
        alert("密码必须输入！");
        form.password.focus();
        return false;
    }
    //判断密码长度
    if(password.length<8||password.length>30){
        alert("密码长度必须介于8到30之间！");
        form.password.focus();
        return false;
    }
    //判断重复密码
    if(password!==passwordCheck){
        alert("再次输入密码不一致！");
        form.passwordCheck.focus();
        return false;
    }
    //判断年龄是否被输入
    if(age===""||age===null){
        alert("年龄未输入！");
        form.age.focus();
        return false;
    }
    //用正则表达式判断年龄范围
    if(!/^[0-1]?[0-9]?[0-9]$/.test(age)){
        alert("无效年龄！");
        form.age.focus();
        return false;
    }
    return true;
}