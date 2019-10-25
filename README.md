# RefactoringLog
 Refactoring exercise: response is given to a code refactoring exercise, regarding the use of logs
 
Response to the refactoring and code review exercise:

1. The revision of the code was carried out and it is possible to notice the lack of good practices in the use of the logs.
I can leave my observations to improve it:
to. SOLID principles by not diversifying functionalities in various classes.
b. Use of a framework (log4j) to facilitate development as well as to comply with the principles of point a.
covering various aspects of logging vulnerabilities, such as the use of unique files,
the management of appenders to discriminate the outputs of them either by console, file or database, placing
timestamps as well as thread identification as well as the class that makes the log registration, making reading easier
and filtering it.
