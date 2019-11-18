Refactored Code Implementation:

    We made some very fundamental changes in our application that did not translate 
perfectly into our new Java Spring framework application. However we did take some of
the concepts around clean code and implemented them within our web app. 

- Compartmentalization of Code - We utilized Bootstrap as a CSS template for styling our pages.
in some cases this was not totally adequate for styling things in the way we wanted. Therefore
we created separate CSS files to house additional code. Initially we had included the styling
elements within the header but thought to create new files and reference them in order to 
cut back on the amount of code in each file. This leads to a cleaner looking html page, and makes
the code more navigable.

- Additionally we took common elements that are on each web page and created html files
that include all of these elements. This further reduces the number of lines in each html page.
Furthermore, once the header html element is created, you only need to make changes in the single
document that are applied to all the other html pages that make a call to the header.




Use Cases

    1. User can log in to the website and apply for a car loan. The loan is then saved
internally and available through the console database for future reference.

    2. A prospective customer has the ability to view mFinance offerings and decide if 
they would like to utilize our services. If they decide to proceed then they have the ability
to register an account and apply for a loan.


Application Notes

- JDK 12 will be necessary to run the application.
- Once running, application can be accessed from http://localhost:8080/
- test credentials: user: admin password: password
- Log in to the Console to see user data:

Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: blank, literally blank nothing in the field

- Once logged in you can see new user creations. We have a default user set up in the
import SQL statement and then new users are added to this database
