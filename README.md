# springboot-aws-mysql-crud Deploy Spring Boot CRUD Application With MySQL on
Youtube Help
============
https://www.youtube.com/watch?v=1f6GOjT_zsc  --> AWS Lambda Handler Error <br>
https://www.youtube.com/watch?v=J0aEfUUervE  --> Deploy Spring Boot Serverless CRUD API to AWS Lambda 🔥 | API Gateway | ‪@Javatechie‬
<br>
https://www.youtube.com/watch?v=by0EJ4qL8ek --> Create AWS MySQL RDS database and connect with local MySQL-Workbench <br>

https://www.youtube.com/watch?v=dTxuhpEFQbk&t=181s

Source Code in Git
==================
https://github.com/Pabitramaiti/springboot-aws-lambda-crud.git
https://github.com/Java-Techie-jt/aws-lambda-example

Creating AWS resources
======================
✅ Create IAM user, lets user is "pabitra_lambda" , add permission AdministratorAccess, AmazonAPIGatewayAdministrator, AmazonAPIGatewayInvokeFullAccess, AmazonDynamoDBFullAccess, AWSLambdaBasicExecutionRole, AWSLambdaDynamoDBExecutionRole, AWSLambdaExecute, AWSLambda_FullAccess etc <br>
✅ Create AWS IAM user group "grp_admin" <br>
✅ Create AWS IAM role is "admin-lambda-role" <br>
✅ Create AWS RDS for MySQL.
✅ Create a Lambda function "order_service", Select Runtime as Java 17, "Use an existing role" -> admin-lambda-role <br>
✅ After creating Lambda function "order_service" edit it and give Runtime settings as "com.example.lambda.StreamLambdaHandler::handleRequest" <br>
✅ Build jar/zip file <br>
✅ Create S3 bucket and upload jar file <br>
✅ Create AWS API Gateway , API type -> REST API -> Create REST API , name is "order_service_api", API endpoint type -> Regional <br>
✅ Create API Gateway Resources -> Create Method -> Deploy API (Check proper steps in image file under docs folder) <br>

Testing
=======

"resource": "/{proxy+}",
  "path": "/ready",
  "httpMethod": "GET",

use docs/order_service_api-dev-swagger.json
