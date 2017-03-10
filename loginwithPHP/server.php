<?php
/**
 * Created by PhpStorm.
 * User: Administrator
 * Date: 2017/3/10
 * Time: 下午 2:56
 *
 *
 */
    $username = $_POST['username'];
    $password = $_POST['password'];	
	$conn = mysqli_connect('127.0.0.1','root','','mytest','3306');
	$sql = "SELECT * FROM username WHERE name='$username' AND pwd='$password'";
	$result = mysqli_query($conn,$sql);
	if($result== false)
		echo "重新登录";
	else
		echo "登录成功";

?>