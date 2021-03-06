******************************************************************************
Login and Pay with Amazon Java Library
Copyright 2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
Licensed under the Apache License, Version 2.0 (the "License"); 
******************************************************************************
  
******************************************************************************
INTRODUCTION
******************************************************************************
 
 Please understand that by using the Login and Pay with Amazon sample code, 
 you are agreeing to understand and abide by the terms of the license, 
 as written in NOTICE.txt & LICENSE.txt accompanying this archive. 
 This sample code has been tested with the Java 1.7 JDK
 
******************************************************************************
INCLUDED FILES
******************************************************************************
 
 * src/lib/     * OffAmazonPayments Jar and third-party Jar files.
                  Required class files to execute this code.
 * src/samples  * Sample Java files to demonstrate various use cases and all
                  service request calls.
 * LICENSE.txt  * The Apache License this code is licensed under.
 * NOTICE.txt   * Notice file.
 * README.txt   * This file.
 * CHANGES.txt  * List of changes to the SDK.
 
******************************************************************************
PREREQUISITES 
******************************************************************************
   
In US, if you have registered with Amazon Payments API Integration prior to
October 7th, 2013, you will need to register with Login with Amazon (LWA) and
get a Login with Amazon (LWA) Client ID.  To register with LWA visit
https://login.amazon.com/ and click on "Sign Up" button.

In EU, if you register with Amazon Payments API Integration prior to
September 9th, 2014, you will need to register with Login with Amazon (LWA) and
get a Login with Amazon (LWA) Client ID. To register with LWA contact Amazon
Payments seller support through Seller Central and request an LwA registration.

Once registered for LWA to get your LWA Client ID, go to Seller Central, select
the ???Login with Amazon??? marketplace on the top right switcher, click on
"Register Your Application" button on LWA Seller Central page. For additional 
information, please see the following step by step guide to get your Login with 
Amazon Client ID: https://amazonpayments.s3.amazonaws.com/documents/Get_Your_
Login_with_Amazon_Client_ID.pdf

******************************************************************************
UPGRADE INSTRUCTIONS - for clients upgrading from versions < 1.0.13
******************************************************************************
Clients upgrading to this version of the SDK from versions earlier than 1.0.13
need to be aware of the following changes to the SDK library that will require
changes to your application:
   - There is a new dependency on the bouncycastle cryptography libraries,
     please ensure the library is deployed to your server if you use the
     SDK for parsing IPN notifications
   - There is a new system property, certCN field, that needs to be added to
     the OffAmazonPaymentsServiceClientConfig object.  See
     src/samples/OffAmazonPaymentsService.config.properties for a sample
     property file with the correct value for certCN key
   - For clients using the notification parser library, there has been a
     change to the interface used to obtain a reference to the parser.  Clients
     are now required to inject an instance of the OffAmazonPaymentsServiceClientConfig
     object into a NotificationParserFactory, which provides a createNewInstance method
     to obtain a reference to a NotificationParser object.  See
     /src/samples/IpnHandler.java for an example on how to use the new NotificationParser
     API.

******************************************************************************
MWS AUTH TOKEN Usage
******************************************************************************
For clients who are acting as integrators or are authorized to make OffAmazonPaymentsService
calls on behalf of another seller, you are now required to provide a MWSAuthToken for
all requests made to the OffAmazonPaymentsService endpoint.

See http://docs.developer.amazonservices.com/en_US/auth_token/AuthToken_Overview.html
for more information about how to obtain an AuthToken and how to use the value in your
systems.

******************************************************************************
USAGE INSTRUCTIONS 
******************************************************************************
 Note: The following steps are for a UNIX based operating environment (and can
 be easily modified to suite other operating systems)
 
 This SDK includes two sets of samples - a command line based example that
 requires a minimal setup in order to run, and a webserver based sample that
 demonstrates notification processing.

 To run the command line based examples:
 
 (1) Open the src/OffAmazonPaymentsService.config.properties file and fill out
     the merchant id, access key and secret key fields. Please also fill out
     LWA client id field if Login with Amazon service is available in your
     region. Also make sure that the environment and region keys are configured
     to the right values for your test.
        
 (2) Navigate to the src/Samples/cli directory, and run the selected Java sample
     in the console by passing the sample name. An Amazon Order Reference Id
     is required for the examples. If Automatic Payments service is available
     in your region, an Amazon Billing Agreement Id is required for the example
     AutomaticPaymentSimpleCheckoutCLI.
     (a) An Amazon Order Reference Id / Amazon Billing Agreement Id can be
         generated by using the OffAmazonPayments wallet widget. There are sample
         html pages titled login.jsp, address.jsp and payment.jsp that contain
         widgets that can be deployed to a Java servlet container. Please see
         src/samples/website for sample pages.
     (b) For the RefundExampleCLI.java sample, you will also need to provide
         the Amazon Capture Id as a second argument which can be obtained
         from an earlier service call

 (3) The result of the operation can be viewed by looking at the console output
     from the script.

 To run the notification based examples:

 (1) Open the src/OffAmazonPaymentsService.config.properties file and fill out
     the merchant id, access key and secret key fields. Please also fill out
     LWA client id field if Login with Amazon service is available in your
     region. Also make sure that the environment and region keys are configured
     to the right values for your test.

 (2) Using ANT, run the war target on the included build script to create a war
     file bundle, and deploy it to a servlet container such as Tomcat

 (3) Login to seller central and setup the Instant Notification merchant URL on
     the Integration Settings page.  For the samples, the notification url will
     be http://<YOURHOSTNAME>(optional /<DIRECTORY>)/IpnHandler.php and this needs
     to be accessible to the internet for notification delivery to function.
     NOTE: Http connections are allowed only in the sandbox environment; all other
     environment require a https endpoint.

 (4) In your browser, navigate to the Samples.jsp file to execute the samples.

Using the client API:

  To make service calls from your application:
  
  (1) Include the com.amazonservices.offamazonpayments package

  (2) Create a new instance of the OffAmazonPaymentsServiceClient class - you will
      need to pass in an instance of the OffAmazonPaymentsServiceConfig class that
      can be initialized using the property file
      src/OffAmazonPaymentsService.config.properties.

  To handle notifications from your scripts:

  (1) Configure your webserver to accept incoming connections over HTTPS - the
      webserver based samples make use of notification processing which requires
      a HTTPS connection, and requires a server certificate that is signed by a
      trusted CA authority.  The listed of trusted CA authorities can be found at
      http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.https.ca.html

  (2) Include the com.amazonservices.offamazonpayments.ipn package

  (3) Create a new instance of the OffAmazonPaymentsNotificationsClient class

  (4) Read in the http headers and body in your script and invoke the method on
      the client class

  (5) If the client throws an NotificationsException, return a http status code
      of 500 to indicate that the notification cannot be processed. Otherwise
      return a http 200 code.
      
Note: When deploying the SDK packages to production systems, make sure that the
Samples directories are not deployed as they are not mandatory in order to use
the client code.
        
******************************************************************************
SUPPORT & PROJECT HOME
******************************************************************************
The latest documentation on the Login and Pay with Amazon can be found at the LINKS
section below:

US Amazon Seller Central: https://sellercentral.amazon.com
EU Amazon Seller Central: https://sellercentral-europe.amazon.com

 1. Login to the site and navigate to the integration central tab to view
    available resources.

