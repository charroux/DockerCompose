<html>
	<head>
		<title>Characters !</title>
	</head>
	<body>
		<?php
            $json = file_get_contents('http://rest-web-service:8080/person');
            echo "<li>$json</li>";
		?>
	</body>
</html>