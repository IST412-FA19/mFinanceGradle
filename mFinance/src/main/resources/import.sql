-- To change this license header, choose License Headers in Project Properties.
-- To change this template file, choose Tools | Templates
-- and open the template in the editor.

-- Author:  garre
-- Created: Nov 3, 2019
INSERT INTO `authorities`(`name`, `id`) VALUES ('ADMIN', 1);
INSERT INTO `authorities`(`name`, `id`) VALUES ('USER', 2);

INSERT INTO `users`(`id`, `username`, `password`) VALUES (1, 'admin', 'password');

INSERT INTO `role_assignments`(`user_id`, `authority_id`) VALUES (1, 1);



