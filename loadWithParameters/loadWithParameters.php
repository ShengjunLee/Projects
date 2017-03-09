<?php
	switch($_POST['name']){
		case '0':
			echo "url是必须的";
			break;
		case '1':
			echo "可选的data参数";
			break;
		case '2':
			echo "callback可选";
			break;			
	}
?>