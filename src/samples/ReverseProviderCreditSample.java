/*******************************************************************************
 *  Copyright 2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at:
 *  http://aws.amazon.com/apache2.0
 *  This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *  CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the
 *  specific language governing permissions and limitations under the
 *  License.
 * *****************************************************************************
 * 
 *  Off Amazon Payments Service Java Library
 *  API Version: 2013-01-01
 * 
 */



package samples;

import java.io.PrintWriter;

import com.amazonservices.mws.offamazonpayments.*;
import com.amazonservices.mws.offamazonpayments.model.*;

import samples.utils.PropertyBundle;

/**
 *
 * Reverse Provider Credit  Samples
 *
 *
 */
public class ReverseProviderCreditSample {

    /**
     * Just add few required parameters, and try the service
     * Reverse Provider Credit functionality
     *
     * @param args unused
     */
     public static void main(String... args) {
        OffAmazonPaymentsServiceConfig config = new OffAmazonPaymentsServiceConfig(PropertyBundle.getProperties());			
		OffAmazonPaymentsService service = new OffAmazonPaymentsServiceClient(config);

        /************************************************************************
         * Setup request parameters and try out 
         * sample for Reverse Provider Credit 
         ***********************************************************************/
         ReverseProviderCreditRequest request = new ReverseProviderCreditRequest();
         request.setSellerId(config.getSellerId());
         
         ReverseProviderCreditResponse response = invokeReverseProviderCredit(service, request);
         PrintWriter outStream = new PrintWriter(System.out, true);
         printResponse(response, outStream);

    }


                                                                                    
    /**
     * Reverse Provider Credit  request sample
     * Activity to enable the Caller/Provider to reverse the funds credited to Provider.
     *   
     * @param service instance of OffAmazonPaymentsService service
     * @param request Action to invoke
     */
    public static ReverseProviderCreditResponse invokeReverseProviderCredit(OffAmazonPaymentsService service, ReverseProviderCreditRequest request) {
        try {    
            ReverseProviderCreditResponse response = service.reverseProviderCredit(request);            
            return response;            
        } catch (OffAmazonPaymentsServiceException ex) {     
            System.out.println("Caught Exception: " + ex.getMessage());
            System.out.println("Response Status Code: " + ex.getStatusCode());
            System.out.println("Error Code: " + ex.getErrorCode());
            System.out.println("Error Type: " + ex.getErrorType());
            System.out.println("Request ID: " + ex.getRequestId());
            System.out.println("XML: " + ex.getXML());
            System.out.println("ResponseHeaderMetadata: " + ex.getResponseHeaderMetadata());
            return null;
        }
    }
    
    /**
    * Method to print Reverse Provider Credit  response to console
     * Activity to enable the Caller/Provider to reverse the funds credited to Provider.
     * 
	*@param response instance of ReverseProviderCreditResponse
    */
    public static void printResponse(ReverseProviderCreditResponse response, PrintWriter outStream){
    
                
            outStream.println ("ReverseProviderCredit Action Response");
            outStream.println ("=============================================================================");
            outStream.println ();

            outStream.println("    ReverseProviderCreditResponse");
            outStream.println();
            if (response.isSetReverseProviderCreditResult()) {
                outStream.println("        ReverseProviderCreditResult");
                outStream.println();
                ReverseProviderCreditResult  reverseProviderCreditResult = response.getReverseProviderCreditResult();
                if (reverseProviderCreditResult.isSetProviderCreditReversalDetails()) {
                    outStream.println("            ProviderCreditReversalDetails");
                    outStream.println();
                    ProviderCreditReversalDetails  providerCreditReversalDetails = reverseProviderCreditResult.getProviderCreditReversalDetails();
                    if (providerCreditReversalDetails.isSetAmazonProviderCreditReversalId()) {
                        outStream.println("                AmazonProviderCreditReversalId");
                        outStream.println();
                        outStream.println("                    " + providerCreditReversalDetails.getAmazonProviderCreditReversalId());
                        outStream.println();
                    }
                    if (providerCreditReversalDetails.isSetSellerId()) {
                        outStream.println("                SellerId");
                        outStream.println();
                        outStream.println("                    " + providerCreditReversalDetails.getSellerId());
                        outStream.println();
                    }
                    if (providerCreditReversalDetails.isSetProviderId()) {
                        outStream.println("                ProviderId");
                        outStream.println();
                        outStream.println("                    " + providerCreditReversalDetails.getProviderId());
                        outStream.println();
                    }
                    if (providerCreditReversalDetails.isSetCreditReversalReferenceId()) {
                        outStream.println("                CreditReversalReferenceId");
                        outStream.println();
                        outStream.println("                    " + providerCreditReversalDetails.getCreditReversalReferenceId());
                        outStream.println();
                    }
                    if (providerCreditReversalDetails.isSetCreditReversalAmount()) {
                        outStream.println("                CreditReversalAmount");
                        outStream.println();
                        Price  creditReversalAmount = providerCreditReversalDetails.getCreditReversalAmount();
                        if (creditReversalAmount.isSetAmount()) {
                            outStream.println("                    Amount");
                            outStream.println();
                            outStream.println("                        " + creditReversalAmount.getAmount());
                            outStream.println();
                        }
                        if (creditReversalAmount.isSetCurrencyCode()) {
                            outStream.println("                    CurrencyCode");
                            outStream.println();
                            outStream.println("                        " + creditReversalAmount.getCurrencyCode());
                            outStream.println();
                        }
                    } 
                    if (providerCreditReversalDetails.isSetCreationTimestamp()) {
                        outStream.println("                CreationTimestamp");
                        outStream.println();
                        outStream.println("                    " + providerCreditReversalDetails.getCreationTimestamp());
                        outStream.println();
                    }
                    if (providerCreditReversalDetails.isSetCreditReversalStatus()) {
                        outStream.println("                CreditReversalStatus");
                        outStream.println();
                        Status  creditReversalStatus = providerCreditReversalDetails.getCreditReversalStatus();
                        if (creditReversalStatus.isSetState()) {
                            outStream.println("                    State");
                            outStream.println();
                            outStream.println("                        " + creditReversalStatus.getState());
                            outStream.println();
                        }
                        if (creditReversalStatus.isSetLastUpdateTimestamp()) {
                            outStream.println("                    LastUpdateTimestamp");
                            outStream.println();
                            outStream.println("                        " + creditReversalStatus.getLastUpdateTimestamp());
                            outStream.println();
                        }
                        if (creditReversalStatus.isSetReasonCode()) {
                            outStream.println("                    ReasonCode");
                            outStream.println();
                            outStream.println("                        " + creditReversalStatus.getReasonCode());
                            outStream.println();
                        }
                        if (creditReversalStatus.isSetReasonDescription()) {
                            outStream.println("                    ReasonDescription");
                            outStream.println();
                            outStream.println("                        " + creditReversalStatus.getReasonDescription());
                            outStream.println();
                        }
                    } 
                    if (providerCreditReversalDetails.isSetCreditReversalNote()) {
                        outStream.println("                CreditReversalNote");
                        outStream.println();
                        outStream.println("                    " + providerCreditReversalDetails.getCreditReversalNote());
                        outStream.println();
                    }
                } 
            } 
            if (response.isSetResponseMetadata()) {
                outStream.println("        ResponseMetadata");
                outStream.println();
                ResponseMetadata  responseMetadata = response.getResponseMetadata();
                if (responseMetadata.isSetRequestId()) {
                    outStream.println("            RequestId");
                    outStream.println();
                    outStream.println("                " + responseMetadata.getRequestId());
                    outStream.println();
                }
            } 
            outStream.println();
            outStream.println(response.getResponseHeaderMetadata());
            outStream.println();

    }
    
                            
}
