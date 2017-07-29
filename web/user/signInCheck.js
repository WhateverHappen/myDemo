/**
 * Created by hakunaMatata on 2017/7/28.
 */
function login(form) {
    if(validate(form)){
        form.submit();
    }
}

function validate(form) {
    var username = form.username.value.trim();
    var password = form.password.value.trim();

    //判断用户名是否被输入
    if (username === "" || username === null) {
        alert("用户名必须输入！");
        form.username.focus();
        return false;
    }
    //判断密码是否被输入
    if(password===""||password===null){
        alert("密码必须输入！");
        form.password.focus();
        return false;
    }
}
