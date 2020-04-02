
SET GLOBAL time_zone = '-3:00';

INSERT INTO `course` (`courseid`, `author`, `coursename`) VALUES
	(100.00, 'Angel Lopez', 'Angular'),
	(101.00, 'Angel Lopez', 'React'),
	(102.00, 'Angel Lopez', 'Java'),
	(103.00, 'Angel Lopez', 'Go'),
	(104.00, 'Angel Lopez', 'Python'),
	(105.00, 'Angel Lopez', 'Nodejs');

	
	
INSERT INTO `user` (`courseid`, `userid`, `username`) VALUES
	(100.00, 1.00, 'Facundo'),
	(100.00, 2.00, 'Diego'),
	(100.00, 3.00, 'Arturo'),
	(101.00, 1.00, 'Facundo'),
	(101.00, 4.00, 'Ezequiel');

