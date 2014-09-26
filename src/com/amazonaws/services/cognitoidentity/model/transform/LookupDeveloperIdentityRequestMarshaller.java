/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitoidentity.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cognitoidentity.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Lookup Developer Identity Request Marshaller
 */
public class LookupDeveloperIdentityRequestMarshaller implements Marshaller<Request<LookupDeveloperIdentityRequest>, LookupDeveloperIdentityRequest> {

    public Request<LookupDeveloperIdentityRequest> marshall(LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest) {
    if (lookupDeveloperIdentityRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<LookupDeveloperIdentityRequest> request = new DefaultRequest<LookupDeveloperIdentityRequest>(lookupDeveloperIdentityRequest, "AmazonCognitoIdentity");
        String target = "AWSCognitoIdentityService.LookupDeveloperIdentity";
        request.addHeader("X-Amz-Target", target);

        request.setHttpMethod(HttpMethodName.POST);
        request.setResourcePath("");
        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          jsonWriter.object();
          
            if (lookupDeveloperIdentityRequest.getIdentityPoolId() != null) {
                jsonWriter.key("IdentityPoolId").value(lookupDeveloperIdentityRequest.getIdentityPoolId());
            }
            if (lookupDeveloperIdentityRequest.getIdentityId() != null) {
                jsonWriter.key("IdentityId").value(lookupDeveloperIdentityRequest.getIdentityId());
            }
            if (lookupDeveloperIdentityRequest.getDeveloperUserIdentifier() != null) {
                jsonWriter.key("DeveloperUserIdentifier").value(lookupDeveloperIdentityRequest.getDeveloperUserIdentifier());
            }
            if (lookupDeveloperIdentityRequest.getMaxResults() != null) {
                jsonWriter.key("MaxResults").value(lookupDeveloperIdentityRequest.getMaxResults());
            }
            if (lookupDeveloperIdentityRequest.getNextToken() != null) {
                jsonWriter.key("NextToken").value(lookupDeveloperIdentityRequest.getNextToken());
            }

          jsonWriter.endObject();

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes(UTF8);
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", "application/x-amz-json-1.0");
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }
}
