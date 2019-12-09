-- To change this license header, choose License Headers in Project Properties.
-- To change this template file, choose Tools | Templates
-- and open the template in the editor.

-- Author:  garre
-- Created: Nov 3, 2019

INSERT INTO `Application_User`(`id`, `address`, `address2`, `city`, `email`, `first_name`, `last_name`, `password`, `state`, `username`, `zip`) VALUES (1, '123 Street','Unit101',  'New York',  'user@gmail.com', 'first', 'last', 'password', 'NY', 'admin', '10001');

INSERT INTO `Application_User_Security_Principal` (`id`, `principal_name`) VALUES (1, 'ROLE_ADMIN');
INSERT INTO `Application_User_Security_Principal` (`id`, `principal_name`) VALUES (2, 'ROLE_USER');
INSERT INTO `Application_User_Security_Principal` (`id`, `principal_name`) VALUES (3, 'ROLE_EMPLOYEE');

INSERT INTO `Security_Principal_Assignments` (`Application_User_Id`, `Security_Principals_Id`) VALUES (1, 1);
INSERT INTO `Security_Principal_Assignments` (`Application_User_Id`, `Security_Principals_Id`) VALUES (1, 2);
INSERT INTO `Security_Principal_Assignments` (`Application_User_Id`, `Security_Principals_Id`) VALUES (1, 3);

INSERT INTO `Loan_Status` (`id`, `status_name`) VALUES (1, 'INITIATED');

