# Test Cases

### Test Case 1
**Summary:** User wants to create a new small project called 'Emdedded Device'.
This project will have one qualification for C++.
A new worker named Tom James was hired for this project and the user once to start the project as soon as possible.

**Preconditions:** User has signed into their company on the Company Management app.
C++ is not already a qualification, Tom James is not a worker, and Embedded Device is not already a project.

**Description:**
1. The user views their company's qualifications.
2. The Company Management app shows the user a list of the company's qualifications.
3. The user does not find it in the list so they decide to create it.
4. The user types in 'C++' into the description field and clicks on 'Create Qualification'.
5. The Company Management app creates a qualificaiton called C++ and adds it to the list.
6. The user sees the new qualification and wants to create the project now.
7. The user clicks on 'Projects'.
8. The application shows the list of the company's projects.
9. The user enters the project name, 'Embedded Device', then selects 'C++' and 'Cyber Security' from the qualifications dropdown.
The user then selects small as the project size and clicks 'Create Project'.
10. The app creates the project and adds it to the Projects list.
11. The user can now see the 'Embedded Device project and wants to add their newly hired worker. They click on 'Workers'.
12. The app shows the user a list of workers already in the company.
13. The user enters 'Tom James' in the name field. They then select 'C++' in the qualifications dropdown and then enter a salary of '100000'. They click the 'Hire a Worker' button.
14. The app creates a worker with the provided options and adds it to the list of Workers.
15. The user clicks on 'Tom James' and confirms that the information was correctly added. They then search for a worker with the 'Cybersecurity' qualification.
They see that it is Omar Williamson.
16. They want to now assign the workers to the project so they go back to the 'Projects' page. The select 'Embedded Device' from the project dropdown for assigning workers.
They then select 'Tom James' from the worker dropdown. The user then clicks 'Assign'.
17. The app will assign 'Tom James' to 'Emeded Device'. Nothing is shown.
18. The user selects 'Embedded Device' again from the project dropdown.
They also select 'Omar Williamson' for the worker dropdown and click 'Assign'.
19. The app will assign 'Omar Williamson' to 'Emeded Device'. Nothing is shown.
20. The user clicks on the 'Embeded Device' list item to view the details of the project.
21. The application now shows the project name, size, workers, required and missing qualifications, and status.
22. The user sees that the project is small and has the correct workers and required qualifications. There are no missing qualifications and the status is 'PLANNED'.
23. After confirming everything is correct the user clicks 'Start Project'.
24. The app will set the status of 'Embedded Device' to 'ACTIVE' and will alert the user that the project was started.
25. The user sees the alert and again clicks on 'Embedded Device' and sees that the project is now 'ACTIVE'.

### Test Case 2
**Summary:** This test will test assign worker/unassign worker
It will create a new worker named Lee Roy.
It will then create a Big projects and assign the worker to it, then unassign him from it.
The project will then be Suspended.


**Preconditions:** User has signed into their company on the Company Management app.
Lee Roy is not a worker, Shoe Rack is not a project.

**Description:**
1. The user clicks on worker tab.
2. The workers are displayed.
3. The user types in the Worker's name textbox 'Lee Roy', and clicks on the qualifications dropbox menu.
4. The system displays all qualification in the system.
5. The user clicks on Angular, Java, MongoDB, and Python.
6. Angular, Java, MongoDB, and Pyhton are shown as selected.
7. The user types in the worker's salary text field 25 and clicks the Hire a TWorker button.
8. The system now displays Lee Roy.
9. The user clicks on the projects tab.
10. The system displays all projects in the system.
11. The user types in the Project Name text box 'Shoe Rack', and clicks on the dropdown menu for required qualifications
12. The system displays the qualifications in the system.
13. The user selects Angular
14. The system displays Angular as selected
15. The user clicks on the select project size drop down menu
16. The system displays the size options
17. The user clicks on Big.
18. The system displays Big as being selected.
19. The user clicks on the create project button.
20. Shoe Rack is displayed on the page.
21. The user clicks on the choose a project drop down menu
22. The system displays the projects that are not full including 'Shoe Rack'
23. The user clicks on Shoe Rack.
24. The system displays Shoe Rack as selected.
25. The user clicks on the Choose a Worker drop down menu.
26. The system displays Lee Roy and Nina Banks.
27. The User clicks on Lee Roy.
28. The system displays Lee Roy as selected.
29. The user clicks the Assign button
30. The user clicks on Shoe Rack to varify that Lee Roy has been assigned to Shoe Rack.
31. The system shows Lee Roy as assigned to the project.
32. The user clicks on the choose a project drop down menu under the unassign text and clicks on Shoe Rack.
33. The system displays Shoe Rack as selected.
34. The user clicks on the choose a worker drop down menu under the unassign text and clicks Lee Roy.
35. The system displays Lee Roy as selected.
36. The user clicks on the unassign button and then selects Shoe Rack.
37. The system displays that Lee Roy is no longer assigned to Shoe Rack and the project status is now SUSPENDED.

### Test Case 3
**Summary:** Normal operations for use case 1: view company qualifications.

**Preconditions:** Qualifications are present in the company.

**Description:**
1. The user clicks on the Qualifications tab.
2. The application now shows all of the qualifications in the company: Angular, Cyber Security, Java, JavaScript, MongoDB, Python, React, Spark, Spring, SQL, Tensorflow, Typescript.

### Test Case 4
**Summary:** Normal operations for use case 2: view company employed workers.

**Preconditions:** Workers are present in the company.

**Description:**
1. The user clicks on the Workers tab.
2. The application now shows all of the employed workers in the company: Benjamin Guzman, Erika Johnston, Gene Robertson, Jamie Burgess, Marcus Schneider, Nick Hubbard, Nina Banks, Omar Williamson, Robert Lambert, Ron Logan, Terry Hampton, and Tim Conner.

### Test Case 5
**Summary:** Normal operations for use case 3: view company projects.

**Preconditions:** Projects are present in the company.

**Description:**
1. The user click on the Projects tab.
2. The application now shows all of theprojects in the company: AI shopping system, Android Task Monitoring, Credit Card Fraud Detection, Ecommerce Fake Product Reviews Detection System, Employees DB,Face Detector, Financial Banking System,Fingerprint-Based ATM system, Legacy Software Maintanance, Signature Verification System, Smart Chatbot, and Weather Forecasting System.

### Test Case 6
**Summary:** Normal operations for use case 7: create new Qualification.
The user will add a qualification with the description of Agile.

**Preconditions:** None

**Description:**
1. The user clicks on the Qualifications tab.
2. The application now shows all of the qualifications in the company: Angular, Cyber Security, Java, JavaScript, MongoDB, Python, React, Spark, Spring, SQL, Tensorflow, Typescript.
3. The user types into the description text box 'Agile' and then clicks on the create qualification button.
4. The application now contains Agile in the list of qualifications.

### Test Case 7
**Summary:** Normal operations for use case 8: create new Worker.
The user will add a Worker with the name of Mo Love and qualification of Java.

**Preconditions:** Qualification of Java exists in the system.

**Description:**
1. The user clicks on the Worker tab.
2. The application now shows all of the employed workers in the company: Benjamin Guzman, Erika Johnston, Gene Robertson, Jamie Burgess, Marcus Schneider, Nick Hubbard, Nina Banks, Omar Williamson, Robert Lambert, Ron Logan, Terry Hampton, and Tim Conner.
3. The user types into the Worker's name text box 'Mo Love' and then clicks on the qualifications drop down menu.
4. The application shows a list from the drop down menu of possible qualifications: Angular, Cyber Security, Java, JavaScript, MongoDB, Python, React, Spark, Spring, SQL, Tensorflow, Typescript.
5. The user selects Java.
6. The system shows Java as selected.
7. The user types '30' into the Worker's salary text box and clicks on the Hire a Worker button.
8. The system then shows Mo Love as a part of the Worker list below.

### Test Case 8
**Summary:** Normal operations for use case 9: create new Project.
The user will add a Project with the name of Smart Hat with required qualification of Cyber Security, and project size of SMALL.

**Preconditions:** Qualification of Cyber Security exists in the system.

**Description:**
1. The user clicks on the Projects tab.
2. The application now shows all of theprojects in the company: AI shopping system, Android Task Monitoring, Credit Card Fraud Detection, Ecommerce Fake Product Reviews Detection System, Employees DB,Face Detector, Financial Banking System,Fingerprint-Based ATM system, Legacy Software Maintanance, Signature Verification System, Smart Chatbot, and Weather Forecasting System.
3. The user types into the Project name text box 'Smart Hat' and then clicks on the required qualifications drop down menu.
4. The application shows a list from the drop down menu of possible qualifications: Angular, Cyber Security, Java, JavaScript, MongoDB, Python, React, Spark, Spring, SQL, Tensorflow, Typescript.
5. The user selects Cyber Security.
6. The system shows Cyber Security as selected.
7. The user types clicks on the project size drop down menu.
8. The system then shows a list of sizes: Small, Medium, and Big.
9. The user clicks on Small.
10. The system shows Small as selected.
11. The user clicks on the Create Project button.
12. The system then shows Smart Hat as a part of the Projects list below.   

### Test Case 9
**Summary:** This test will test worker details.
It will create a new worker named Charles Carimichael with qualifications React and MongoDB with a salary of 60000.
It will then assure the worker was created and has the same qualifications and salary.

**Preconditions:** None.

**Description:**
1. The user clicks on worker tab.
2. The app shows the user a list of the workers.
3. The user types in 'Charles Carimichael' into the name field.
4. The user presses the 'Qualificions' dropdown and selects 'React' and 'MongoDB'.
5. The user types in '60000' into the salary field and clicks the 'Hire a Worker' button.
6. The app creates a worker with the given fields and adds it to the list.
7. The user clicks 'Charles Carimichael'.
8. The app showcases the description of the worker:
- Name: Charles Carimichael
- Salary: 60000
- Workload: 0
- Projects:
- Qualifications: MongoDB, React

### Test Case 10
**Summary:** This test will test project details.
It will create a new worker named Verification System with qualifications JavaScript and Spring with a project size of Medium.
It will then assure the project was created and has the same details.

**Preconditions:** None.

**Description:**
1. The user clicks on Projects tab.
2. The app shows the user a list of the Projects.
3. The user types in 'Verification System' into the name field.
4. The user presses the 'Qualifications' dropdown and selects 'JavaScript' and 'Spring'.
5. The user presses the 'Project Size' dropdown and selects 'Medium'.
6. The user presses the 'Create Project' button.
7. The app creates a project with the given fields and adds it to the list.
8. The user clicks 'Verification System'.
9. The app showcases the description of the project:
- Name: Verification System
- Size: MEDIUM
- Workers: None
- Required Qualifications: JavaScript, Spring
- Missing Qualifications: JavaScript, Spring
- Status: PLANNED

### Test Case 11
**Summary:** This test will test qualification details
It will create a new worker named Ruby with Description 'Ruby'.
It will then assure the qualification was created and has the same description.

**Preconditions:** None.

**Description:**
1. The user clicks on Qualifications tab.
2. The app shows the user a list of the Qualifications.
3. The user types in 'Ruby' into the name field.
4. The user presses the 'Create Qualification' button.
6. The app creates a qualification with the given description and adds it to the list.
7. The user clicks 'Ruby'.
8. The app showcases the description of the qualification:
- Name: Ruby
- Workers: 

### Test Case 12
**Summary:** Normal opperations for use case 11: unassigning a worker from a project.
The user will unassign Tim Conner from a project.

**Preconditions:** 

**Description:**
1. The user clicks on the 'Projects' page.
2. The app shows a list of the company's projects.
3. The user selects 'Employees DB' in the unassing project dropdown and 'Tim Conner' from the workers dropdown. 
They then click 'Unassign'.
4. The app removes Tim Conner from the list of workers for the 'Employees DB' project and keep the project status as 'PLANNED'.
5. The user is now able to see 'Tim Conner' is no longer in the workers list for 'Employees DB'.
Java and Python are also added to the Missing Qualifications list.

**Alternatives:**
- If the user unassign Tim Conner from an active project the status of the project will be set to 'SUSPENDED'.
The worker will still be removed from the project and their qualifications will be added to the Missing Qualifications.
- If the user tries to unassign a worker from a project with no workers they will be unable to select the project in the unassign project dropdown.

### Test Case 13
**Summary:** Normal opperations for use case 11: starting a project with no missing qualifications and in planned state.
The user will start the project "Face Detector".

**Preconditions:** 
No missing qualifications for a project to be started.
**Description:**
1. The user clicks on the 'Projects' page.
2. The app shows a list of the company's projects.
3. The user clicks 'Face Detector' from the list of projects within the company. The user notices there are no missing qualifications and the state is planned.
The 'Start Project' button appears because of this. The user clicks 'Start Project'
4. The app then starts the project, displays an alert that the project has been started. The user clicks 'Ok' and then the app updates the status to 'ACTIVE'.
5. The user is now able to see that the project is 'ACTIVE' and the 'Finish Project' button appears.

**Alternatives:**
- If the user starts a 'SUSPENDED' project with no missing qualifications, the same actions will take place but the state will change from 'SUSPENDED' to 'ACTIVE'.

### Test Case 14
**Summary:** Normal opperations for use case 13: finish project.
The user will finish the project "Credit Card Fraud Detection".

**Preconditions:** Credit Card Fraud Detection exists and is in ACTIVE status.

**Description:**
1. The user clicks on the 'Projects' page.
2. The app shows a list of the company's projects.
3. The user selects "Credit Card Fraud Detection" from the list of visible company projects.
4. The user selects the "Finish Project Button".
5. The user can see the alert that the project has been finished.
6. The app sets the "Credit Card Fraud Detection" project status to FINISHED and removes all the workers from the project.
7. The user selects "Credit Card Fraud Detection" from the list of visible projects.
8. The user is now able to see that the workers list for "Credit Card Fraud Detection" does not contain any workers and the status is set to FINISHED.

**Alternatives:**
- If the user attemps to finish a project in the FINISHED status the "Finish Project Button" will not show up as visible.
- If the user attemps to finish a project in the SUSPENDED status the "Finish Project Button" will not show up as visible.
- If the user attemps to finish a project in the PLANNED status the "Finish Project Button" will not show up as visible.
- If the user attempts to finish an non-existent project the project will not show up in the list of company's projects and thus will not be visible to be clicked.

