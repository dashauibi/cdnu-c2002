var check = function() {
    var email = document.getElementById("inputEmail");
    var password = document.getElementById("inputPassword");
    password.value = md5(password);
    alert(password.value)
    console.log(password.value)
    return true;
}